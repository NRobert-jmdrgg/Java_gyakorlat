package muka;

public class Alkalmazott {
    private final String name;
    private int salary;

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

    public static String getAlkalmazott(Alkalmazott a) {
        return a.name + Integer.toString(a.salary);
    }


}
