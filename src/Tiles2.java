
public class Tiles2 {

		public static void main(String[] args) {
			double tilea = TextIO.getInt();
			double tileb = TextIO.getInt();
			double duzina = TextIO.getInt();
			double sirina = TextIO.getInt();
			double visina = TextIO.getInt();
			double suma= ((duzina/tilea)*(sirina/tileb))+2*((duzina/tilea)*(visina/tileb))+2*((sirina/tilea)*(visina/tileb));
			System.out.println(suma);
		}

	}

