package homework5;
import java.util.Arrays;

public class RedAstronaut extends Player implements Impostor{
	private String skill;
	private static String SKILL_LV1 = "inexperienced";
	private static String SKILL_LV2 = "expert";
	private static String SKILL_LV3 = "experienced";
	
	public RedAstronaut(String name) {
		super(name,15);
		skill = SKILL_LV3;
	}
	
	public RedAstronaut(String name, int susLevel, String skill) {
		super(name,susLevel);
		this.skill = skill.toLowerCase();
	}
	
	public String getSkill() {
		return skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	@Override
	public void emergencyMeeting() {
		Arrays.sort(getPlayers());
		if (isFrozen() == false) {
			
		}
	}

	@Override
	public void freeze(Player p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sabotage(Player p) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Player) {
			Player player = (Player) o;
			if (this.getName().equals(player.getName()) &&
				this.isFrozen() == player.isFrozen() && 
				this.getSusLevel() == player.getSusLevel() &&
				this.skill.equals(skill)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
        String frozenString = isFrozen() ? "frozen" : "not frozen";
        if(getSusLevel() < 15){
        	return "My name is " + getName() + ", and I have a susLevel of "
                + getSusLevel() + ". I am currently " + frozenString + "." + " I am an " + skill + " player!";
        } else {
        	return ("My name is " + getName() + ", and I have a susLevel of "
                + getSusLevel() + ". I am currently " + frozenString + "." + " I am an " + skill + " player!").toUpperCase();
        }   
    
	}

}
