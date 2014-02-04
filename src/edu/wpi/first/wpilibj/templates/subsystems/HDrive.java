/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoystick;
/**
 *
 * @author Casey
 */
public class HDrive extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive SideRails;
    Talon  Strafe1, Strafe2; 
    
    public HDrive(){
        SideRails = new RobotDrive(2,4,1,3);
        Strafe1 = new Talon(RobotMap.strafe1);
        Strafe2 = new Talon(RobotMap.strafe2);
    }
    
    public void drive(double yAxis, double Turn, double Strafe){
       SideRails.arcadeDrive(yAxis, Turn);
       SideRails.setSafetyEnabled(false);
        Strafe1.set(Strafe);
        Strafe2.set(Strafe);
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException ex) {
//            }
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoystick());
        
    }
}
