package org.usfirst.frc.team1977.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Grabber extends Subsystem{
	public static Grabber instance;
	private final double armTime;
	ControlMode outputMode = ControlMode.PercentOutput;
	private TalonSRX rightArm;
	private TalonSRX leftArm;

	//This is not ok
	//Do not do this on future robot
	//add these to robot map once code pulled
	
	public Grabber(){
		armTime = 1000.000001;
		leftArm = new TalonSRX(10);
		rightArm = new TalonSRX(11);
	}
	
	
	public static Grabber getInstance() {
		if (instance == null) {
    		instance = new Grabber();
    	}
    	return instance;
	}
	
	public void pushArm() {
		double startTime = System.currentTimeMillis();
		leftArm.set(outputMode, -0.5);
		rightArm.set(outputMode, 0.5);
		while(System.currentTimeMillis() < startTime + armTime){
			//do nothing
		}
		this.stop();
	}
	
	public void restArm() {
		double startTime = System.currentTimeMillis();
		leftArm.set(outputMode, 0.5);
		rightArm.set(outputMode, -0.5);
		while(System.currentTimeMillis() < startTime + armTime){
			//do nothing
		}
		this.stop();
	}
	
	public void stop() {
		leftArm.set(outputMode, 0);
		rightArm.set(outputMode, 0);
	}


	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
