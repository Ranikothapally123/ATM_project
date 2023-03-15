package SimpleBankApplication;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank_Application {
	public static  void main(String args[])
			throws IOException{
		BufferedReader sc = new BufferedReader(
				new InputStreamReader(System.in));
		String name = "";
		int pass_code;
		int ac_no;
		int ch;
		while(true) {
			System.out.println("Welcome to SBI bank");  
			System.out.println("press 1 for Create Account");  
			System.out.println("press 2 for Login Account"); 
			try {
				System.out.println("Enter Input:"); 
				ch = Integer.parseInt(sc.readLine());
				switch(ch) {
				case 1:
					try {
						System.out.println("Enter User Name:"); 
						name = sc.readLine();
						System.out.println("Enter New Password:"); 
						pass_code= Integer.parseInt(sc.readLine());
						if(Main.createAccount(name,pass_code)) {
							System.out.println("Message:Account created succesfully");
						}
						else {
							System.out.println("Message:Account created succesfully"); 

						}

					}
					catch (Exception e) {
						System.out.print("Error:Enter Valid Data::Insertion Failed");
					}
					break;
				case 2:
					try {
						System.out.println("Enter userName:");
						name = sc.readLine();
						System.out.println("Enter Password:"); 
						pass_code=Integer.parseInt(sc.readLine());
						if(Main.loginAccount(name,pass_code)) {
							System.out.println("Message:Thank you visit again!You are logged out succesfully!"); 
						}
						else {
							System.out.println("Error:Login Failed!"); 
						}
					}
					catch(Exception e) {
						System.out.println("Error:Enter valid data!Login Failed!"); 


					}
					break;
				default:
					System.out.println("Exited Succesfully!Thank you:"); 

				}
			}
				catch(Exception e) {
					System.out.println("Enter valid Entry!"); 

				}

			}
	}
}


