package org.usfirst.frc.team5546.robot.subsystems;

import org.usfirst.frc.team5546.robot.RobotMap;
import org.usfirst.frc.team5546.robot.commands.Drive;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

	// Create motor controllers and RobotDrive
	public static SpeedController leftDrive, rightDrive;
	public static RobotDrive drive;
	
	public DriveTrain() {
		// Initialize components
		leftDrive = new Talon(RobotMap.leftDrive);
		rightDrive = new Talon(RobotMap.leftDrive);
		drive = new RobotDrive(leftDrive, rightDrive);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }
    
    public void driveTank(GenericHID left_joystick, GenericHID right_joystick) {
    	drive.tankDrive(left_joystick, right_joystick);
    }
    
    public void driveArcade(GenericHID joystick) {
    	drive.arcadeDrive(joystick);
    }
    
    public void stop() {
    	drive.stopMotor();
    }
}

