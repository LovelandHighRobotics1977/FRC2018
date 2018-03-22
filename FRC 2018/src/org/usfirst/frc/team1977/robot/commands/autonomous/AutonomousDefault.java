package org.usfirst.frc.team1977.robot.commands.autonomous;


import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team1977.robot.commands.drive.DriveTime;

import org.usfirst.frc.team1977.robot.commands.drive.TurnTime;


public class AutonomousDefault extends CommandGroup {
	private char switchPosition;
	
	
	public AutonomousDefault() {
		addSequential(new DriveTime(0, 1, 4000));
	}
	
}
