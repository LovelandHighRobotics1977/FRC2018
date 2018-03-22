package org.usfirst.frc.team1977.robot.subsystems;

public class Autonomous {
	private static char switchPosition;
	private static double sideForTime;
	private static double midForTime;
	private static double turnAmt;
	private static Autonomous instance;
	
	
	public static Autonomous getInstance() {
    	if (instance == null) {
    		instance = new Autonomous();
    	}
    	return instance;
    }
	
	public static void setSwitchPosition(char characterIn) {
		switchPosition = characterIn;
	}
	
	public static char getSwitchPosition(){
		return switchPosition;
	}
	
	public static double getSideForTime() {
		return sideForTime;
	}
	
	public static double getMidForTime() {
		return midForTime;
	}
	
	public static double getTurnAmt() {
		return turnAmt;
	}
	
	
}
