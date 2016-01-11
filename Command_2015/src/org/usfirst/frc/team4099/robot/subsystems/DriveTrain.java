
package org.usfirst.frc.team4099.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void slideDrive(double forward, double strafe){
        if(Math.abs(forward) > 0.1){
            Robot.setAllMotors(rightMotors, forward);       
            Robot.setAllMotors(leftMotors, forward);
        }

        if(Math.abs(strafe) > 0.1){
            Robot.setAllMotors(sliderMotors, strafe);
        }

    }

}

