
public class Counter {
	

	private int value;
    private int upperLimit;

    public Counter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value++;
        if(this.value > this.upperLimit) this.value = 0;
    }

    @Override
	public String toString() {
		return "Counter [value=" + value + ", upperLimit=" + upperLimit + "]";
	}
    
}
