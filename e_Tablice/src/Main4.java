
public class Main4 {

	public static void main(String[] args) {
	/*	. Stw�rz tablic� o nazwie `numbers` z 10 dowolnymi liczbami.
		2. W p�tli ```for``` sprawd�, kt�re s� parzyste i wypisz je w konsoli **jedna pod drug�**.
		3. Utw�rz dodatkow� zmienn� `sumOdd` o warto�ci `0`.
		4. Zmodyfikuj p�tl� z pkt. 1 w ten spos�b, aby **dodatkowo** sumowa�a liczby nieparzyste.
		5. Wy�wietl w konsoli dodatkowy komunikat, wg wzoru: `Suma liczb nieparzystych to: 87.`.
	*/
		int[]numbers ={3,5,8,4,11,15,2};
		int sumOdd =0;
		for (int x=0;x<numbers.length;x++){
			if (numbers[x]%2==0){
				System.out.println(numbers[x]);
			}else{
				sumOdd += numbers[x];
			}
		}
		System.out.println("Suma liczb nieparzystych to: "+ sumOdd);
	}
}
