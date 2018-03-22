package org.usfirst.frc.team1977.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;

public class Rollers extends Subsystem {
	
	
	public static Rollers instance;
	//private Relay rollerMotor;
	private VictorSP rollerMotor;
	
	Rollers(){
		rollerMotor = new VictorSP(0);
	}
	public static Rollers getInstance() {
		if (instance == null) {
    		instance = new Rollers();
    	}
    	return instance;
	}
	
	public void push() {
		rollerMotor.set(-.30);
	}
	
	public void stop() {
		System.out.println(rollerMotor.get());
		rollerMotor.stopMotor();
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}


}

//Probably will not work - based off of Grabber code which isn't working
