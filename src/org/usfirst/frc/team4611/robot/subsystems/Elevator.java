package org.usfirst.frc.team4611.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {

	private Victor elevator;
	
	public Elevator(int port)
	{
		this.elevator = new Victor(port); // Check ports! PLEASE!!!
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
