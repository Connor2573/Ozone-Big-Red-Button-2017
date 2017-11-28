package org.usfirst.frc.team4611.robot.commands;

import org.usfirst.frc.team4611.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TurretMoveManual extends Command{

	protected void execute(){
		double pPower = Robot.oi.filter(Robot.oi.turretJoy.getY());
		Robot.turret.move(pPower);
	}
	@Override
	protected boolean isFinished() {
		return false;
	}

}
