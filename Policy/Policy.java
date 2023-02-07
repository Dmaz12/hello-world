import java.util.*;
public class Policy
{  



   final double BASE_PRICE = 600;// final vlaue for bse price 
   final double AGE_FEE = 50; // final value for age fee 
   final double SMOKE_FEE = 100; // final value for smoker fee 
   /**
   Below****
   Creates the private feilds for the class needed 
   
   */

   private int number;
   private String provider;
   private String nameF;
   private String nameL;
   private int age;
   private String smoke;
   private double height;
   private double weight;
   private double BMI;
   private double addFee;
   
   private double policyPrice = 0;
   
   // construcot that takes no argument 
   public Policy()
   {
      number = 00;
      provider = "";
      nameF = "";
      nameL = "";
      age = 18;
      smoke = "";
      height = 0;
      weight = 0; 
      
   }
   // constructor that takes areguments 
   public Policy(int numberIn, String prov, String nameFIn, String nameLIn, int ageIn,String smokeIn, double heightIn, double weightIn)
   {
      number = numberIn;
      provider = prov;
      nameF = nameFIn;
      nameL = nameLIn;
      age = ageIn;
      smoke = smokeIn;
      height = heightIn;
      weight = weightIn; 
      
   }
   
   // setter for the policy number 
   public void setNumber(int numberIn)
   {
      number = numberIn;
   }
   // getter for the policy number 
   public int getNumber()
   {
      return number;
   }
   
   // setter for the provider 
   public void setProvider(String prov)
   {
      provider = prov;
   }
   
   // getter for the policy proivider 
   public String getProvider()
   {
      return provider; 
   }
   
   // setter for policy holders first name 
   public void setNameF(String nameFIn)
   {
      nameF = nameFIn;
   }
   // getter for policy holders first name
   public String getNameF()
   {
      return nameF;
   }
   
   // setter for policy holders Last name
   public void setNameL(String nameLIn)
   {
      nameL = nameLIn;
   }
   
   //getter for policy holders Last name
   public String getNameL()
   {
      return nameL;
   }
   // setter for policy holders age
   public void  setAge(int ageIn)
   {
      age = ageIn;
   }
   
   //getter for policy holders age
   public int getAge()
   {
      return age;
   }
   // setter for policy holders smoking status 
   public void setSmoke(String smokeIn)
   {
      smoke = smokeIn;
   }
   
   // getter for policy holders smoking status
   public String getSmoke()
   {
      return smoke;
   }
   public void setHeight(double heightIn)
   {
      height = heightIn;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public void setWeight(double weightIn)
   {
      weight = weightIn;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   // ,ethod that calcualtes the BMI fomr the users input 
   public double getBMI()
   {
   return BMI =  (weight * 703 ) / (height*height );
   }
   
   // method that retruns the additonal fee of your BMI 
   public double getAddFee()
   {
      return (BMI - 35)*20;
   }
   
   /** 
   Policy price method 
   it takes the information from the user and outputs the insurane policy price from the 3 major factors (agr,BMI, smoking status)
   
   */
   public double getPolicyPrice()
   {
      policyPrice = BASE_PRICE; 
     
        if(BMI >35)
        {
         policyPrice+= getAddFee();
        }
        if(age > 50)
        {
         policyPrice+= AGE_FEE;
        }
        if(smoke.toLowerCase() == "smoker")
        {
         policyPrice += SMOKE_FEE;
        }
            
      
         return policyPrice;
   }
}
