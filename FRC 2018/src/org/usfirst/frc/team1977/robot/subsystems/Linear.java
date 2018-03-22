package org.usfirst.frc.team1977.robot.subsystems;

import org.usfirst.frc.team1977.robot.commands.drive.UserDrive;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Linear extends Subsystem {
	
	
	public static Linear instance;
	//private Relay rollerMotor;
	private VictorSP rollerMotor;
	
	Linear(){
		rollerMotor = new VictorSP(1);
	}
	public static Linear getInstance() {
		if (instance == null) {
    			instance = new Linear();
    		}
    		return instance;
	}
	
	public void initDefaultCommand1() {
	       userLinear = new UserDrive();
	       setDefaultCommand(userDrive);
	} 
	
	public void goUp() {
		rollerMotor.set(-1);
	}
	
	public void goDown() {
		rollerMotor.set(1);
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
