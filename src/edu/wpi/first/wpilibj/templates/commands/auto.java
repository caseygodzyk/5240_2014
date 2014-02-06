
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author Casey
 */
public class auto extends CommandBase {

    public auto() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
     //   addSequential(new launchButton());
        requires(wings);
        requires(launch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
           wings.caught();
           launch.shoot();
 

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
