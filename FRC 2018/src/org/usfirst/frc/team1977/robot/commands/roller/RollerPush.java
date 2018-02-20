package org.usfirst.frc.team1977.robot.commands.roller;

import org.usfirst.frc.team1977.robot.commands.CommandBase;

public class RollerPush extends CommandBase{
	long startTime;
	long endTime;
	long commandTime = 5000;
	public RollerPush() {
		requires(rollers);
		System.out.println("Roller is rolling");
	}
	protected void initialize() {
		startTime = System.currentTimeMillis();
    	endTime = startTime + commandTime;
    }
	
	public void execute() {	
		rollers.push();	
	}
	
	protected boolean isFinished() {
		return ( System.currentTimeMillis() >= endTime );
	}
	
	protected void interrupted() {
		rollers.stop();
	}
	
	protected void end() {
		rollers.stop();
	}
}
