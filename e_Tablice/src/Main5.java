
public class Main5 {

	public static void main(String[] args) {
	/*	W pliku `Main5.java`

		1. Stw�rz tablic� z 10 dowolnymi liczbami, tablic� nazwij `numbers`.
		2. Stw�rz zmienn�  ```max``` i przypisz do niej `0`.
		3. Za pomoc� p�tli ```for``` znajd� liczb�, kt�ra jest najwi�ksza, przypisz j� do zmiennej ```max``` i wypisz na konsoli.
		4. Aby to zrobi� przeiteruj tablic� i sprawd� czy dany element jest wi�kszy od aktualnej warto�ci `max` � je�li tak, zaktualizuj zmienn� `max`.
		5. Sprawd� czy Tw�j kod b�dzie dzia�a� poprawnie je�li w tablicy znajd� si� **tylko** liczby ujemne.
		6. Spr�buj zmodyfikowa� kod, aby dzia�a� on uniwersalnie (podpowied�: wystarczy zmodyfikowa� 1 lini� kodu).
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
