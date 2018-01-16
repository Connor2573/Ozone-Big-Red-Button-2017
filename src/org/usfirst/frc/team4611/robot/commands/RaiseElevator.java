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
    	if(Robot.oi.controller.getAButtonPressed())
    	{
    		System.out.println("Go!");
    	}
    	else if(Robot.oi.controller.getAButtonReleased())
    		System.out.println("Stop!");
    }
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end() {
        Robot.el.raise(0);
    }

}
