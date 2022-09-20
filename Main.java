import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int studentAge = 15;
        double studentGPA = 3.45;
        String Firstname="Eugenia";
        String Lastname="Ramos";
        char studentFirstInitial =Firstname.charAt(0);
        char studentLastInitial = Lastname.charAt(0);
        boolean hasPerfectAttendance = true;
        String Fullname= Firstname + " " + Lastname;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(Fullname);
        System.out.println(Firstname+" "+Lastname +" has a GPA of" +studentGPA);
        System.out.println("What do you want to update it to?");
        Scanner input= new Scanner(System.in);
        studentGPA=input.nextDouble();
        System.out.println(Firstname+" "+Lastname +" now has a GPA of" +studentGPA);
        



}
    

}