public class GivenTime {

	public static void main(String[] args) {
		double g = 9.81;
		System.out.println("Unesite vrijeme: ");
		double t = TextIO.getDouble();
		System.out.println("Unesite udaljenost: ");
		double s = TextIO.getDouble();
		double vrijeme = Math.sqrt((2 * s) / g);
		if (vrijeme <= t)
			System.out
					.printf("Tijelo ce pasti za to vrijeme, i to tacnije za %f sekundi",
							vrijeme);
		else
			System.out
					.printf("Tijelo nece pasti na dno za zadato vrijeme, potrebno je jos %f sekundi",
							vrijeme - t);

	}
}
