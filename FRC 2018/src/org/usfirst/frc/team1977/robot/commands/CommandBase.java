package org.usfirst.frc.team1977.robot.commands;

import org.usfirst.frc.team1977.robot.OI;
import org.usfirst.frc.team1977.robot.subsystems.Autonomous;
import org.usfirst.frc.team1977.robot.subsystems.Drive;
import org.usfirst.frc.team1977.robot.subsystems.Grabber;
import org.usfirst.frc.team1977.robot.subsystems.Pneumatic;
import org.usfirst.frc.team1977.robot.subsystems.Rollers;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	/**
	 * Inherited static access to the OI.
	 */
	protected static OI oi;
	protected static Drive drive;
	protected static Pneumatic pneumatic;
	protected static Grabber grabber;
	protected static Rollers rollers;
	
	
	/**
	 * Initialize the CommandBase, in doing so accessing and initializing every
	 * primary subsystem on the robot. Use this during robot initialization to
	 * prevent unnecessary redundancy.
	 */
	
	public static void init() {
		System.out.println("CommandBase initializing");
		drive = Drive.getInstance();
		oi = OI.getInstance();
		pneumatic = Pneumatic.getInstance();
		grabber = Grabber.getInstance();
		rollers = Rollers.getInstance();
	}
}
