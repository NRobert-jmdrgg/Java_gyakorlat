package alkalmazott;

public class Alkalmazott {
    private String name;
    private int salary;

    private static final double SJAKULCS = 0.15;

    public Alkalmazott(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }
    @Override
    public String toString() {
        return name + ": " + salary; 
    }

    public int getSJA() {
        return (int)(salary * SJAKULCS);
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static double getSjakulcs() {
        return SJAKULCS;
    }
    
    public boolean nagyobbE(Alkalmazott a) {
        return (this.salary < a.salary);
    }



}
