package org.usfirst.frc.team1977.robot.commands.pneumatic;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1977.robot.commands.CommandBase;
import org.usfirst.frc.team1977.robot.subsystems.Pneumatic;

public class TelePneumatic extends CommandBase {

	public TelePneumatic() {
		requires(pneumatic);
	}
	
	public void execute() {
		boolean downButton = oi.getDriveJoystick().getLeftShoulderValue();
		boolean upButton = oi.getDriveJoystick().getRightShoulderValue();
		while(downButton) {
			pneumatic.lower();
		}
		
		while(upButton) {
			pneumatic.raise();
		}
		
		pneumatic.stop();
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void interrupted() {
		pneumatic.stop();
	}
	
	protected void end() {
		pneumatic.stop();
	}
	

}
