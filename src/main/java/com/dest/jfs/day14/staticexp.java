package com.dest.jfs.day14;
class Dog{
	static String name;
	static String color;
	static String breed;
	static int age;
	static int cost;

	static void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(cost);
	}
	static void allocate() {
		name="king";
		color="black";
		breed="foreign";
		cost=4000;
		age=2;
	}
}

public class staticexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Dog.name);
		System.out.println(Dog.color);
		System.out.println(Dog.breed);
		System.out.println(Dog.age);
		System.out.println(Dog.cost);
		System.out.println("====================");
		Dog.allocate();
		Dog.display();
	}

}
