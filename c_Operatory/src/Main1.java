public class Main1 {

	public static void main(String[] args) {
	//	W pliku `Main1.java` stw�rz dwie zmienne o nazwach: `first`, `second`.
    //	1. Przypisz do nich dwie **r�ne** warto�ci logiczne jakie znasz. 
	//	2. Por�wnaj je za pomoc� operatora ```==```, a wynik por�wnania zapisz do trzeciej zmiennej � `isFirstEqualSecond`.
	//	3. Wy�wietl w konsoli zmienn� `isFirstEqualSecond`, aby sprawdzi� wynik.
	//	4. Zmodyfikuj warto�� zmiennej `second` na przeciwn� i ponownie sprawd� wynik.
		
		boolean first = true;
		boolean second = false;
		boolean  isFirstEqualSecond = (first == second);
		System.out.println(isFirstEqualSecond);
	
		second = true;
		System.out.println(isFirstEqualSecond);
		
	}

}
