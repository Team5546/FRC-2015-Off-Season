package org.usfirst.frc.team5546.robot.commands;

import org.usfirst.frc.team5546.robot.OI;
import org.usfirst.frc.team5546.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive extends Command {
	
	int drive_mode = 0;

    public Drive() {
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	// Output speed to motor controllers
    	if(drive_mode == 0){
    		Robot.driveTrain.driveTank(OI.leftJoystick, OI.rightJoystick);
    	} else {
    		Robot.driveTrain.driveArcade(OI.rightJoystick);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {    	
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
