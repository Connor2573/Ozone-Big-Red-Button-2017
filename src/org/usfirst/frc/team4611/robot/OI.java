package org.usfirst.frc.team4611.robot;



import org.usfirst.frc.team4611.robot.commands.RaiseElevator;
import org.usfirst.frc.team4611.robot.commands.ShooterWheelsMove;
import org.usfirst.frc.team4611.robot.commands.SpinAgitator;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This is where we create all of out buttons and joysticks and 
 * set up the "UI" of the bot for the drivers. You're gonna end up 
 * here a lot when people complain about buttons needing to be changed
 */

public class OI {
	public Joystick leftJoy;
	public Joystick rightJoy;
	public Joystick shootJoy; //changed values for testing
	
	//public Button driveTrack;
	public Button wheelSpeedAll;
	public Button spinAgitator;
	public Button raiseElevator;
	
	public OI (){
		leftJoy = new Joystick(RobotMap.leftJoyPort); //The left joystick exists on this port in robot map
		rightJoy = new Joystick(RobotMap.rightJoyPort); //The right joystick exists on this port in robot map
		shootJoy = new Joystick(RobotMap.shootJoyPort);
		
		//driveTrack = new JoystickButton(leftJoy, 1); What?
		
		wheelSpeedAll = new JoystickButton(shootJoy, 1);//button 10 on right
		this.wheelSpeedAll.toggleWhenPressed(new ShooterWheelsMove(RobotMap.shooterSpeedAll));//full power
		
		spinAgitator = new JoystickButton(shootJoy, 2); //button 7 on left
		this.spinAgitator.toggleWhenPressed(new SpinAgitator(RobotMap.agitatorSpeed));
		
		raiseElevator = new JoystickButton(shootJoy, 3); //button 11 on leftjoy
		this.raiseElevator.whileHeld(new RaiseElevator(RobotMap.elevatorSpeed));
	}
	
	public double filter(double raw) //We pass joystick values through the filter here and edit the raw value
    {
        if (Math.abs(raw) < .20) {
            return 0; //If the value passed is less than 15% ignore it. This is reffered to as a deadzone
        } else {
            return  raw * 0.7; //Set the output to a ceratin percent of of the input
        }
    }
}
