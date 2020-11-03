class Weapon {
	private String name;
	private int maxDamage;
	
	//default constructor
	public Weapon() {
		name = "Pointy Stick";
		maxDamage = 1;
	}
	//overloaded constructor
	public Weapon(String name, int maxDamage) {
		this.name = name;
		this.maxDamage = maxDamage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxDamage() {
		return maxDamage;
	}
	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}
}
