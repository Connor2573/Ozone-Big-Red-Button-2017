package org.usfirst.frc.team4611.robot.subsystems;

import org.usfirst.frc.team4611.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Feeder extends Subsystem {

	private Victor feeder;
	
	public Feeder()
	{
		this.feeder= new Victor (RobotMap.feederPort);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void spin(double speed)
	{
		feeder.set(speed);
	}
}
