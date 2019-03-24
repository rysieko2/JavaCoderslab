
public class Main4 {

	public static void main(String[] args) {
	/*	. Stwórz tablicê o nazwie `numbers` z 10 dowolnymi liczbami.
		2. W pêtli ```for``` sprawdŸ, które s¹ parzyste i wypisz je w konsoli **jedna pod drug¹**.
		3. Utwórz dodatkow¹ zmienn¹ `sumOdd` o wartoœci `0`.
		4. Zmodyfikuj pêtlê z pkt. 1 w ten sposób, aby **dodatkowo** sumowa³a liczby nieparzyste.
		5. Wyœwietl w konsoli dodatkowy komunikat, wg wzoru: `Suma liczb nieparzystych to: 87.`.
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
