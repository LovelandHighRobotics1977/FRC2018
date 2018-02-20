package org.usfirst.frc.team1977.robot.commands.roller;

import org.usfirst.frc.team1977.robot.commands.CommandBase;

public class RollerPush extends CommandBase{
	public RollerPush() {
		requires(rollers);
		System.out.println("Roller is rolling");
	}
	protected void initialize() {

    }
	
	public void execute() {	
		rollers.push();	
	}
	
	protected boolean isFinished() {
		return true;
	}
	
	protected void interrupted() {
		rollers.stop();
	}
	
	protected void end() {
		rollers.stop();
	}
}
