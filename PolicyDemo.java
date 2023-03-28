import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;


// policy demo class 
public class PolicyDemo
{

  // main argument 
   public static void main (String [] args)throws IOException
   {

      int number; //user number 
      String provider; //user provider 
      String fName;//user first name 
      String lName;//user last name 
      int age;//user age 
      String smoke; //smoker status
      double height; //user height 
      double weight; //users weight
      int smokers = 0; 
      
      //array list ot store array object 
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      
      
      // crate and open the file 
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      while(inputFile.hasNext())
      {
      
      
      number = inputFile.nextInt(); 
      inputFile.nextLine();     
        
      provider = inputFile.nextLine(); 
      
      fName = inputFile.nextLine();
      
      lName = inputFile.nextLine();
     
      age = inputFile.nextInt();
      inputFile.nextLine();
      
      smoke = inputFile.nextLine();
      
      height = inputFile.nextDouble();
      
      weight = inputFile.nextDouble();
      
       //make sure we haven't hit the end of the file before trying to skip the blank line
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
      
      policyList.add(new Policy( number,  provider,  fName,  lName,  age, smoke, height, weight));
      
      }
      for (Policy policy : policyList)
      {
       System.out.println("Policy Number: "+ policy.getNumber());
       System.out.println("Provider Name: " + policy.getProvider());
       System.out.println("Policyholder’s First Name: "+ policy.getFirst());
       System.out.println("Policyholder’s Last Name: " + policy.getLast());
       System.out.println("Policyholder’s Age: " + policy.getAge());
       System.out.println("Policyholder’s Smoking Status: " + policy.getSmokeStatus());
       System.out.println("Policyholder’s Height: " + policy.getHeight());
       System.out.println("Policyholder’s Weight: "+ policy.getWeight());
       System.out.printf("Policyholder’s BMI: %.2f" , policy.getBMI());
       System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
       System.out.println();
       
       
       if(policy.getSmokeStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
             smokers ++;

      }

       //print out the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + smokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - smokers) );
      
   }
}