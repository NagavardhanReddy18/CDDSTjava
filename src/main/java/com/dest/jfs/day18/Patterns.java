package com.dest.jfs.day18;
import java.util.Scanner;


public class Patterns {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("give n");
		//System.out.println("#");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println("#");
			
			
		}
		for (int i=1;i<=n;i++) {
			System.out.print("#");
		}
		int j=1;
		for (int i=1;i<=n;i++) {
			for (j=1;j<=n;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		int c=1;
		for(int i=1;i<=n;i++) {
			for (j=1;j<=n;j++) {
				System.out.println(c);
			
			}
		}
		// TODO Auto-generated method stub

	}

}
