
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author Casey
 */
public class WingDeploy extends CommandBase {

    public WingDeploy() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(wings);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       if(oi.GetWingButton()) {
           wings.caught();
       } else{
           wings.shell();
       }  
 

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
