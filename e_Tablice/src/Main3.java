public class Main3 {

	public static void main(String[] args) {
	/*	W pliku `Main3.java`

		1. Stwórz tablicê z 10 dowolnymi liczbami, tablicê nazwij `numbers`.
		2. Stwórz zmienn¹  ```sum``` i przypisz do niej liczbê `0`.
		3. Za pomoc¹ pêtli ```for``` oblicz sumê liczb z tablicy.
		4. Wypisz sumê na konsoli, wg wzoru: `Suma elementów tablicy to: 381.`.
	*/
		int[]numbers = {8,4,8,89,51,2,79,45,259,0};
		int sum =0;
		for (int z=0;z<numbers.length;z++){
			sum += numbers[z];
		}
		System.out.print("Suma elementów tablicy to: "+sum);
	}
}
