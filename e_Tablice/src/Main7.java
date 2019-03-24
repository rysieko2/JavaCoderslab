import java.util.Random;
public class Main7 {
	public static void main(String[] args) {
	/*	W pliku `Main7.java` stwórz tablicê o nazwie `randNumbers` ze 100 losowymi liczbami z zakresu `0-20`.

		1. Tablicê wype³nij za pomoc¹ pêtli `for` – do otrzymania losowej liczby u¿yj kodu umieszczonego w pliku.
		2. Wypisz na stronie wylosowane liczby, oddzielone od siebie przecinkiem `18,12,1,3...`.
		3. Oblicz sumê liczb z tablicy, wynik przypisz do zmiennej `sum`.
		4. Wypisz w konsoli (w nowej linii) sumê wg wzoru: `Suma 100 losowych liczb od 0 do 20 to: 876.`.
	*/	
		Random generator = new Random();
		int randNumbers[] = new int[100];
		int sum = 0;
	
			for (int x=0;x<100;x++){
				randNumbers[x] = generator.nextInt(21);
				sum +=randNumbers[x];
				System.out.print(randNumbers[x]+",");
			}
			System.out.print("\nSuma 100 losowych liczb od 0 do 20 to: "+sum+".");
	}
}
