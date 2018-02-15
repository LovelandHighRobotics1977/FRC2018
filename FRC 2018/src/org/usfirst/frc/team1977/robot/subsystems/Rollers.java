package org.usfirst.frc.team1977.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Rollers extends Subsystem {
	public static Rollers instance;
	ControlMode outputMode = ControlMode.PercentOutput;
	private TalonSRX rollerMotor;
	
	public Rollers{rollerMotor = new TalonSRX();}
	
	public static Rollers getInstance() {
		if (instance == null) {
    		instance = new Rollers();
    	}
    	return instance;
	}
	
	public void pushArm() {
		double startTime = System.currentTimeMillis();
		rollerMotor.set(outputMode, 1);
	}
	
	public void stop() {
		rollerMotor.set(outputMode, 0);
	}
}
