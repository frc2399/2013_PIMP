/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

/**
 *
 * @author Owner
 */
public class MecDrive extends CommandBase {
    
    private double speed;
    
    public MecDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(CommandBase.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //reduced speed to 25% original
        //we are scared of full speed
        //dont blame us
        //it is terrifying
        //and we have our reasons
        driveTrain.drive.mecanumDrive_Cartesian(0.25 * oi.getSideSpeed(), 0.25 * oi.getForwardSpeed(), 0.25 * oi.getTwistSpeed(), 0);
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
