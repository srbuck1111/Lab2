package Lab2Pacakage;

import java.util.Scanner;

public class AreaOfRooms {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double h = 0;
		double l = 0;
		double w = 0;

		double a = 0;
		double p = 0;
		double v = 0;

		boolean retry = false;
		boolean retryHeight = false;
		String ans = "N";

		System.out.println("Welcome to Grand Circus room measurer");

		System.out.println("Is room height constant? (Y/N)");
		ans = scan.nextLine();

		if (ans.equalsIgnoreCase("Y")) {
			retryHeight = false;

			System.out.print("Room height: ");
			h = scan.nextDouble();

		}

		else {

			retryHeight = true;

		}

		do {

			if (retryHeight == true) {

				System.out.print("Room height: ");
				h = scan.nextDouble();

			}

			System.out.print("Room length: ");
			l = scan.nextDouble();

			System.out.print("Room width: ");
			w = scan.nextDouble();

			p = (l + w) * 2;
			a = l * w;
			v = l * w * h;

			System.out.println("Perimiter: " + p);
			System.out.println("Area: " + a);
			System.out.println("Volume: " + v);

			scan.nextLine(); // garbage line

			System.out.println("Again? (Y/N)");
			ans = scan.nextLine();

			if (ans.equalsIgnoreCase("Y")) {

				retry = true;

			}

		} while (retry == true);

		System.out.println("Goodbye.");

		scan.close();

	}

}
