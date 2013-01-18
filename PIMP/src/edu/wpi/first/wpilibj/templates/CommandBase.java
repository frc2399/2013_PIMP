/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.templates.DriveTrain;
import edu.wpi.first.wpilibj.templates.OI;


/**
 *
 * @author Owner
 */
public abstract class CommandBase extends Command {
    public static OI oi;
    
    public static DriveTrain driveTrain = new DriveTrain();
    
    public static void init() {
    
        oi = new OI();
    }
    
    public CommandBase() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    
    
    
    

    
}
