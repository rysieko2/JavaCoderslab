public class Main8 {
	
	public static void main(String[] args) {
	/*	W pliku `Main8.java` wykonaj nast�puj�ce zadania:

			1. Zdefiniuj zmienn� `black` � o warto�ci `16`, oraz zmienn� `white` � o warto�ci `15`.
			2. Zdefiniuj zmienn� `blackOrWhite`, kt�ra b�dzie przechowywa� **warto�� logiczn�** por�wnania czy `black` **<** `white`.
			3. Zdefiniuj zmienn� `good` � o warto�ci logicznej **prawda**, oraz zmienn� `bad` � o warto�ci logicznej **fa�sz**.
			4. Zdefiniuj zmienn� `goodOrBad`, kt�ra b�dzie przechowywa� **warto�� logiczn�** por�wnania `good` **LUB (or)** `bad`.
			5. Zdefiniuj zmienn� `comparison`, kt�ra b�dzie przechowywa� **warto�� logiczn�** por�wnania `blackOrWhite` **I (and)** `goodOrBad`.
			6. Wy�wietl w konsoli � w nowych liniach � kolejno zmienne: `blackOrWhite` , `goodOrBad` i `comparison`.
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
