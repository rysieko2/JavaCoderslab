public class Main6 {

	public static void main(String[] args) {
	/*	W pliku `Main6.java`

		1. Stwórz tablicê z 10 dowolnymi liczbami, tablicê nazwij `numbers`.
		2. Wypisz elementy tablicy od koñca, u¿ywaj¹c pêtli ```for``` – ka¿dy element w nowej linii.
	*/
		int numbers[] ={-30,-50,-1115,50,95,15,5,1,-5,9};
			for (int i=numbers.length;i>0;i--){
				System.out.println(numbers[i-1]);
			}
	}
}
