package org.usfirst.frc.team1977.robot.commands.autonomous;

import org.usfirst.frc.team1977.robot.commands.drive.DriveTime;
import org.usfirst.frc.team1977.robot.commands.drive.TurnTime;
import org.usfirst.frc.team1977.robot.commands.roller.RollerTime;
import org.usfirst.frc.team1977.robot.subsystems.Autonomous;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightAutonomous extends CommandGroup{
	
private char switchPosition = Autonomous.getSwitchPosition();
	
	
	public RightAutonomous() {
		addSequential(new DriveTime(0, 1, 4000));
		if (switchPosition == 'R') {
			addSequential(new TurnTime(500, -1));
			addSequential(new DriveTime(0, 1, 750));
			addSequential(new RollerTime(1500));
		}
		
		else {
			addSequential(new DriveTime(0, 1, 1000));
			addSequential(new TurnTime(500, -1));
			addSequential(new DriveTime(0, 1, 6000));
			addSequential(new TurnTime(500, -1));
			addSequential(new DriveTime(0, 1, 750));
			addSequential(new RollerTime(1500));
		}
	}
}
