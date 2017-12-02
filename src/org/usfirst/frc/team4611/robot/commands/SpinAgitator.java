package org.usfirst.frc.team4611.robot.commands;

import org.usfirst.frc.team4611.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpinAgitator extends Command {

	private double speed;
	
	public SpinAgitator(double sp)
	{
		this.speed = sp;
		this.requires(Robot.ag);
	}
	
	 // Called just before this Command runs the first time
    @Override
    protected void initialize() { 
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.ag.spin(this.speed);
    }
    
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}