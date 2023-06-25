package yash_yaser;

import java.util.Scanner;

public class main {

	public static void main2(String[] args) {
		System.out.println("enter length of rectangle please :");
		Scanner length = new Scanner(System.in);
		int	rectangle_length = length.nextInt();
		System.out.println("enter width of rectangle please : ");
		Scanner width = new Scanner(System.in);
		int rectangle_width = width.nextInt();
		int surface = rectangle_length * rectangle_width;
		if(surface<=20) {
			System.out.println("surface of rectangle is :" + surface);
			System.out.println("it's a small rectangle!!");
		}
		else if((surface>20) && (surface<50)) {
			System.out.println("surface of rectangle is :" + surface);
			System.out.println("it's medium size recangle !!!!");
		}
		else {
			System.out.println("surface of rectangle is :" + surface);
			System.out.println("it's a big rectangle");
		}

	}

}
