public class Main6 {

	public static void main(String[] args) {
	/*	W pliku `Main6.java`

		1. Stw�rz tablic� z 10 dowolnymi liczbami, tablic� nazwij `numbers`.
		2. Wypisz elementy tablicy od ko�ca, u�ywaj�c p�tli ```for``` � ka�dy element w nowej linii.
	*/
		int numbers[] ={-30,-50,-1115,50,95,15,5,1,-5,9};
			for (int i=numbers.length;i>0;i--){
				System.out.println(numbers[i-1]);
			}
	}
}
