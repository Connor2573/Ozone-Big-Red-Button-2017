package org.usfirst.frc.team4611.robot.subsystems;

import org.usfirst.frc.team4611.robot.RobotMap;
import org.usfirst.frc.team4611.robot.commands.TurretMoveManual;

import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Turret extends Subsystem {
	
	public void move(double move){
		RobotMap.turretMotor.changeControlMode(TalonControlMode.PercentVbus);
		RobotMap.turretMotor.set(move);
	}
	
	public void rotate(double speed){
		RobotMap.turretMotor.changeControlMode(TalonControlMode.PercentVbus);
		RobotMap.turretMotor.set(speed);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TurretMoveManual());
	}

}
