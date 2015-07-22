package org.usfirst.frc.team5546.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	// Controllers
	public static Joystick leftJoystick = new Joystick(RobotMap.leftJoystick);
	public static Joystick rightJoystick = new Joystick(RobotMap.rightJoystick);
	public static Joystick controller = new Joystick(RobotMap.controller);
	
	// Buttons
	public static JoystickButton 	liftUpBtn,
									liftDownBtn,
									suckInBtn,
									suckOutBtn,
									suckLeftBtn,
									suckRightBtn,
									precisionBtn,
									speedBtn;
	
	// DIO
	public static DigitalInput 		topLimit,
									bottomLimit;
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	public OI() {
		
		// Controllers
		leftJoystick	= new Joystick(RobotMap.leftJoystick);
		rightJoystick	= new Joystick(RobotMap.rightJoystick);
		controller		= new Joystick(RobotMap.controller);
		
		// Buttons
		liftUpBtn		= new JoystickButton(controller,	1);
		liftDownBtn		= new JoystickButton(controller,	2);
		suckInBtn		= new JoystickButton(controller,	3);
		suckOutBtn		= new JoystickButton(controller,	4);
		suckLeftBtn		= new JoystickButton(controller,	5);
		suckRightBtn	= new JoystickButton(controller,	6);
		precisionBtn	= new JoystickButton(rightJoystick,	1);
		speedBtn		= new JoystickButton(leftJoystick,	1);
		
		// DIO
		topLimit 		= new DigitalInput(RobotMap.topLimit);
		bottomLimit 	= new DigitalInput(RobotMap.bottomLimit);
		
	}
}

