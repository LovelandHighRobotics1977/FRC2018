package org.usfirst.frc.team1977.robot.subsystems;



import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;

public class Grabber extends Subsystem{
	public static Grabber instance;
	private final double armTime;
	ControlMode outputMode = ControlMode.PercentOutput;
	private TalonSRX rightArm;
	private TalonSRX leftArm;
	private Encoder encoderLeft = new Encoder(0,1, false, Encoder.EncodingType.k4X);
	private Encoder encoderRight = new Encoder(2,3, false, Encoder.EncodingType.k4X);

	//This is ok
	
	public Grabber(){
		armTime = 200;
		leftArm = new TalonSRX(10);
		rightArm = new TalonSRX(11);
		
		encoderLeft.setMaxPeriod(.1);
		encoderLeft.setMinRate(10);
		encoderLeft.setDistancePerPulse(5);
		encoderLeft.setReverseDirection(true);
		encoderLeft.setSamplesToAverage(7);
		
		encoderRight.setMaxPeriod(.1);
		encoderRight.setMinRate(10);
		encoderRight.setDistancePerPulse(5);
		encoderRight.setReverseDirection(false);
		encoderRight.setSamplesToAverage(7);
	}
	
	
	public static Grabber getInstance() {
		if (instance == null) {
    		instance = new Grabber();
    	}
    	return instance;
	}
	
	public void pushArm() {
		double startTime = System.currentTimeMillis();
		leftArm.set(outputMode, -0.1);
		rightArm.set(outputMode, 0.1);
		while(System.currentTimeMillis() < startTime + armTime){
			//do nothing
		}
		this.stop();
	}
	
	public void restArm() {
		double startTime = System.currentTimeMillis();
		leftArm.set(outputMode, 0.1);
		rightArm.set(outputMode, -0.1);
		while(System.currentTimeMillis() < startTime + armTime){
			//do nothing
		}
		this.stop();
	}
	
	public void stop() {
		leftArm.set(outputMode, 0);
		rightArm.set(outputMode, 0);
	}
	
	public double getEncoderRight() {
		return encoderRight.getDistance();
	}
	
	public double getEncoderLeft() {
		return encoderLeft.getDistance();
	}


	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
