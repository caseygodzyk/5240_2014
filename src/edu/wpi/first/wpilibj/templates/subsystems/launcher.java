
package edu.wpi.first.wpilibj.templates.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.templates.RobotMap;


/**
 *
 */
public class launcher extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Solenoid shoot1, shoot2, shoot3, shoot4, unshoot, deshoot, nshoot, noshoot;
    
    public launcher(){
        shoot1 = new Solenoid(RobotMap.mod1, RobotMap.shoot1);
        shoot2= new Solenoid(RobotMap.mod1, RobotMap.shoot2);
        shoot3 = new Solenoid(RobotMap.mod1, RobotMap.shoot3);
        shoot4 = new Solenoid(RobotMap.mod1, RobotMap.shoot4);
        unshoot = new Solenoid(RobotMap.mod1, RobotMap.deshoot1);
        deshoot = new Solenoid(RobotMap.mod1, RobotMap.deshoot2);
        nshoot = new Solenoid(RobotMap.mod1, RobotMap.deshoot3);
        noshoot= new Solenoid(RobotMap.mod1, RobotMap.deshoot4);
    }
    public void shoot(){
        shoot1.set(true);
        shoot2.set(true);
        shoot3.set(true);
        shoot4.set(true);
        unshoot.set(false);
        deshoot.set(false);
        nshoot.set(false);
        noshoot.set(false);
    }
    public void retract(){
        shoot1.set(false);
        shoot2.set(false);
        shoot3.set(false);
        shoot4.set(false);
        unshoot.set(true);
        deshoot.set(true);
        nshoot.set(true);
        noshoot.set(true);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

