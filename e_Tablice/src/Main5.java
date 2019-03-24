
public class Main5 {

	public static void main(String[] args) {
	/*	W pliku `Main5.java`

		1. Stwórz tablicê z 10 dowolnymi liczbami, tablicê nazwij `numbers`.
		2. Stwórz zmienn¹  ```max``` i przypisz do niej `0`.
		3. Za pomoc¹ pêtli ```for``` znajdŸ liczbê, która jest najwiêksza, przypisz j¹ do zmiennej ```max``` i wypisz na konsoli.
		4. Aby to zrobiæ przeiteruj tablicê i sprawdŸ czy dany element jest wiêkszy od aktualnej wartoœci `max` – jeœli tak, zaktualizuj zmienn¹ `max`.
		5. SprawdŸ czy Twój kod bêdzie dzia³a³ poprawnie jeœli w tablicy znajd¹ siê **tylko** liczby ujemne.
		6. Spróbuj zmodyfikowaæ kod, aby dzia³a³ on uniwersalnie (podpowiedŸ: wystarczy zmodyfikowaæ 1 liniê kodu).
	*/
		int numbers[] ={-30,-50,-1115};
		int max = -2000000000;
		for (int x=0;x<numbers.length;x++){
			if (max<numbers[x]){
				max = numbers[x];
			}
		}
		System.out.print(max);
	}
}
