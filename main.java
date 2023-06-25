package yash_yaser;

enum Size {
	LARG, MEDIUM, SMALL
}

public class Draft_demo {

	static Size result_1 = Size.SMALL;
	static Size result_2 = Size.MEDIUM;
	static Size result_3 = Size.LARG;

	static Size my_method(String a) {

		switch (a) {
		case "small":
			return result_1;

		case "middle":
			return result_2;

		case "big":
			return result_3;

		}

	}

	public class main {

	public static void main2(String[] args) {
		
		my_method("small");

}
