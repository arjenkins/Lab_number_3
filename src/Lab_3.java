import java.util.Scanner;

public class Lab_3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInt;
		String userName;

		System.out.println("Hello. What is your name?");
		userName = scnr.nextLine();

		System.out.println(userName + ", please enter a number between 1 and 100.");
		userInt = scnr.nextInt();

		while ((userInt == 0) || (userInt > 100)) {
			System.out.println("Error. Please enter a number between 1 and 100.");
			userInt = scnr.nextInt();
		}
		if (((userInt % 2) == 0) && (userInt >= 2) && (userInt <= 25)) {
			System.out.println("Even and less than 25.");
		} else if (((userInt % 2) == 0) && (userInt >= 26) && (userInt >= 60)) {
			System.out.println("Even.");
		} else if (((userInt % 2) == 0) && (userInt > 60) && (userInt < 100)) {
			System.out.println(userInt + ". Even.");
		} else if ((userInt % 2) != 0) {
			System.out.println(userInt + ". Odd.");
		} else if (((userInt % 2) != 0) && (userInt > 60)) {
			System.out.println(userInt + ". Odd and over 60.");
		}
			System.out.println(userName + ", thank you for entering a number. Have a nice day.");
		}
	}
