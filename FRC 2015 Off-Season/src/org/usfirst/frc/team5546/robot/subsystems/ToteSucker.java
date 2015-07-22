package org.usfirst.frc.team5546.robot.subsystems;

import org.usfirst.frc.team5546.robot.RobotMap;
import org.usfirst.frc.team5546.robot.commands.SuckTote;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ToteSucker extends Subsystem {
    
	// Create motor controllers
	public static SpeedController counterLeft, counterRight;

    public ToteSucker() {
    	// Initialize components
    	counterLeft = new Talon(RobotMap.counterLeft);
    	counterRight = new Talon(RobotMap.counterRight);
    }
	
	public void initDefaultCommand() {
        setDefaultCommand(new SuckTote());
    }
    
    public void suckIn() {
    	counterLeft.set(1);
    	counterRight.set(1);
    }
    
    public void suckOut() {
    	counterLeft.set(-1);
    	counterRight.set(-1);
    }
    
    public void suckLeft() {
    	counterLeft.set(1);
    	counterRight.set(-1);
    }
    
    public void suckRight() {
    	counterLeft.set(-1);
    	counterRight.set(1);
    }
    
    public void stop() {
    	counterLeft.set(0);
    	counterRight.set(0);
    }
}

