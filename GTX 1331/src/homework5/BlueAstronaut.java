package homework5;

public class BlueAstronaut extends Player implements Crewmate{
	private int numTasks;
	private int taskSpeed;
	
	public BlueAstronaut(String name) {
		super(name,15);
		numTasks = 6;
		taskSpeed = 10;
	}
	
	public BlueAstronaut(String name,int susLevel, int numTasks, int taskSpeed) {
		super(name,susLevel);
		this.numTasks = numTasks;
		this.taskSpeed = taskSpeed;
	}
	
	public int getNumTasks() {
		return numTasks;
	}
	
	public void setNumTasks(int numTasks) {
		this.numTasks = numTasks;
	}
	
	public int getTaskSpeed() {
		return taskSpeed;
	}
	
	public void setTaskSpeed(int taskSpeed) {
		this.taskSpeed = taskSpeed;
	}

	@Override
	public void emergencyMeeting() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
        String frozenString = isFrozen() ? "frozen" : "not frozen";
        if(getSusLevel() < 15){
        	return "My name is " + getName() + ", and I have a susLevel of "
                + getSusLevel() + ". I am currently " + frozenString + "." + " I have " + numTasks + " left over.";
        } else {
        	return ("My name is " + getName() + ", and I have a susLevel of "
                + getSusLevel() + ". I am currently " + frozenString + "." + " I have " + numTasks + " left over.").toUpperCase();
        }     
	}

	@Override
	public void completeTask() {
		// TODO Auto-generated method stub
		
	}
}