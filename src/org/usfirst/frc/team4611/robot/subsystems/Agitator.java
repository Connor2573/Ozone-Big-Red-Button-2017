package org.usfirst.frc.team4611.robot.subsystems;

import org.usfirst.frc.team4611.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Agitator extends Subsystem {

	private Spark agitator;
	
	public Agitator()
	{
		this.agitator = new Spark(RobotMap.agitatorPort);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void spin(double speed)
	{
		agitator.set(speed);
	}
}
