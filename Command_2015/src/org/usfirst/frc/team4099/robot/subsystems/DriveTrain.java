
package org.usfirst.frc.team4099.robot.subsystems;

import org.usfirst.frc.team4099.robot.Robot;
import org.usfirst.frc.team4099.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoysticks());
    }

    public void slideDrive(double forward, double strafe){
        if(Math.abs(forward) > 0.1){
            Robot.setAllMotors(RobotMap.rightMotors, forward);       
            Robot.setAllMotors(RobotMap.leftMotors, forward);
        }

        if(Math.abs(strafe) > 0.1){
            Robot.setAllMotors(RobotMap.sliderMotors, strafe);
        }

    }

}

