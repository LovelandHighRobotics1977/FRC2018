package org.usfirst.frc.team1977.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Grabber extends Subsystem{
	public static Grabber instance;
	private final double armTime;
	ControlMode outputMode = ControlMode.PercentOutput;
	private TalonSRX rightArm;
	private TalonSRX leftArm;
	
	Encoder rightEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
	
	Encoder leftEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);

	DigitalInput limitSwitch = new DigitalInput(1);
    Counter counter = new Counter(limitSwitch);

	
	//This is not ok
	//Do not do this on future robot
	//add these to robot map once code pulled
	
	public Grabber(){
		armTime = 750;
		leftArm = new TalonSRX(10);
		rightArm = new TalonSRX(11);
		
		rightEncoder.setMaxPeriod(.1);
		rightEncoder.setMinRate(10);
		rightEncoder.setDistancePerPulse(5);
		rightEncoder.setReverseDirection(true);
		rightEncoder.setSamplesToAverage(7);
		
		leftEncoder.setMaxPeriod(.1);
		leftEncoder.setMinRate(10);
		leftEncoder.setDistancePerPulse(5);
		leftEncoder.setReverseDirection(true);
		leftEncoder.setSamplesToAverage(7);
	}
	
	
	public static Grabber getInstance() {
		if (instance == null) {
    		instance = new Grabber();
    	}
    		return instance;
	}
	
	public boolean isSwitchTriggered() {
        return counter.get() > 0;
    }

    public void initializeCounter() {
        counter.reset();
    }
	
	public void pushArm() {
		double startTime = System.currentTimeMillis();
		leftArm.set(outputMode, 1);
		rightArm.set(outputMode, -1);
		while(System.currentTimeMillis() > startTime + armTime){
			//do nothing
		}
		this.stop();
	}
	
	public void restArm() {
		double startTime = System.currentTimeMillis();
		leftArm.set(outputMode, -1);
		rightArm.set(outputMode, 1);
		while(System.currentTimeMillis() > startTime + armTime){
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
