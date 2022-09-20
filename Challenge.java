import java.util.Scanner;
public class Challenge {
    public static void main(String[] args){
        String question="Quien robo la primer moneda de Don Cangrejo?";

        String answer1="1) Tu la robaste";
        String answer2="2) Tu la robaste";
        String answer3="3)Tu la robaste";
        String Correctanswer="4) Estaba en su bolsillo todo el tiempo xD";

        System.out.println(question);
        System.out.println("Como yo lo veo hay 4 opciones");
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(Correctanswer);
        System.out.println("Escribe el numero de la opcion correcta");

        Scanner input=new Scanner(System.in);
        int answer=input.nextInt();
        
        if(answer==4){
            System.out.println("e.e");
        } else{
            System.out.println("Yo no tome su preciosa moneda!");
        }


    }
    
}
