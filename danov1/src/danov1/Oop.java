package danov1;

import java.util.Scanner;

public class Oop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input three numbers, separated by SPACE:");
		// System.out.print("Input first number:");
		int num1 = sc.nextInt();
		// System.out.print("Input second number:");
		int num2 = sc.nextInt();
		// System.out.print("Input third number:");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("The biggest number is num1: " + num1);
			if (num3 < num2) {
				System.out.println("The smallest number is num3:" + num3);
			} else if (num2 < num3) {
				System.out.println("The smallest number is num2:" + num2);
			} else {
				System.out.println("num2 and num3 are equal:" + num2);
			}
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The biggest number is num2: " + num2);
			if (num3 < num1) {
				System.out.println("The smallest number is num3:" + num3);
			} else if (num1 < num3) {
				System.out.println("The smallest number is num1:" + num1);
			} else {
				System.out.println("num1 and num3 are equal:" + num1);
			}
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("The biggest number is num3: " + num3);
			if (num1 < num2) {
				System.out.println("The smallest number is num1:" + num1);
			} else if (num2 < num1) {
				System.out.println("The smallest number is num2:" + num2);
			} else {
				System.out.println("num1 and num2 are equal:" + num1);
			}
		} else if (num1 == num2 && num1 > num3) {
			System.out.println("Both num1 and num2 are equal and the biggest numbers:" + num1);
			System.out.println("The smallest number is num3:" + num3);
		} else if (num2 == num3 && num2 > num1) {
			System.out.println("Both num2 and num3 are equal and the biggest numbers:" + num2);
			System.out.println("The smallest number is num1:" + num1);
		} else if (num1 == num3 && num1 > num2) {
			System.out.println("Both num1 and num3 are equal and the biggest numbers:" + num1);
			System.out.println("The smallest number is num2:" + num2);
		} else {
			System.out.println("All numbers are equal");
		}
	}

}
