package org.usfirst.frc.team1977.robot.subsystems;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatic extends Subsystem{
	public static Pneumatic instance;
	private Compressor compressor1;
	DoubleSolenoid piston1;

	
	Pneumatic(){
		piston1 = new DoubleSolenoid(6, 7);
		compressor1 = new Compressor(0);
		compressor1.setClosedLoopControl(true);
	}
	
	
	public static Pneumatic getInstance() {
		if (instance == null) {
    		instance = new Pneumatic();
    	}
    	return instance;
	}
	
	public void raise() {
		piston1.set(DoubleSolenoid.Value.kForward);
	}
	
	public void lower() {
		piston1.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void stop() {
		piston1.set(DoubleSolenoid.Value.kOff);;
	}
	
	public void startClosedLoop(){
		compressor1.setClosedLoopControl(true);
	}
	
	public void stopCompressor() {
		compressor1.stop();
		
	}


	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
