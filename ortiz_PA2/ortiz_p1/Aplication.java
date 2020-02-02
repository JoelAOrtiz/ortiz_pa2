import java.util.Scanner;


public class Aplication {

	public static void main(String[] args) {
		System.out.println("Four-Digit Encryptor/Decryptor Program\n");
		System.out.println("Option Menu");
		System.out.println("1.Encrypt Code");
		System.out.println("2.Decrypt Code");
		System.out.println("3.Exit\n");
		System.out.println("Please enter an option from the option menu 1-3:");
		
		Scanner S = new Scanner(System.in);
		int menuchoice = S.nextInt();
		while (menuchoice != 3) {

		    if (menuchoice < 1 || menuchoice > 3) {

		        System.out.println(" Please Enter \"1\", \"2\",or \"3\":");
		        menuchoice = S.nextInt();

		    }

		    else if(menuchoice == 1) {
		    	System.out.println("Please enter your four-digit encrypt code: ");
		        int ecryptcode = S.nextInt();
		        break;
		    	
		    	Encrypter.encryptcode 

		    }
		    else if(menuchoice == 2) {
		    	System.out.println("Please enter your four-digit decrypt code: ");
		        int decrypcode = S.nextInt();
		        break;
		    }
		    else if(menuchoice == 3) {
		    	System.out.println("Exiting program.....");
		    	System.exit(1);
		    }

		}   

	}

}
