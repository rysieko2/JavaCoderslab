
public class Main6 {
	public static void main(String[] args) {
	/*	1. W pliku `Main6.java` napisz kod, który na podstawie wartoœci zmiennej, np. `int n = 5;` wypisuje wszystkie liczby od zera do **n**.
		Przy ka¿dej liczbie wypisz, czy liczba jest parzysta czy nie.  

		Wzór:
		```
		0 – parzysta
		1 – nieparzysta
		2 – parzysta
		3 – nieparzysta
		...
		```
		Zmieñ wartoœæ zmiennej `n` i uruchom ponownie.
		Napisz zarówno pêtlê `for` jak i pêtlê `while`.

		*PodpowiedŸ: Jak sprawdziæ czy liczba jest parzysta lub nieparzysta? Wystarczy obliczyæ jej resztê z dzielenia przez `2`, je¿eli wynik to 0, wtedy liczba jest parzysta, w przeciwnym przypadku jest nieparzysta.*
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