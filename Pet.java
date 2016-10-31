package Animals;

public class Pet {

	private String PetName;
	private String OwnerName;
	private String Color;
	protected int sex;
	public static final int MALE = 1, FEMALE = 2, SPAYED = 3, NEUTERED = 4;

	public Pet(String name, String ownerName, String color) {
		this.PetName = name;
		this.OwnerName = ownerName;
		this.Color = color;

	}

	public String getPetName() {
		return PetName;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public String getColor() {
		return Color;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sexid) {
		this.sex = sexid;

	}

	public String toString() {

		return "" + PetName + "\n Owned by" + OwnerName + "\n color is:" + Color + "\n Sex is :"  + getSexStr(getSex());

	}

	public String getSexStr(int sexid) {
		String str = "";
		switch (sexid) {

		case 1:
			return "MALE";

		case 2:
			return "FEMALE";

		case 3:
			return "SPAYED";

		case 4:
			return "NEUTERED";

		default:
			return str;

		}

	}
}
