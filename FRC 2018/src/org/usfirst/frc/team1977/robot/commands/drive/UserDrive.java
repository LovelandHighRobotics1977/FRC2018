package org.usfirst.frc.team1977.robot.commands.drive;

import org.usfirst.frc.team1977.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.Joystick;

public class UserDrive extends CommandBase {
	//Time for 180 degree turn
	
	public UserDrive() {
		requires(drive);
	}
	
	protected void execute() {
//		final double armTime = 750;
//		double startTime; 
		double hPower = oi.getDriveJoystick().getLeftX();
		double vPower = oi.getDriveJoystick().getLeftY();
		
		double turn = (oi.getDriveJoystick().getLeftTriggerAxis() * 0.5)
				- (oi.getDriveJoystick().getRightTriggerAxis() * 0.5);
		
		if (Math.abs(hPower) < .2) {
			hPower = 0;
		}

		if (Math.abs(vPower) < .2) {
			vPower = 0;
		}

		if (Math.abs(turn) < .2) {
			turn = 0;
		}
		drive.drive(hPower, -vPower, -turn);
		//drive.drive(hPower, vPower, turn);
		/*boolean downButton = oi.getDriveJoystick().getLeftShoulderValue();
		boolean upButton = oi.getDriveJoystick().getRightShoulderValue();
		if(downButton) {
			pneumatic.lower();
		}
		
		else if(upButton) {
			pneumatic.raise();
		}
		
		else {
			pneumatic.stop();
		}
		boolean pushState = oi.getDriveJoystick().getAButtonValue();
		boolean restState = oi.getDriveJoystick().getXButtonValue();
		
		if(pushState) {
			grabber.pushArm();
		}
		else if(restState) {
			grabber.restArm();
		}*/
	}
	
	// Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    		drive.stop();
    		pneumatic.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    		drive.stop();
    		pneumatic.stop();
    }
}
