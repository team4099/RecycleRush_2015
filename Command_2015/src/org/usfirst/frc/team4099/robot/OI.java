package org.usfirst.frc.team4099.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team4099.robot.commands.ExampleCommand;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	// TEST COMMENT
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
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
    //
    
	/* Joystick Axes */
	public static final int LEFT_X_AXIS = 0;
	public static final int LEFT_Y_AXIS = 1;
	
	public static final int RIGHT_X_AXIS = 4;
	public static final int RIGHT_Y_AXIS = 5;
	
	/* Joystick Click (Buttons) */
	public static final int LEFT_JOYSTICK_BUTTON = 11;
	public static final int RIGHT_JOYSTICK_BUTTON = 12;
	
	/* Buttons (Right Side) */
	public static final int A_BUTTON = 1;
	public static final int B_BUTTON = 2;
	public static final int X_BUTTON = 3;
	public static final int Y_BUTTON = 4;
	
	/* DPAD */
	public static final int DPAD_NORTH = 0;
	public static final int DPAD_NORTHEAST = 45;
	public static final int DPAD_EAST = 90;
	public static final int DPAD_SOUTHEAST = 135;
	public static final int DPAD_SOUTH = 180;
	public static final int DPAD_SOUTHWEST = 225;
	public static final int DPAD_WEST = 270;
	public static final int DPAD_NORTHWEST = 315;
	
	/* Shoulder Buttons (Sit above the trigger axes) */
	public static final int LEFT_SHOULDER_BUTTON = 5;
	public static final int RIGHT_SHOULDER_BUTTON = 6;
	
	/* Trigger Axes */
	public static final int LEFT_TRIGGER_AXIS = 2;
	public static final int RIGHT_TRIGGER_AXIS = 3;
	
	Joystick gamepad = new Joystick(0);
	Joystick flight = new Joystick(1);
	
	public double getFlightSlider() {
		return flight.getRawAxis(3)-1;
	}

}

