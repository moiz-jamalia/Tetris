package tetris;

public class Test {

	public static void main(String[] args) throws Exception {
		try {
			DBConnection.ConnectionDatabase();
			System.out.println("Helo");
		} catch (Exception e) {
			System.out.println("bs");
			System.out.println("aslfk");
		}
	}
}
