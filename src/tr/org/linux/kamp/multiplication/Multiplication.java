package tr.org.linux.kamp.multiplication;

public class Multiplication {

	public static void main(String[] args) {
		int[][] table = new int[10][10];
		int i = 0, j = 0;

		for (i = 0; i < table.length; i++) {
			for (j = 0; j < table[i].length; j++) {
				table[i][j] = (i + 1) * (j + 1);
			}

		}

		for (i = 0; i < table.length; i++) {
			for (j = 0; j < table.length; j++) {
				System.out.print(table[i][j] + "\t");

			}
			System.out.println();

		}
	}
}