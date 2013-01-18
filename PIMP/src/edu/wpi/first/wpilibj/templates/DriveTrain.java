/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.MecDrive;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 * @author Owner
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    //#'s are not correct 
    //please check with gracie for port #'s
            Jaguar leftFront = new Jaguar(1);
            Jaguar leftRear = new Jaguar(2);
            Jaguar rightFront = new Jaguar(4);
            Jaguar rightRear = new Jaguar(3);
            
      public RobotDrive drive = new RobotDrive(leftFront, leftRear, rightFront, rightRear);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new MecDrive());
    }
}
