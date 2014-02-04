
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 */
public class Wings extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
  
    Solenoid catcher;
    Solenoid shell;
    
    public Wings(){
        catcher = new Solenoid(RobotMap.mod2, RobotMap.wing);
        shell = new Solenoid(RobotMap.mod2, RobotMap.shell);
        }
    public void caught(){
        catcher.set(true);
        shell.set(false);
    }
    public void shell(){
        catcher.set(false);
        shell.set(true);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

