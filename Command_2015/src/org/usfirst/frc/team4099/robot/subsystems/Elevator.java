
package org.usfirst.frc.team4099.robot.subsystems;

import org.usfirst.frc.team4099.robot.Robot;
import org.usfirst.frc.team4099.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
	
	public static final double ELEVATOR_MAX = 80.0;
	public static final double ELEVATOR_MIN = 0.0;
	public static final double REDUCTION_FACTOR = -1;
    
	Talon[] motors = RobotMap.elevatorMotors;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ElevatorMove());
    }
    
    public void move(float pow) {
    	Robot.setAllMotors(motors, pow);
    }
}

