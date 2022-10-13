public class DynamicF {
    //static void calculateTotalMealPrice(double ListedMealprice, double taxRated, double tipRated){ 
    public static double calculateTotalMealPrice(double ListedMealprice, double taxRated, double tipRated){ 
         double tip=tipRated * ListedMealprice;
         double tax=taxRated * ListedMealprice;
         double result= tip+tax;
         //System.out.println("Your total meal prices is " + result);
         return result;
     }
     public static void main(String[] args) {
         //calculateTotalMealPrice(ListedMealprice:15, taxRated:0.2, tipRated:0.08);
         double groupTotalMealPrice=calculateTotalMealPrice(15,0.2,0.08);
         System.out.println("Total Meal Price: "+ groupTotalMealPrice);
         System.out.println("Price per person: "+ groupTotalMealPrice/5);
     }
 }
 