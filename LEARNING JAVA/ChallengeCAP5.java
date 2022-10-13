public class ChallengeCAP5 {
    public static double GrossYearlySalary(double HoursPerWeek, double SalaryPerHour){
        double SalaryPerWeek=HoursPerWeek*SalaryPerHour;
        double result=SalaryPerWeek*48;
        return result;

    }
    public static void main(String[] args) {
        double hoursWeek=40;
        double hourSalary=10;
        double TotalSalary=GrossYearlySalary(hoursWeek,hourSalary);
        System.out.println("Eugenia works "+ hoursWeek+" hours per week, and earns $"+hourSalary+" USD per hour" );
        System.out.println("Her Gross Yearly Salary is");
        System.out.println("$"+TotalSalary+" Per Year");
    }
    
}
