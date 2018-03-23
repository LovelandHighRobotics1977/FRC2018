/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1977.robot;

import org.usfirst.frc.team1977.robot.commands.drive.QuarterToggle;
import org.usfirst.frc.team1977.robot.commands.drive.SpeedToggle;
import org.usfirst.frc.team1977.robot.commands.drive.TurnTime;
import org.usfirst.frc.team1977.robot.commands.grabber.ArmPush;
import org.usfirst.frc.team1977.robot.commands.grabber.ArmRest;
import org.usfirst.frc.team1977.robot.commands.pneumatic.PneumaticDown;
import org.usfirst.frc.team1977.robot.commands.pneumatic.PneumaticUp;
import org.usfirst.frc.team1977.robot.commands.roller.RollerPush;
import org.usfirst.frc.team1977.robot.input.XBoxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	//Test
	private static OI instance;
	// XBox Controller references
	private XBoxController driveJoystick;
	private XBoxController otherJoystick;
	//Other joystick will be put here as well
	
	public OI() {
		driveJoystick = new XBoxController(0);
		otherJoystick = new XBoxController(1);
		
		//Set other controller here once we know if it is used 
		//manipulatorJoystick = new XBoxController(1);
	}
	
	public void init() {
		System.out.println("OI initializing");
		otherJoystick.yWhenPressed(new PneumaticUp());
		otherJoystick.aWhenPressed(new PneumaticDown());
	
		
		otherJoystick.xWhenPressed(new RollerPush());
		
		otherJoystick.leftWhileHeld(new ArmPush(50));
		
		otherJoystick.rightWhileHeld(new ArmRest(50));
		// Add later otherJoystick.leftWhenPressed(new ArmRest());
		// Add Later otherJoystick.rightWhenPressed(new ArmPush());
		driveJoystick.aWhenPressed(new SpeedToggle());
		driveJoystick.xWhenPressed(new QuarterToggle());
		//Put things here when you want buttons to trigger
		//Speed toggle
		//driveJoystick.leftWhenPressed(new SpeedToggle());
		//Turn functions for shoulders
		//driveJoystick.rightWhileHeld(new TurnTime(100,-1));
		//driveJoystick.leftWhileHeld(new TurnTime(100,1));
		//180 turn function
		//driveJoystick.bWhenPressed(new TurnTime(5000,1)); //THIS NEEDS TO BE Adjusted
	}
	
	public static OI getInstance() {
		if (instance == null) {
			instance = new OI();
		}
		return instance;
	}
	
	public XBoxController getDriveJoystick() {
		return driveJoystick;
	}
}
