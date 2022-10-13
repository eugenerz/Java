public class Classes {
    public static void main(String[] args){
        Triangle triangleA= new Triangle(15,8,15,8,17);
        double areaA=triangleA.findArea();
        System.out.println(areaA);

        StudentsP StudentA= new StudentsP("Eugenia", "Ruiz", 2022, 25, 8.22, "Engineering");
        System.out.println(StudentA.FirstName + " "+ StudentA.LastName);
        //System.out.
        String name=StudentA.FirstName;
        //StudentA.Profile();
        //StudentA.incrementExpextedGraduationYear();
        //StudentA.ExpectedGraduateYear;




    }
}
