package org.usfirst.frc.team1977.robot.commands.autonomous;


import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team1977.robot.commands.drive.DriveTime;

public class AutonomousDefault extends CommandGroup {	
	
	public AutonomousDefault() {
		// Pause for 118 or any additional teams
		//addSequential(new DriveTime(0, 0, 10000);
		addSequential(new DriveTime(-1, -1, 2250));
	}
	
}
