package com.dest.jfs.day14;
class calculator {
	void add() {
		int a=20;
		int b=30;
		System.out.println(a+b);
	}
	void sub(int c,int d) {
		System.out.println(c-d);
	}
}

public class localvariablesexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c= new calculator();
		c.add();
		c.sub(100, 50);

	}

}
