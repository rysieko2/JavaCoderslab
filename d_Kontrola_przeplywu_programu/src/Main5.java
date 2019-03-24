
public class Main5 {

	public static void main(String[] args) {
	/*	1. W pliku `Main5.java` stwórz zmienn¹ `resultFor` oraz `resultWhile` i przypisz do obu wartoœæ `0`.
		2. Nastêpnie stwórz pêtlê `for`, która doda do siebie liczby od 1 do 10 i zapisze wynik do zmiennej `resultFor`.
		3. Analogicznie stwórz pêtlê `while` i zapisz wynik do zmiennej `resultWhile`.
		4. Pêtle powinny – co uruchomienie (zwane tak¿e iteracj¹ pêtli) – dodawaæ do zmiennej `resultFor` lub `resultWhile` kolejn¹ liczbê z podanego zakresu.
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
