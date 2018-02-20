package org.usfirst.frc.team1977.robot.commands.pneumatic;

import org.usfirst.frc.team1977.robot.commands.CommandBase;

public class PneumaticDown extends CommandBase{
	
	public PneumaticDown() {
		requires(pneumatic);
		System.out.println("Pneumatic going up!");
	}
	
	public void execute() {	
		pneumatic.raise();	
	}
	
	protected boolean isFinished() {
		return true;
	}
	
	protected void interrupted() {
		pneumatic.stop();
	}
	
	protected void end() {
		pneumatic.stop();
	}

}
