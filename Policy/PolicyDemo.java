import java.util.*;


public class PolicyDemo
{
   public static void main(String [] args)// main argument 
   {
      Scanner input = new Scanner(System.in);// creates scanner object 
      
      //takes input for the policy number 
      System.out.print("Please enter the Policy Number: "); 
      int number = input.nextInt();
      while (number<=0)
      {
         System.out.println("Please enter a valid number");
         System.out.print("What is the policy number: "); 
         number = input.nextInt();
      
      }
      
      input.nextLine();
      
      //takes input for the provider name 
      System.out.print("Please enter the Provider Name: ");
      String provider = input.nextLine();
      
      //takes the policy holder's First name 
      System.out.print("Please enter the Policyholder's First Name: ");
      String nameF = input.nextLine();
      
      //takes the policy holder's Last name
      System.out.print("Please enter the Policyholder's Last Name: ");
      String  nameL = input.nextLine();
      
      //takes policy holder's age
      System.out.print("Please enter the Policyholder's Age: ");
      int age = input.nextInt();
      
      while (age <=0)// prevents user from enter incorrect data 
      {
         System.out.println("Please enter a valid number");
         System.out.print("Please enter the Policyholder's Age: "); 
         age = input.nextInt();
      }
      
      //takes policy holders smoking status 
      System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smoke = input.nextLine();
      
      input.nextLine();
      
      // takes the policy holders height 
      System.out.println("Please enter the Policyholder's Height (in inches): ");
      double height = input.nextDouble();
      
      while (height < 0)// prevents the user from entering a number below zero 
      {
         System.out.println("Please enter a valid number");
         System.out.print("Please enter the Policyholder's Height (in inches): "); 
         height = input.nextDouble();
      }

      // takes the policy holder weight 
      System.out.println("Please enter the Policyholder's Weight (in pounds): ");
      double weight = input.nextDouble(); 
      
      while (weight <0)// prevent the user from entering in a number below zero
      {
         System.out.println("Please enter a valid number");
         System.out.print("Please enter the Policyholder's Weight (in pounds): "); 
         weight = input.nextDouble();
      }

      
      Policy myPolicy = new Policy(number,provider,nameF,nameL,age, smoke,height,weight);// created an instance of the policy class 
      
      
      System.out.println("Policy Number: " + myPolicy.getNumber());//calls the policy class and prints policy number 
      System.out.println();
      
      System.out.println("Provider Name: " + myPolicy.getProvider());//calls the policy class and prints the provider
      System.out.println();
      
      System.out.println("Policyholder's First Name: " + myPolicy.getNameF());//calls the policy class and prints the first name 
      System.out.println();
      
      System.out.println("Policyholder's Last Name: " + myPolicy.getNameL());//calls the policy class and prints the last name 
      System.out.println();
      
      System.out.println("Policyholder's Smoking Status: " + myPolicy.getSmoke());//calls the policy class and prints the last name 
      System.out.println();
      
      System.out.println("Policyholder's Age:" + myPolicy.getAge());//calls the policy class and prints the age 
      System.out.println();
      
      System.out.println("Policyholder's Height: " + myPolicy.getHeight()+ " (inches)");//calls the policy class and prints the height
      System.out.println();
      
      System.out.println("Policyholder's Weight: " + myPolicy.getWeight()+" (lbs)");//calls the policy class and prints the weight 
      System.out.println();
      
      System.out.printf("Policyholder's BMI: %.2f\n ", myPolicy.getBMI());//calls the policy class and prints the BMI method 
      System.out.println();
      
      System.out.printf("Policy Price: $%.2f\n", myPolicy.getPolicyPrice());//calls the policy class and prints the policy price 
   }
}