import java.util.Scanner;

/**
 * 
 */

/**
 * @author h.meadows
 *Mr.Hardman
 *Lab 6, Program 3
 *12/13/2016
 */
public class Lab6c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int userNumber;
		boolean prime;
		
		System.out.println("Please enter a number:");
		userNumber = userInput.nextInt();
		prime = isPrime(userNumber);
		if(prime == false){
			System.out.println("That is not a prime number");
		} else {
			System.out.println("That is a prime number");
		}
		userInput.close();
	}
	
	/**
	 * isPrime will check if the number entered is prime
	 * @return returns if the number is prime
	 * @param the integer values of userNumber
	 */
	
	
	public static boolean isPrime (int userNumber){
		Boolean prime = true;
		
		for(int i = 2; prime && i <= Math.sqrt(userNumber); i++){
			
			if(userNumber % i == 0){
				
				prime = false;
			}
		}
		return prime;
	}
}
