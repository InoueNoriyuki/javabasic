package practice13.common;

public class SuperHero extends Hero {

	 Item equipment;

	public int attack() {
		return super.attack()+equipment.getAdditionaldamage();//←オーバーライド
	 }
	public Item getEquipment() {
		return this.equipment;
	}
	public void setEquipment(Item equipment) {
		this.equipment=equipment;
	}
}

