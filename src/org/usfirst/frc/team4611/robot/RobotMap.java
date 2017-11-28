package org.usfirst.frc.team4611.robot;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;

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
	
	public static CANTalon turretMotor;
	
	public static FeedbackDevice turretEncoder;
	
	//Joystick ports
	public static int leftJoyPort = 0; //Joystick can be found on this port. The ports aren't physical plugs
	public static int rightJoyPort = 1; //But rather decided from the drivers station by the drivers
	public static int turretJoyPort = 2;
	
	public static void init () {
		
		turretEncoder = (FeedbackDevice.CtreMagEncoder_Absolute);
		//PWM Ports
		//PWM ports are physically on the rio and the number on the port should match with the int in code
		driveTrainFL = new Victor(3);
		driveTrainFR = new Victor(0);
		driveTrainBL = new Victor(2);
		driveTrainBR = new Victor(1);
		
		//CAN Ports
		//CAN ports are decided via software in the roborio web interface 
		turretMotor = new CANTalon(11);
		turretMotor.setFeedbackDevice(turretEncoder);
		
		//Objects
		driveTrain =  new RobotDrive(driveTrainFL, driveTrainBL, driveTrainFR, driveTrainBR);
		
		//Constants
				
	}
}
