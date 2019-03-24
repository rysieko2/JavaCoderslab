public class Main1 {

	public static void main(String[] args) {
	//	W pliku `Main1.java` stwórz dwie zmienne o nazwach: `first`, `second`.
    //	1. Przypisz do nich dwie **ró¿ne** wartoœci logiczne jakie znasz. 
	//	2. Porównaj je za pomoc¹ operatora ```==```, a wynik porównania zapisz do trzeciej zmiennej – `isFirstEqualSecond`.
	//	3. Wyœwietl w konsoli zmienn¹ `isFirstEqualSecond`, aby sprawdziæ wynik.
	//	4. Zmodyfikuj wartoœæ zmiennej `second` na przeciwn¹ i ponownie sprawdŸ wynik.
		
		boolean first = true;
		boolean second = false;
		boolean  isFirstEqualSecond = (first == second);
		System.out.println(isFirstEqualSecond);
	
		second = true;
		System.out.println(isFirstEqualSecond);
		
	}

}
