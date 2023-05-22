import java.util.Date;

public class zadanie1 {
    public static void main(String[] args) {
    }

    //Базовый класс Employee
    public class Employee {
        private String name;
        private Date dob;
        private int baseSalary;
        
        public Employee(String name, Date dob, int baseSalary) {
            this.name = name;
            this.dob = dob;
            this.baseSalary = baseSalary;
        }
    
        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }
        
    }
        // Выносим Salary в отдельный класс
    public class Salary {
        public int calculateNetSalary(int baseSalary) {
            int tax = (int) (baseSalary * 0.25);//calculate in otherway
            return baseSalary - tax;
        }
    }
}
    
    
    
    
    
    
    
    


 
