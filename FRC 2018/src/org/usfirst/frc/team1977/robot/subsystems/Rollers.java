package org.usfirst.frc.team1977.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Relay;

public class Rollers extends Subsystem {
	public static Rollers instance;
	private Relay rollerMotor;
	Rollers(){
	rollerMotor = new Relay(1);
	}
	public static Rollers getInstance() {
		if (instance == null) {
    		instance = new Rollers();
    	}
    	return instance;
	}
	
	public void push() {
		rollerMotor.set(Relay.Value.kForward);
	}
	
	public void stop() {
		rollerMotor.stopMotor();
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}


}

//Probably will not work - based off of Grabber code which isn't working
