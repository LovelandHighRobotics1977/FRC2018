package org.usfirst.frc.team1977.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team1977.robot.commands.drive.DriveSide;
import org.usfirst.frc.team1977.robot.commands.drive.DriveTime;
import org.usfirst.frc.team1977.robot.commands.roller.RollerPush;
import org.usfirst.frc.team1977.robot.subsystems.Autonomous;


public class MidAutonomous extends CommandGroup {
	private char switchPosition = Autonomous.getSwitchPosition();
	
	
	public MidAutonomous() {
		addSequential(new DriveTime(0, -.5, 1000));
		addSequential(new DriveSide(0, switchPosition == 'L'? 1 : -1, 2500));
		addSequential(new DriveTime(-.5, -.5, 4500));
		addParallel(new RollerPush());
	}
	
}
