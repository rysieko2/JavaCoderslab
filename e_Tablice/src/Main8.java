public class Main8 {

	public static void main(String[] args) {
	/*	W pliku `Main8.java` znajduje siê tablica z temperaturami.

		1. Temperatura w tablicy zapisana jest w stopniach Celsjusza, zamieñ j¹ na stopnie Fahrenheit'a.  
		   Przelicznik jest nastêpuj¹cy: `tempCelc * 1.8 + 32`.
		2. Aby to zrobiæ przeiteruj tablicê i nadpisz dan¹ temperaturê now¹, obliczon¹ wartoœci¹.
		3. Oblicz œredni¹ temperaturê z nowo wyliczonych wartoœci i przypisz do zmiennej `avg`.
		4. Wypisz j¹ w konsoli wg wzoru: `Œrednia temperatura to: 3.95` – zaokr¹glij liczbê do dwóch miejsc po przecinku.  
		Mo¿esz u¿yæ u¿yj funkcji: 
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
		System.out.format("Œrednia temperatura to: "+"%.2f%n",avg);
	}
}
