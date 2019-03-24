public class Main8 {
	
	public static void main(String[] args) {
	/*	W pliku `Main8.java` wykonaj nastêpuj¹ce zadania:

			1. Zdefiniuj zmienn¹ `black` – o wartoœci `16`, oraz zmienn¹ `white` – o wartoœci `15`.
			2. Zdefiniuj zmienn¹ `blackOrWhite`, która bêdzie przechowywaæ **wartoœæ logiczn¹** porównania czy `black` **<** `white`.
			3. Zdefiniuj zmienn¹ `good` – o wartoœci logicznej **prawda**, oraz zmienn¹ `bad` – o wartoœci logicznej **fa³sz**.
			4. Zdefiniuj zmienn¹ `goodOrBad`, która bêdzie przechowywaæ **wartoœæ logiczn¹** porównania `good` **LUB (or)** `bad`.
			5. Zdefiniuj zmienn¹ `comparison`, która bêdzie przechowywaæ **wartoœæ logiczn¹** porównania `blackOrWhite` **I (and)** `goodOrBad`.
			6. Wyœwietl w konsoli – w nowych liniach – kolejno zmienne: `blackOrWhite` , `goodOrBad` i `comparison`.
			7. Przeanalizuj otrzymany wynik.
	*/
		int black = 16;
		int white = 15;
		boolean blackOrWhite = black < white;
		boolean good = true;
		boolean bad = false;
		boolean goodOrBad = good || bad;
		boolean comparison = blackOrWhite == goodOrBad;
		
		System.out.println(blackOrWhite);
		System.out.println(goodOrBad);
		System.out.println(comparison);

		
		
		
		
		
		
		
		
	}

}
