package muka;

public class Alkalmazott {
    private String name;
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

    
}
