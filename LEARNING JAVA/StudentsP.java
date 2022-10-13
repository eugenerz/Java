public class StudentsP {
    String FirstName;
    String LastName;
    int ExpectedGraduateYear;
    int Age;
    double GPA;
    String declaredMajor;
    public StudentsP(String FirstName,String LastName,int ExpectedGraduateYear,int Age,double GPA,String declaredMajor){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.ExpectedGraduateYear=ExpectedGraduateYear;
        this.Age=Age;
        this.GPA=GPA;
        this.declaredMajor=declaredMajor;
     }
   /* 
     public void incrementExpextedGraduationYear(){
        this.ExpectedGraduateYear=this.ExpectedGraduateYear+1;

     }
     public void Profile(){
        System.out.println(this.FirstName + " "+ this.LastName);
        System.out.println(this.Age+"years old");
        System.out.println("GPA: "+this.GPA);
        System.out.println("Declared Major: "+this.declaredMajor+" and Expext to graduate on "+this.ExpectedGraduateYear);
        

     }
            
    */  
}
