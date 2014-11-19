public class Triangle {
	public static void main(String[] args) {
		double a = TextIO.getDouble();
		double b = TextIO.getDouble();
		double c = TextIO.getDouble();
		if ((a + b > c) && (a + c > b) && (b + c > a))
			System.out.println("Stranice daju trougao!");

	}

}
