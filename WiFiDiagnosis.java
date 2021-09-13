/*
 * Class: CMSC203 
 * Instructor:Robert Alexander 
 * Description:Build an application that will step through some possible 
               problems to restore internet connectivity.  Assume that 
               your computer uses wi-fi to connect to a router which connects 
               to an Internet Service Provider (ISP) which connects to the Internet.
 * Due: 09/16/2021
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: __Xiaozi Wang__
*/
import java.util.Scanner;

public class WiFiDiagnosis {
	//main method
	public static void main(String[] args) {
		//declare variable
		String answer;
		Scanner input= new Scanner(System.in);
		
		//display question
		System.out.println("If you have a problem with internet connectivity,"
				+ "this WiFi Diagnosis might work.\n");
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet?(yes or no)");
		//get answer from user
		answer = input.nextLine();
		
		if (answer.equals("yes")||answer.equals("no")){
			if (answer.equals("no")) {
				System.out.println("Second step: reboot your router");
				System.out.println("Now are you able to connect "
						+ "with the internet?(yes or no)");
				answer = input.nextLine();
				
				if (answer.equals("yes")||answer.equals("no")) {
					if (answer.equals("no")) {
						System.out.println("Third step: make sure the cables to "
								+ "your router are plugged in firmly "
								+ "and your router is getting power");
						System.out.println("Now are you able to connect "
								+ "with the internet?(yes or no)");
						answer = input.nextLine();
						
						if (answer.equals("yes")||answer.equals("no")) {
							if (answer.equals("no")) {
								System.out.println("Fourth step: move your computer closer"
										+ "to your router");
								System.out.println("Now are you able to connect "
										+ "with the internet?(yes or no)");
								answer = input.nextLine();
								
								if (answer.equals("yes")||answer.equals("no")) {
									if (answer.equals("no")) {
										System.out.println("Fifth step: "
												+ "contact your ISP");
										System.out.println("Make sure your ISP"
												+ " hooked up to your router.");
									}
									else {
										System.out.println("Moving your computer "
												+ "seemed to work");
									}
								}
							}
							else {
								System.out.println("Checking the router's cables"
										+ "seemed to work");
							}
						}
					}
					else {
						System.out.println("Rebooting your router seemed to work");
					}
				}
			}
			else {
				System.out.println("Rebooting your computer seemed to work");
			}
		}

	}

}
