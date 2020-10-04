package ConditionalStatements;

public class Break {
	
	public static void Test_Break() {

		outer: for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					break outer;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
