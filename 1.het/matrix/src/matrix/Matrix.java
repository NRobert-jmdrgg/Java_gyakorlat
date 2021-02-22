package matrix;

public class Matrix {

	public static void main(String[] args) {
		int[][] mx = new int[4][4];
		for(int i = 0; i < 4; i++) 
			for(int j = 0; j < 4; j++) mx[i][j] = j;
		
		matrixKiir(mx);
		System.out.println(matrixKeres(mx, 3));
	}
	
	static void matrixKiir(int mx[][]) {
		for(int i = 0; i < mx.length; i++) {
			for(int j = 0; j < mx[0].length; j++) System.out.print(mx[i][j] + " ");
			System.out.println();
		}	
	}
	
	static boolean matrixKeres(int mx[][], int key) {
		for(int i = 0; i < mx.length; i++) 
			for(int j = 0; j < mx[0].length; j++) 
				if(mx[i][j] == key) return true;
			
		
		return false;
	}

}
