
package org.usfirst.frc.team4099.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4099.robot.Robot;

/**
 *
 */
public class ElevatorMove extends CommandBase {

    public ElevatorMove() {
        requires(Robot.elevator);
        setTimeout(.9);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.elevator.move(Robot.oi.getSlider());
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
