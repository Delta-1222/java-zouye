package ifwhile3;

import java.util.Scanner;

public class code315 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lottery = (int)(Math.random() * 900 + 100);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		
		int lotterydigit1 = lottery / 100;
		int lotterydigit2 = lottery / 10 % 10;
		int lotterydigit3 = lottery % 10;
		
		int guessdigit1 = guess / 100;
		int guessdigit2 = guess / 10 % 10;
		int guessdigit3 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);
		
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if ((guessdigit1 == lotterydigit1 && (guessdigit2 == lotterydigit3 && guessdigit3 == lotterydigit2))
				||  (guessdigit1 == lotterydigit2 && (guessdigit2 == lotterydigit1 && guessdigit3 == lotterydigit3))
				||  (guessdigit1 == lotterydigit2 && (guessdigit2 == lotterydigit3 && guessdigit3 == lotterydigit1))
				||  (guessdigit1 == lotterydigit3 && (guessdigit2 == lotterydigit2 && guessdigit3 == lotterydigit1))
				||  (guessdigit1 == lotterydigit3 && (guessdigit2 == lotterydigit1 && guessdigit3 == lotterydigit2)))
			System.out.println("Match all digits: you win $3,000");
		else if (guessdigit1 == lotterydigit1
				|| guessdigit1 == lotterydigit2
				|| guessdigit1 == lotterydigit3
				|| guessdigit2 == lotterydigit1
				|| guessdigit2 == lotterydigit2
				|| guessdigit2 == lotterydigit3
				|| guessdigit3 == lotterydigit1
				|| guessdigit3 == lotterydigit2
				|| guessdigit3 == lotterydigit3)
			System.out.println("Math one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
	}

}
