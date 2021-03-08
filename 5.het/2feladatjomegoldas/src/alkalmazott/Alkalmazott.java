package alkalmazott;

public class Alkalmazott {
    
    //privat valtozok
    private final String name; //csak 1 szer lehet beallitani
    private int salary = 47000;

    //class valtozok
    private static int employeeCount = 0;


    //konstruktorok
    public Alkalmazott(String name, int salary) {
        this.name = name; //a this egy mutato (a referenciára mutat aminel meghivjuk)
        this.salary = salary;
        employeeCount++;
    }
    
    public Alkalmazott(String name) {
        this.name = name;
        employeeCount++;
    }


    //fuggvenyek es getter/setterek
    public void increaseSalary(double percentage) {
        this.salary += salary * (percentage/100);
    }
    public String getName() {

        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Alkalmazott [name=" + name + ", salary=" + salary + "]";
    }


    //class fuggveny
    public static int getEmployeeCount() {
        return employeeCount;
    }
   
}
