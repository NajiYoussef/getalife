package cours01;

public class Animal {

	public Animal(String species, String name, int age) {

		this.species = species;
		this.name = name;
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	private String species;
	private String name;
	private int age;
	private double weight;
	private double height;
	private String color;

	public void sleep() {}
	public void move() {}
	public void eat() {}

	public static void main(String[] args) {
		Animal felix = new Animal();
		felix.name = "felix";
		felix.species ="chat";
		felix.age = 5 ;
		felix.height = 50;
		felix.weight =3;
		felix.color = "fauve";

		Animal milou = new Animal();
		milou.name = "milou";
		milou.species = "chien";
		milou.age =7;
		milou.height = 80;
		milou.weight= 8;
		milou.color="blanc";



	}
	public Animal() {

	}

}
