package org.usfirst.frc.team1977.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team1977.robot.commands.drive.DriveTime;
import org.usfirst.frc.team1977.robot.commands.drive.TurnTime;
import org.usfirst.frc.team1977.robot.commands.roller.RollerTime;
import org.usfirst.frc.team1977.robot.subsystems.Autonomous;


public class MidAutonomous extends CommandGroup {
	private char switchPosition = Autonomous.getSwitchPosition();
	
	
	public MidAutonomous() {
		addSequential(new TurnTime(500, switchPosition == 'L'? 1 : -1));
		addSequential(new DriveTime(0, 1, 1000));
		addSequential(new TurnTime(500, switchPosition == 'L'? -1 : 1));
		addSequential(new DriveTime(0, 1, 3000));
		addSequential(new RollerTime(1500));
		
	}
	
}
