public class Main2 {

	public static void main(String[] args) {
	/*	1. W pliku `Main2.java` stwórz trzy zmienne, o nazwach: `nr1, nr2, nr3`, przechowuj¹ce liczby ca³kowite.
		2. Nastêpnie, za pomoc¹ instrukcji warunkowej `if ... else if ... else`, wypisz w konsoli, która z nich jest najwiêksza.
		3. Wypisany String ma byæ wg wzoru: `Najwiêksza z liczb 7,2,11 to 11.`. Pamiêtaj, aby wypisywaæ liczby przy pomocy zmiennych.
	*/
		int nr1 = 3;
		int nr2 = 10;
		int nr3 = 9;
		
		if ((nr1 > nr2) && (nr1> nr3)){
			System.out.print("Najwiêksza z liczb "+nr1+","+nr2+","+nr3+ " to " + nr1 + ".");
		}
		else{
			if ((nr2 > nr3)){
				System.out.print("Najwiêksza z liczb "+nr1+","+nr2+","+nr3+ " to " + nr2 + ".");
			}
			else{
				System.out.print("Najwiêksza z liczb "+nr1+","+nr2+","+nr3+ " to " + nr3 + ".");
			}
		}
		
		
		
		
		
		
	
	}

}
