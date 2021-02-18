package javaConcepts;

public class Arrays {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 4, 5, 6 };
		int c[] = { 7, 8, 9 };
		int d[][] = { { 1, 2, 3, 4, 5 }, { 7, 8, 9 }, { 10, 11, 12, 13, 14, 15, 16 } };
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print("  " + d[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		//enhanced for loop
		for (int l[] : d) {
			for (int m:l) {
				System.out.print("   "+m);
			}
			System.out.println();
		}
		
	}

}
