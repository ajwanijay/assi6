package Animals;

import java.util.ArrayList;
import java.util.Collection;


public class AnimalHospital {
	private Collection<Pet> animals;
	public static final int MALE = 1, FEMALE = 2, SPAYED = 3, NEUTERED = 4;

	public AnimalHospital() {
		animals = new ArrayList<>();

		Cat c1 = new Cat("lucy", "john", "black", "5");
		c1.setSex(FEMALE);
		c1.setBoardStart(4, 22, 2016);
		c1.setBoardEnd(6, 22, 2016);

		Cat c2 = new Cat("meow", "jack", "red", "2");
		c2.setSex(FEMALE);
		c2.setBoardStart(4, 22, 2016);
		c2.setBoardEnd(3, 12, 2016);

		Cat c3 = new Cat("tom", "Aron", "white", "3");
		c3.setSex(MALE);
		c3.setBoardStart(4, 22, 2016);
		c3.setBoardEnd(7, 12, 2016);

		Cat c4 = new Cat("jojo", "walter", "blue", "4");
		c4.setSex(FEMALE);
		c4.setBoardStart(4, 22, 2016);
		c4.setBoardEnd(10, 23, 2016);

		Dog d1 = new Dog("bruno", "jim", "black", "4");
		d1.setSex(Pet.MALE);
		d1.setBoardStart(1, 1, 2016);
		d1.setBoardEnd(4, 1, 2016);

		Dog d2 = new Dog("goldy", "ned", "white", "5");
		d2.setSex(Pet.FEMALE);
		d2.setBoardStart(4, 1, 2016);
		d2.setBoardEnd(6, 1, 2016);

		Dog d3 = new Dog("moti", "arya", "red", "2");
		d3.setSex(Pet.MALE);
		d3.setBoardStart(3, 1, 2016);
		d3.setBoardEnd(5, 1, 2016);

		Dog d4 = new Dog("dude", "sansa", "blue", "6");
		d4.setSex(Pet.MALE);
		d4.setBoardStart(2, 1, 2016);
		d4.setBoardEnd(7, 1, 2016);

		animals.add(c1);
		animals.add(c2);
		animals.add(c3);
		animals.add(c4);

		animals.add(d1);
		animals.add(d2);
		animals.add(d3);
		animals.add(d4);

	}

	public void registerPet(Pet pet) {
		animals.add(pet);
	}

	void printPetInfoByName(String name) {
		System.out.println("Pets with name = " + name + ":\n");
		for (Pet p : animals) {
			if (p.getPetName().equals(name)) {
				System.out.println(p.toString() + "\n");
			}
		}
	}

	void printPetInfoByOwner(String name) {
		System.out.println(name + "'s pets:\n");
		for (Pet p : animals) {
			if (p.getOwnerName().equals(name)) {
				System.out.println(p.toString() + "\n");
			}
		}
	}

	void printPetsBoarding(int month, int day, int year) {
		System.out.println("Boarding:\n");
		for (Pet p : animals) {
			if (p instanceof Boardable) {
				if (((Boardable) p).boarding(month, day, year)) {
					System.out.println(p.toString() + "\n");
				}
			}
		}
	}

	public static void main(String args[]) {
		AnimalHospital ah = new AnimalHospital();
		ah.printPetInfoByName("lucy");
		ah.printPetInfoByOwner("sansa");
		ah.printPetsBoarding(1, 1, 2016);
	}

}