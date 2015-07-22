package org.usfirst.frc.team5546.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    // USB
    public static int controller = 0;
    public static int leftJoystick = 1;
    public static int rightJoystick = 2;
    
    // Buttons
    public static int liftUpBtn = 1;
    public static int liftDownBtn = 2;
    public static int suckInBtn = 3;
    public static int suckOutBtn = 4;
    public static int suckLeftBtn = 5;
    public static int suckRightBtn = 6;
    public static int precisionBtn = 1;
    public static int speedBtn = 1;
    
    // DIO
    public static int topLimit = 0;
    public static int bottomLimit = 1;
    
    // PWM
    public static int leftDrive = 0;
    public static int rightDrive = 1;
    public static int liftA = 2;
    public static int liftB = 3;
    public static int counterLeft = 4;
    public static int counterRight = 5;
}
