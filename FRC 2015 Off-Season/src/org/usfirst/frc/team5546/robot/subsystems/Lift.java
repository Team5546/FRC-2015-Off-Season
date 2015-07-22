package org.usfirst.frc.team5546.robot.subsystems;

import org.usfirst.frc.team5546.robot.OI;
import org.usfirst.frc.team5546.robot.RobotMap;
import org.usfirst.frc.team5546.robot.commands.MoveLift;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lift extends Subsystem {
	
	// Create motor controllers
	public static SpeedController liftA, liftB;
	
	public Lift() {
		// Initialize components
		liftA = new Talon(RobotMap.liftA);
		liftB = new Talon(RobotMap.liftB);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new MoveLift());
    }
    
    public void setLift(double speed) {
    	// If the top limit switch is on, and going up, set speed to 0
    	if(OI.topLimit.get()){
    		if(speed < 0){
    			speed = 0;
    		}
    	// Same with bottom
    	} else if(OI.bottomLimit.get()) {
    		if(speed > 0){
    			speed = 0;
    		}
    	}
    	
    	// Lower the speed if the precision button is pressed
    	if(OI.precisionBtn.get()) {
    		speed /= 2;
    	}
    	
    	// Go faster if the speed button is pressed
    	if(OI.speedBtn.get()) {
    		speed *= 2;
    	}
    	
    	// Push the final speed value to the motors
		liftA.set(speed);
    	liftB.set(speed);
    }
    
    public void stop() {
    	// Safely set the lift to 0 on stop
    	liftA.set(0);
    	liftB.set(0);
    }
}

