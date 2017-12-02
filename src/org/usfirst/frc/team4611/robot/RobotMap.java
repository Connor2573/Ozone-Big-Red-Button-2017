package org.usfirst.frc.team4611.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is where we declare what our constants are
 * It's where we set which PWM the Victors are plugged into and what ports are which joysticks etc.
 * This is where you're probably gonna end up when incorrect motors are running or we change ports for certain motors.
 */
public class RobotMap {
	

	public static RobotDrive driveTrain;
	
	public static Victor driveTrainFL;
	public static Victor driveTrainFR;
	public static Victor driveTrainBL;
	public static Victor driveTrainBR;
	
    public static final int leftShooterWheel = 4; //wheel ports
    public static final int rightShooterWheel = 5;
    
	public static int elevatorPort = 7; // port number needed PLEASE!!!
	public static int agitatorPort = 6; //CHECK PORT NUMBER PLEASE!!!
	
	public static int leftJoyPort = 0; //Joystick can be found on this port. The ports aren't physical plugs
	public static int rightJoyPort = 1; //But rather decided from the drivers station by the drivers
	public static int shootJoyPort = 2; //extra third shooting joystick
	

	public static double shooterSpeedLow = 0.7;
	public static double shooterSpeedMed = 0.8;
	public static double shooterSpeedHigh = 0.9;
	public static double shooterSpeedAll = 1.0;

	public static double elevatorSpeed = 0.2; //Double check speed

	
	public static void init () {
		
		//PWM Ports
		//PWM ports are physically on the rio and the number on the port should match with the int in code
		driveTrainFL = new Victor(3);
		driveTrainFR = new Victor(0);
		driveTrainBL = new Victor(2);
		driveTrainBR = new Victor(1);
		
		//CAN Ports
		//CAN ports are decided via software in the roborio web interface 
		
		//Objects
		driveTrain =  new RobotDrive(driveTrainFL, driveTrainBL, driveTrainFR, driveTrainBR);
		
		//Constants
				
	}
}
