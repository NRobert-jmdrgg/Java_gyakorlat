package muka;

public class Alkalmazott {
    private final String name;
    private int salary;

    //konstans csak egyszer foglalunk neki helyet
    private static final double ADOKULCS = 16.0;

    //konstruktorok overloadinggal

    public Alkalmazott(String myName) {
        this.name = myName;
        this.salary = 47000;
    }

    public Alkalmazott(String myName, int mySalary) {
        this.name = myName;
        this.salary = mySalary;
    }

    //setter
    public void setSalary(int s) {
        this.salary = s;
    }

    public void increaseSalary(int inc) {
        this.salary += inc;
    }

    //getter
    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    //metodusok
    public boolean salaryBounds(int u, int l) {
        return (this.salary < u && this.salary > l);
    }

    public double tax() {
        return this.salary * (ADOKULCS / 100);
    }

    public boolean salaryGreaterThan(int m) {
        return (this.salary > m);
    }

    public static String alkalmazottToString(Alkalmazott a) {
        return a.name + Integer.toString(a.salary);
    }

    


}
