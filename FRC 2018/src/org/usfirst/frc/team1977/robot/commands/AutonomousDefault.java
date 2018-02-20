package org.usfirst.frc.team1977.robot.commands;

import org.usfirst.frc.team1977.robot.commands.pneumatic.PneumaticOn;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousDefault extends CommandGroup {
	public AutonomousDefault() {
		addSequential(new PneumaticOn());
		
	}
}
