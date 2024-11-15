package com.dest.jfs.day13;
class Dog{
	String name;
	String color;
	String breed;
	int age;
	int cost;


	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(cost);
	}
	void allocate() {
		name="king";
		color="black";
		breed="foreign";
		cost=4000;
		age=2;
	}
}
	public class instances {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Dog d1=new Dog();
			d1.display();
			System.out.println("+++++++++++++++++");
			d1.allocate();
			d1.display();
		}

	}
