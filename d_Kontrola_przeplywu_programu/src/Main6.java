
public class Main6 {
	public static void main(String[] args) {
	/*	1. W pliku `Main6.java` napisz kod, kt�ry na podstawie warto�ci zmiennej, np. `int n = 5;` wypisuje wszystkie liczby od zera do **n**.
		Przy ka�dej liczbie wypisz, czy liczba jest parzysta czy nie.  

		Wz�r:
		```
		0 � parzysta
		1 � nieparzysta
		2 � parzysta
		3 � nieparzysta
		...
		```
		Zmie� warto�� zmiennej `n` i uruchom ponownie.
		Napisz zar�wno p�tl� `for` jak i p�tl� `while`.

		*Podpowied�: Jak sprawdzi� czy liczba jest parzysta lub nieparzysta? Wystarczy obliczy� jej reszt� z dzielenia przez `2`, je�eli wynik to 0, wtedy liczba jest parzysta, w przeciwnym przypadku jest nieparzysta.*
	*/
			for (int n=0;n<=5;n++){
				if (n%2==0){
					System.out.println(n + " -  parzysta");
				
				}else{
					System.out.println(n + " -  nieparzysta");
				}
			}
			int n=0;			
			while(n<=5){
				if (n%2==0){
					System.out.println(n + " -  parzysta");
				}else{
					System.out.println(n + " -  nieparzysta");
				}
			n++;
			}
		}
}