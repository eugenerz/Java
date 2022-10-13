package JavaEssentials;
public class debugexample {
    
        public static void main(String[] args){
            try {
                String welcome = "welcome!";
                char[] chars=welcome.toCharArray();
                char lastChar=chars[chars.length-1];           
                System.out.println("Last char: "+lastChar);
                String nothing=null;
                System.out.print(nothing.length());
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                return;
            }
            System.out.println("Code ran succesfully");
            
   


        }
    
}
