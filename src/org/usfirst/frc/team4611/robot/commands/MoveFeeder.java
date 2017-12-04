package org.usfirst.frc.team4611.robot.commands;

import org.usfirst.frc.team4611.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MoveFeeder extends Command {

	private double speed;
	
	public MoveFeeder(double sp)
	{
		this.speed = sp; //Check negative or positive for direction of rotation
		//should spin clockwise
		this.requires(Robot.fe);
	}
	
	 // Called just before this Command runs the first time
    @Override
    protected void initialize() { 
    	Robot.fe.spin(0);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.fe.spin(speed); //Right now, these speeds go from -1 to 1, so we need to
        //absolute value the negatives and add a constant to them so that we can make the bottom 0, the 
        //middle 0.5, and the top 1
    }
    
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end() {
        Robot.fe.spin(0);
    }

//Should we have an end() method for the agitator, or is the shooter simply going to shoot non-stop?
}
