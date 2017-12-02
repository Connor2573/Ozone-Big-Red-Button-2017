package org.usfirst.frc.team4611.robot;



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
	public Joystick shootJoy;
	
	public Button driveTrack;
	public Button wheelSpeedLow;
	public Button wheelSpeedMed;
	public Button wheelSpeedHigh;
	public Button wheelSpeedAll;
	public Button spinAgitator;
	
	public OI (){
		leftJoy = new Joystick(RobotMap.leftJoyPort); //The left joystick exists on this port in robot map
		rightJoy = new Joystick(RobotMap.rightJoyPort); //The right joystick exists on this port in robot map
		
		driveTrack = new JoystickButton(leftJoy, 1);
		wheelSpeedLow = new JoystickButton(shootJoy, 2); //.70 power; the next 3 button placements need CHECKED!
		this.wheelSpeedLow.toggleWhenPressed(new ShooterWheelsMove(RobotMap.shooterSpeedLow));
		wheelSpeedMed = new JoystickButton(shootJoy, 3); //.80 power
		this.wheelSpeedMed.toggleWhenPressed(new ShooterWheelsMove(RobotMap.shooterSpeedMed));
		wheelSpeedHigh = new JoystickButton(shootJoy, 4); // .90 powers
		this.wheelSpeedHigh.toggleWhenPressed(new ShooterWheelsMove(RobotMap.shooterSpeedHigh));
		wheelSpeedAll = new JoystickButton(shootJoy, 5); // 1.0 power
		this.wheelSpeedAll.toggleWhenPressed(new ShooterWheelsMove(RobotMap.shooterSpeedAll));
		spinAgitator = new JoystickButton(shootJoy, 6); // Button for spinning the agitator
		this.spinAgitator.toggleWhenPressed(new SpinAgitator(RobotMap.agitatorSpeed));
	}
	
	public double filter(double raw) //We pass joystick values through the filter here and edit the raw value
    {
        if (Math.abs(raw) < .15) {
            return 0; //If the value passed is less than 15% ignore it. This is reffered to as a deadzone
        } else {
            return  raw * 0.7; //Set the output to a ceratin percent of of the input
        }
    }
}
