package org.usfirst.frc.team4611.robot.commands;

import org.usfirst.frc.team4611.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TurretTracking extends Command{

	double angle;
	double error;
	double target;
	double speed;
	
	public TurretTracking(){
		this.requires(Robot.turret);
	}
	
	protected void execute(){
		angle = Robot.visionTable.getNumber("angle", 0.0);
		this.error = this.angle - this.target; //How far are we from where we wanna be?
		this.speed = this.error * 0.0166667; //Multiply that by a P value to get how fast we wanna react.
		
		if (Math.abs(speed) < 20){
			
			if (angle < 0){
				Robot.turret.rotate(.20);
			}
			
			else {
				Robot.turret.rotate(-.20);
			}
		}
		
		else {
				Robot.turret.rotate(speed);
			}
		}

	
	@Override
	protected boolean isFinished() {
		return false;
	}

}
