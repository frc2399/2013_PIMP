/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;



/**
 *
 * @author Owner
 */
public class OI {
    
    Joystick driveyStick = new Joystick(2);
    
    
    
    
    public double getForwardSpeed(){
        return driveyStick.getY();
    }
    //might need a "-"
    public double getSideSpeed(){
        return driveyStick.getX();
    }

    //if things dont work, question the "-"!
    public double getTwistSpeed() {
        return -driveyStick.getTwist();
    }
    
    
    
    
}
