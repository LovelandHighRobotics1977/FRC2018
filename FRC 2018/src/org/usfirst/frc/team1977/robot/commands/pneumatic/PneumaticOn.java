package org.usfirst.frc.team1977.robot.commands.pneumatic;

import org.usfirst.frc.team1977.robot.commands.CommandBase;

public class PneumaticOn extends CommandBase{
	long startTime;
	long endTime;
	long commandTime = 5000;
	
	public PneumaticOn() {
		requires(pneumatic);

	}
	
	protected void initialize() {

    }
	
	public void execute() {	
		pneumatic.startClosedLoop();	
	}
	
	protected boolean isFinished() {
		return true;
	}
	
	protected void interrupted() {
		
	}
	
	protected void end() {
		
	}
}
