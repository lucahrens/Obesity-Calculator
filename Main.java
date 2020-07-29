import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner inputer = new Scanner(System.in);
		System.out.println("Enter your hieght in inches:");
		int hieght = inputer.nextInt();
		System.out.println("Enter your wieght in pounds:");
		int wieght = inputer.nextInt();
		double bmi = (703 * wieght)/(Math.pow(hieght, 2));
		if (bmi >= 30) {
			System.out.println("Your BMI is " + bmi + " and you are obese.");
		} else {
			System.out.println("Your BMI is " + bmi + " and you are not obese.");
		}
	}
}
