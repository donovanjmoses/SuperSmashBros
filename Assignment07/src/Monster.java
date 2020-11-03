class Monster {
	private String name;
	private int healthScore;
	private Weapon weapon;
	//overloaded constructor
	public Monster(String name, int healthScore, Weapon weapon) {
		this.name = name;
		this.healthScore = healthScore;
		this.weapon = weapon;
	}
	public String getName() {
		return this.name;
	}
	public int getHealthScore() {
		return this.healthScore;
	}
	public int resetHealthScore(Monster monster) {
		while (this.healthScore < 200) {
			this.healthScore += 1;
		}
		return this.healthScore;
	}
	public String getWeaponName() {
		return this.weapon.getName();
	}
	public int attack(Monster monster) {
		int damage = (int) (Math.random() * this.weapon.getMaxDamage());
		monster.healthScore -= damage;
		return damage;
	}
}