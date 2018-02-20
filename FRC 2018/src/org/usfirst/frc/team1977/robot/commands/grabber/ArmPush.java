package org.usfirst.frc.team1977.robot.commands.grabber;

import org.usfirst.frc.team1977.robot.commands.CommandBase;


public class ArmPush extends CommandBase{
	private double armTime = 750;
	private double startTime;
    public ArmPush() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        requires(grabber);
        
        System.out.println("Setting arms to active position");
    }
    
 // Called just before this Command runs the first time
    protected void initialize() {
    		this.setTimeout(armTime);
    		this.startTime = System.currentTimeMillis();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		grabber.pushArm();
    }
	
	// Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    		return (System.currentTimeMillis() > startTime + armTime);
    }

    // Called once after isFinished returns true
    protected void end() {
    		grabber.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        grabber.stop();
    }
}