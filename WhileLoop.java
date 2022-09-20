import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean isonRepeat=true;
        
        while (isonRepeat==true){
            System.out.println("Playin current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer Yes");
            String userInput=input.next();
            if(userInput.equals("yes")){
                isonRepeat=false;
            }

        }
        System.out.println("Playing Next Song");
    
    }
    
}
