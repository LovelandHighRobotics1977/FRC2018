package org.usfirst.frc.team1977.robot.commands;

import org.usfirst.frc.team1977.robot.commands.pneumatic.PneumaticOn;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team1977.robot.commands.drive.DriveTime;

import org.usfirst.frc.team1977.robot.commands.drive.TurnTime;


public class AutonomousDefault extends CommandGroup {
	public AutonomousDefault() {
		addSequential(new PneumaticOn());
		addSequential(new DriveTime(0, 1, 2000));
		addSequential(new TurnTime(500, 1));
		addSequential(new DriveTime(0, 1, 1000));
	}
	
	public void autonomousDirection(char characterIn) {
		
		
		
	}
}
