public class Main3 {

	public static void main(String[] args) {
	/*	W pliku `Main3.java`

		1. Stw�rz tablic� z 10 dowolnymi liczbami, tablic� nazwij `numbers`.
		2. Stw�rz zmienn�  ```sum``` i przypisz do niej liczb� `0`.
		3. Za pomoc� p�tli ```for``` oblicz sum� liczb z tablicy.
		4. Wypisz sum� na konsoli, wg wzoru: `Suma element�w tablicy to: 381.`.
	*/
		int[]numbers = {8,4,8,89,51,2,79,45,259,0};
		int sum =0;
		for (int z=0;z<numbers.length;z++){
			sum += numbers[z];
		}
		System.out.print("Suma element�w tablicy to: "+sum);
	}
}
