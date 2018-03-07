package org.usfirst.frc.team1977.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Winch extends Subsystem {
	private TalonSRX winchMotor;
	public static Winch instance;
	ControlMode outputMode = ControlMode.PercentOutput;
	
	public Winch() {
		winchMotor = new TalonSRX(5);//Need to set actual ID, 5 is a placeholder
	}
	
	public static Winch getInstance() {
		if (instance == null) {
    		instance = new Winch();
    	}
    	return instance;
	}
	
	public void windUp() {
		winchMotor.set(outputMode, 1);
	}
	
	public void windDown() {
		winchMotor.set(outputMode, -1);
	}
	
	public void stop() {
		winchMotor.set(outputMode, 0);
	}

	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
