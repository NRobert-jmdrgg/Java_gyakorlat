
public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter(4);
        System.out.println("Value at start: " + counter );

        int i = 0;
        while (i < 10) {
            counter.next();
            System.out.println("Value: " + counter );
            i++;
        }

	}

}
