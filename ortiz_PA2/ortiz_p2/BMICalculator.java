import java.util.Scanner;


public class BMICalculator {

		public static void main(String[] args) {
		    BMICalculator app = new BMICalculator();
		      app.readUserData();
		      //app.calculateBmi();
		     // app.displayBmi();
		}




public static void readUserData() {
	
	// BMI Menu Option
	
	System.out.println("Welcome to the Body Mass Index calculator program.\n");
	System.out.println("Main Menu");
	System.out.println("1. Calculate BMI in Standard");
	System.out.println("2. Calculate BMI in Metric");
	System.out.println("3. Exit Program");
	System.out.println("\nPlease enter an option form the option menu 1-3:");
	
	//User chooses option
	Scanner S = new Scanner(System.in);
	int menuchoice = S.nextInt();
	
	while (menuchoice != 3) {

	    if (menuchoice < 1 || menuchoice > 3) {

	        System.out.println("Enter \"1\", \"2\",or \"3\"");
	        menuchoice = S.nextInt();

	    }

	    else if(menuchoice == 1) {
	    	System.out.print("Please enter your weight in lbs: ");
	        float lbsweight = S.nextFloat();
	        System.out.print("Please enter your height in feet: ");
	        float feetheight = S.nextFloat();
	        System.out.print("Now inches: ");
	        float inchesheight = S.nextFloat(); 
	        break;
	      //  return lbsweight;
	    }
	    else if(menuchoice == 2) {
	    	System.out.print("Please enter your weight in kg: ");
	        float kgweight = S.nextFloat();
	        System.out.print("Please enter your height in cm: ");
	        float cmheight = S.nextFloat();
	        break;
	        
	    }
	    else if(menuchoice == 3) {
	    	System.out.println("Exiting program.....");
	    	System.exit(1);
	    }
	        
	    }

	}   
	


private static void calculateBmi() {
	
	//float Height_FandI = (feetheight * 12) + inchesheight;
	//int BMI1 = (703 * lbsweight) / (Height_FandI * Height_FanI);
	//int BMI2 = (kgweight) / (cmheight * cmheight);	
	
	
	
}

private static void displayBmi() {

	//System.out.println("For your height and weight your BMI is:%f",BMI1);
	
//	 if (BMI1 < 18.5 ) {
         System.out.print("Underweight");
     }

   //  else if (BMI1 >= 18.5 && BMI1 < 25) {
  //       System.out.print("Normal");
   //  }

  //   else if (BMI1 >= 25 && BMI1 < 30) {
   //      System.out.print("Overweight");
     }

    // else if (BMI1>= 30) {
    //     System.out.print("Obese");
   //  }
	
	

//}
