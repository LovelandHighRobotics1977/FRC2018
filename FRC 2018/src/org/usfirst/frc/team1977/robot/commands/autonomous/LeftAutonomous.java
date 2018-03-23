package org.usfirst.frc.team1977.robot.commands.autonomous;

import org.usfirst.frc.team1977.robot.commands.drive.DriveSide;
import org.usfirst.frc.team1977.robot.commands.drive.DriveTime;
import org.usfirst.frc.team1977.robot.commands.drive.TurnTime;
import org.usfirst.frc.team1977.robot.commands.roller.RollerPush;
import org.usfirst.frc.team1977.robot.commands.roller.RollerTime;
import org.usfirst.frc.team1977.robot.subsystems.Autonomous;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftAutonomous extends CommandGroup{
	
private char switchPosition = Autonomous.getSwitchPosition();
	
	
	public LeftAutonomous() {
		addSequential(new DriveTime(0, -1, 750));
		addSequential(new DriveSide(0, 1, switchPosition == 'L'? 750: 2500));
		addSequential(new DriveTime(0, -.5, 1000));
		addSequential(new RollerPush());
	}
}
