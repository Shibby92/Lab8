public class Tiles {

	public static void main(String[] args) {
		int tilea = TextIO.getInt();
		int tileb = TextIO.getInt();
		int duzina = TextIO.getInt();
		int sirina = TextIO.getInt();
		int visina = TextIO.getInt();
		int suma= ((duzina/tilea)*(sirina/tileb))+2*((duzina/tilea)*(visina/tileb))+2*((sirina/tilea)*(visina/tileb));
		System.out.println(suma);
	}

}
