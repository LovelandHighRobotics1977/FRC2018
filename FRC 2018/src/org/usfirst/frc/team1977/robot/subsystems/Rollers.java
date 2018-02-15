package org.usfirst.frc.team1977.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Relay

public class Rollers extends Subsystem {
	public static Rollers instance;
	ControlMode outputMode = ControlMode.PercentOutput;
	private Relay rollerMotor;
	
	public Rollers{rollerMotor = new Relay(1, Relay.kForward);}
	
	public static Rollers getInstance() {
		if (instance == null) {
    		instance = new Rollers();
    	}
    	return instance;
	}
	
	public void push() {
		double startTime = System.currentTimeMillis();
		rollerMotor.setDirection(Relay.kForward);
	}
	
	public void stop() {
		rollerMotor.stopMotor();
	}
}

//Probably will not work - based off of Grabber code which isn't working
