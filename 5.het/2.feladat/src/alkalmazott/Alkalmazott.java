package alkalmazott;

public class Alkalmazott {
    String name;
    int salary;
    
    void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }
    @Override
    public String toString() {
        return name + ": " + salary; 
    }
}
