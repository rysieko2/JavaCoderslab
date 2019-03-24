
public class Main3 {

	public static void main(String[] args) {
		
		//W pliku `Main3.java` stwórz trzy zmienne o nazwach: `nr1, nr2, result`.
		//1. Jedna niech przechowuje dowoln¹ **liczbê ca³kowit¹**.
		//2. Druga – dowoln¹ **liczbê zmiennoprzecinkow¹** typu double.
		//3. Trzecia – o nazwie `result` – niech przechowuje liczbê `0`.
		//4. Zapisz sumê tych liczb w zmiennej `result` i wypisz wynik na konsoli.
		
		int nr1 = 45;
		double nr2 = 33.5;
		double result = 0; 
	//zmienna result powinna byæ typu double, poniewa¿ wynik dodawania bêdzie zmiennoprzecinkowy
		
		result = nr1+nr2;
		System.out.print("Suma liczb: "+result);
		
	}

}
