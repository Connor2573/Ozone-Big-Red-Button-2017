package org.usfirst.frc.team4611.robot.commands;

import org.usfirst.frc.team4611.robot.Robot;
import org.usfirst.frc.team4611.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class FollowTargetDrive extends Command{

	double angle;
	double error;
	double target;
	double speed;
	
	public FollowTargetDrive(){
		this.requires(Robot.tankDrive);
	}
	
	protected void execute(){
		angle = Robot.visionTable.getNumber("angle", 0.0); //Pull angle from networktable
		this.error = this.angle - this.target; //How far are we from where we wanna be?
		this.speed = Math.abs(this.error) * 0.026; //Multiply that by a P value to get how fast we wanna react.
		System.out.println("Vision angle" + angle);
		System.out.println("Error:" + error);
		System.out.println("PID Adjustment:" + speed);
		
		if (speed < .20){ //Minimum speed of 20%
			if (angle > 0){
				Robot.tankDrive.rotate(.20, -1);
			}
			
			else {
				Robot.tankDrive.rotate(.20, 1);
			}
		}
		
		else {
			if (angle > 0) { //If speed is greater that 20%
				Robot.tankDrive.rotate(speed, -1); //Move left at that speed
			}
			
			else {
				Robot.tankDrive.rotate(speed, 1); //Move right at that speed
			}
		}
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}

}
