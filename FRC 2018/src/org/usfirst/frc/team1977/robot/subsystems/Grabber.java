package org.usfirst.frc.team1977.robot.subsystems;

import org.usfirst.frc.team1977.robot.commands.grabber.TeleGrabber;
import org.usfirst.frc.team1977.robot.commands.pneumatic.TelePneumatic;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Grabber extends Subsystem{
	public static Grabber instance;
	private TeleGrabber teleGrabby;
	private final double armTime;
	ControlMode outputMode = ControlMode.PercentOutput;
	private TalonSRX leftArm;
	private TalonSRX rightArm;
	//add these to robot map once code pulled
	leftArm = new TalonSRX(10);
	rightArm = new TalonSRX(11);
	

	
	Grabber(){
		armTime = 750;
	}
	
	public void initDefaultCommand(){
		teleGrabby = new TeleGrabber();
	    setDefaultCommand(teleGrabby);
	}
	
	public static Grabber getInstance() {
		if (instance == null) {
    		instance = new Grabber();
    	}
    	return instance;
	}
	
	public void pushArm() {
		double startTime = System.currentTimeMillis();
		leftArm.set(outputMode, 1);
		rightArm.set(outputMode, -1);
		while(System.currentTimeMillis() > startTime + armTime)){
			//do nothing
		}
		this.stop();
	}
	
	public void restArm() {
		double startTime = System.currentTimeMillis();
		leftArm.set(outputMode, -1);
		rightArm.set(outputMode, 1);
		while(System.currentTimeMillis() > startTime + armTime)){
			//do nothing
		}
		this.stop();
	}
	
	public void stop() {
		leftArm.set(outputMode, 0);
		rightArm.set(outputMode, 0);
	}
}
