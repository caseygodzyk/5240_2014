
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 */
public class intake extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Solenoid intake;
    Solenoid outTake;
    Victor roller;
    public intake(){
        intake = new Solenoid(5);
        outTake = new Solenoid(6);
        roller = new Victor(7);
        
    }
    public void in(){
    intake.set(true);
    outTake.set(false);
    roller.set(1);
            }
    public void notIn(){
        intake.set(false);
        outTake.set(true);
        roller.set(0);
    }
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException ex) {
//            }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

