package com.dest.jfs.day17;
import java.util.Scanner;

public class switchcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1");
		int n1=sc.nextInt();
		System.out.println("enter number 2");
		int n2=sc.nextInt();
		System.out.println("please select the option :\n"
				+"1.addition\n"
				+"2.sub \n"
				+"3.mul \n"
				+"4.div \n");
		int choice=sc.nextInt();
		int res;
		switch (choice) {
		
		case 1:{
			System.out.println("add");
			res=n1+n2;
			System.out.println(res);
			break;
		}
		case 2:{
			System.out.println("sub");
			res=n1-n2;
			System.out.println(res);
			break;
		}
		case 3:{
			System.out.println("mul");
			res=n1*n2;
			System.out.println(res);
			break;
		}
		case 4:{
			System.out.println("div");
			res=n1/n2;
			System.out.println(res);
			break;
		}
		default: {
			System.out.println("no selected choice");
		}
		}
	}
}
