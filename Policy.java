public class Policy{
  
   
      private int number; // user number 
      private String provider;  // user provider 
      private String fName; // user first name 
      private String lName; // user last name 
      private int age;  // user age 
      private String smoke; //user smoke status 
      private double height; // user height 
      private double weight; // user weight 
   
 
   // no args constructor 
   public Policy(){
      
      number = 0;
      provider = "";
      fName = "";
      lName = "";
      age = 0;
      smoke = "";
      height = 0;
      weight = 0;
      
   }
   
   // construcotr that takes argument 
   public Policy(int pNumber, String pProvider, String first, String last, int pAge, String inSmoke, double pHeight, double pWeight){
   
      number = pNumber;
      provider = pProvider;
      fName = first;
      lName = last;
      age = pAge;
      smoke = inSmoke;
      height = pHeight;
      weight = pWeight;
      
   
   }
   
   // getter and setter for all attributtes 
   public void setNumber(int pNumber){
      number = pNumber;
   }
   
   public int getNumber(){
      
      return number;
   }
   
   public void setProvider(String pProvider){
      
      provider = pProvider;
   }
   
   public String getProvider(){
   
      return provider;
   }
   
   public String getFirst(){
      
      return fName;
   }
   
   public void setFirst(String first){
      
      fName = first; 
   }
   
   public String getLast(){
      
      return fName; 
   }
   
   public void setLast(String last){
   
      lName = last;
   }
   
   public void setAge(int pAge){
   
      age = pAge;
   }
   
   public int getAge(){
   
      return age;
   }
   
   public void setSmokeStatus(String inSmoke){
   
      smoke = inSmoke;
   }
   
   public String getSmokeStatus(){
      
      return smoke;
   }
   
   public void setHeight(double pHeight){
      
      height = pHeight;
   }
   
   public double getHeight(){
   
      return height;
   
   }
   
   public void setWeight(double pWeight){
      
      weight = pWeight;
   }
   
   public double getWeight(){
   
      return weight;
   
   }
  
      //BMI method
   public double getBMI(){
   
      final double con = 703;
   
     return (weight * con)/(height*height);
      
   
   }
    
   
      // policy price method 
   public double getPrice(){
   
   final double BASE_PRICE = 600;
   final double AGE_FEE = 75; 
   final double SMOKING_FEE = 100;
   final double FEE_PER_BMI = 20;
   
   final int AGE_THRESH = 50;
   final int BMI_THRESH = 35;
   
    double price = BASE_PRICE;
   
   if (age > AGE_THRESH)
      price += AGE_FEE;
      
      if (smoke.equalsIgnoreCase("smoker"))
         price += SMOKING_FEE;
         
         if(getBMI() > BMI_THRESH)
            price += ((getBMI()  - BMI_THRESH )* FEE_PER_BMI);
         
      
   return price;
   
   
   
   
      
      
   }
  
     
}