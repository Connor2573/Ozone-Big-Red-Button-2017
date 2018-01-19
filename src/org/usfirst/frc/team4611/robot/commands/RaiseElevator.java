package org.usfirst.frc.team4611.robot.commands;

import org.usfirst.frc.team4611.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.XboxController;

public class RaiseElevator extends Command {

	private double speed;
	
	public RaiseElevator(double sp)
	{
		this.speed = sp;
		this.requires(Robot.el);
	}
	
	// Called just before this Command runs the first time
    @Override
    protected void initialize() { 
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	System.out.println("Go!");
    	Robot.el.raise(speed);
    }
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end() {
        System.out.println("Stop!");
		Robot.el.raise(0);
    }

}
