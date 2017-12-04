package org.usfirst.frc.team4611.robot.subsystems;

import org.usfirst.frc.team4611.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {

	private Victor elevator;
	
	public Elevator()
	{
		this.elevator = new Victor(RobotMap.elevatorPort); 
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void raise(double speed)
	{
		elevator.set(speed);
	}
}
