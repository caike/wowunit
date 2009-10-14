package smallacts.wow.domain;

public class Character {

	private String mode = "idle";

	public String getMode() {
		return mode;
	}

	public void getsAttacked(String weapon) {
		if (isDangerous(weapon)) {
			reactToAttack();
		}
	}

	public void reactToAttack() {
		mode = adaptMode();
	}

	public String adaptMode() {
		if (mode.equals("idle"))
			return "combat";
		return "critical";
	}

	public boolean isDangerous(String weapon) {
		return Item.weaponList.contains(weapon);
	}

	public void setCombatMode() {
		mode = "combat";
	}

}