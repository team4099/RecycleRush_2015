
package org.usfirst.frc.team4099.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
	
	public static final double ELEVATOR_MAX = 80.0;
	public static final double ELEVATOR_MIN = 0.0;
	public static final double REDUCTION_FACTOR = -1;
    
	Talon left = RobotMap.leftElevator;
	Talon right = RobotMap.rightElevator;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void move(float pow) {
    	left.set(pow/REDUCTION_FACTOR);
    	right.set(pow/REDUCTION_FACTOR);
    }
}

