package org.usfirst.frc.team4099.robot;
import edu.wpi.first.wpilibj.Talon;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    public static final double REDUCTION_FACTOR = 1.5;
	public static final int FRONT_LEFT_MOTOR = 0;
	public static final int REAR_LEFT_MOTOR = 1;
	public static final int FRONT_RIGHT_MOTOR = 2;
	public static final int REAR_RIGHT_MOTOR = 3;
    public static final int FRONT_SLIDE_MOTOR = 4;
    public static final int REAR_SLIDE_MOTOR = 5;
    public static final int LEFT_ELEVATOR = 6;
    public static final int RIGHT_ELEVATOR = 7;

    public static final Talon[] sliderMotors = {new Talon(FRONT_SLIDE_MOTOR), new Talon(REAR_SLIDE_MOTOR)};
    public static final Talon[] rightMotors  = {new Talon(FRONT_RIGHT_MOTOR), new Talon(REAR_RIGHT_MOTOR)};
    public static final Talon[] leftMotors   = {new Talon(FRONT_LEFT_MOTOR),  new Talon(REAR_LEFT_MOTOR)};
    public static final Talon[] elevatorMotors = {new Talon(LEFT_ELEVATOR), new Talon(RIGHT_ELEVATOR)};
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
