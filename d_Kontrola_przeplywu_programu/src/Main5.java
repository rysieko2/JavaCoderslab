
public class Main5 {

	public static void main(String[] args) {
	/*	1. W pliku `Main5.java` stw�rz zmienn� `resultFor` oraz `resultWhile` i przypisz do obu warto�� `0`.
		2. Nast�pnie stw�rz p�tl� `for`, kt�ra doda do siebie liczby od 1 do 10 i zapisze wynik do zmiennej `resultFor`.
		3. Analogicznie stw�rz p�tl� `while` i zapisz wynik do zmiennej `resultWhile`.
		4. P�tle powinny � co uruchomienie (zwane tak�e iteracj� p�tli) � dodawa� do zmiennej `resultFor` lub `resultWhile` kolejn� liczb� z podanego zakresu.
		5. Wypisz w konsoli, w oddzielnych liniach, zmienne `resultFor` oraz `resultWhile`.
	*/
			int resultFor,resultWhile;
			resultFor =0;
			resultWhile =0;

			for (int x=1; x<=10 ;x++){
			resultFor += x;
			}
			
			int x=1;
			while (x<=10){
			resultWhile += x;
			x++;
			}
			
			System.out.println(resultFor);
			System.out.print(resultWhile);
	}

}
