/**
 * 
 */
package tomb;

public class Tombkezeles {
	
	public static void main(String[] args) {
		int[] arr = {77, 9, 48, 96, 54, 10, 88, 51, 59, 12};
		kiir(arr);
		kiirForditva(arr);
		double a = ParosAtlag(arr);
		System.out.println("Atlag: " + a);
		int min = MinArr(arr);
		System.out.println("min: " + min);
		boolean m = Monoton(arr);
		System.out.println("monoton: " + m);
		MinRendez(arr);
		kiir(arr);
	}
	
	static void kiir(int[] arr) {
		for(int i : arr) System.out.print(i + " ");
		System.out.println();
	}
	
	static void kiirForditva(int[] arr) {
		for(int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	static double ParosAtlag(int[] arr) {
		double a = 0;
		int db = 0;
		for(int i : arr) {
			if(i % 2 == 0) {
				a += i;
				db++;
			}
		}
		if(db == 0) return 0;
		else return a / db;
	}
	
	static int MinArr(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) 
			if(i < min) min = i;
		return min;
	}
	
	static boolean Monoton(int[] arr) {
		for(int i = 1; i < arr.length; i++) 
			if(arr[i] < arr[i - 1]) return false;
		return true;
	}
	
	static void MinRendez(int[] arr) {
		int i = 0, j, min, minindex;
		while(i < arr.length) {
			minindex = i;
			min = arr[i];
			j = i + 1;
			while(j < arr.length) {
				if(arr[j] < min) {
					min = arr[j];
					minindex = j;
				}
				j++;
			}
			if(minindex != i) {
				arr[minindex] = arr[i];
				arr[i] = min;
			}
			i++;
		}
	}
}
