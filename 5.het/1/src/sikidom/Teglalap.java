package sikidom;


public class Teglalap {
    private int sideA;
    private int sideB;
    
    

    public Teglalap(int a, int b) {
        this.sideA = a;
        this.sideB = b;
    }
    
    public Teglalap(int a) {
        this.sideA = a;
        this.sideB = a;
    }
    
    public int terulet() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Teglalap [sideA=" + sideA + ", sideB=" + sideB + ", terület: " + this.terulet() + "]";
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setBothSides(int a) {
        this.sideA = a;
        this.sideB = a;
    }

    public boolean biggerThan(Teglalap t) {
        return (this.terulet() > t.terulet());
    }

    
    
    


  
    

}
