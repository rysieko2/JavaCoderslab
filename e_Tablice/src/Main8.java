public class Main8 {

	public static void main(String[] args) {
	/*	W pliku `Main8.java` znajduje si� tablica z temperaturami.

		1. Temperatura w tablicy zapisana jest w stopniach Celsjusza, zamie� j� na stopnie Fahrenheit'a.  
		   Przelicznik jest nast�puj�cy: `tempCelc * 1.8 + 32`.
		2. Aby to zrobi� przeiteruj tablic� i nadpisz dan� temperatur� now�, obliczon� warto�ci�.
		3. Oblicz �redni� temperatur� z nowo wyliczonych warto�ci i przypisz do zmiennej `avg`.
		4. Wypisz j� w konsoli wg wzoru: `�rednia temperatura to: 3.95` � zaokr�glij liczb� do dw�ch miejsc po przecinku.  
		Mo�esz u�y� u�yj funkcji: 
		 ```java 
		 String.format( "%.2f", variableToFormat );
		 ```
	*/	
		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, -15};
		double avg = 0;
		for (int x=0;x<temps.length;x++){
			temps[x] = temps[x] *1.8 +32;
			avg += temps[x];
		}
		avg = avg/temps.length;	
		System.out.format("�rednia temperatura to: "+"%.2f%n",avg);
	}
}
