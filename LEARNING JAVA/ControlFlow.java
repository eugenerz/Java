import java.util.Scanner;
public class IfStatement{
    public static void main(String[] args){
        System.out.println("Pick a number between 1 and 10");
        Scanner number= new Scanner(System.in);

        int inputNumber=number.nextInt(); 
        if (inputNumber<5){
            System.out.println("Enjoy the good luck");
        } else {
            System.out.println("You're out of luck haha");
        }


    }

    
}