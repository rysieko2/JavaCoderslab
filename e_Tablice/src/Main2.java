
public class Main2 {

	public static void main(String[] args) {
	/*	W pliku `Main2.java` stwórz tablicê z list¹ swoich ulubionych owoców. Tablicê nazwij `fruits`.  

		Nastêpnie:

		1. wypisz w konsoli **pierwszy** owoc, wg wzoru: `Pierwszy owoc to: truskawka`;
		2. wypisz w konsoli **ostatni** owoc, wg wzoru: `Ostatni owoc to: malina` (skorzystaj z `length`);
		3. w pêtli wypisz wszystkie owoce – **ka¿dy w nowej linii** (skorzystaj z `length`).
	 */
	
		String[]fruits ={"Jab³ko","Banan","Pomarancz","Kiwi"};
		System.out.println("Pierwszy owoc to: "+fruits[0]);
		System.out.println("Ostatni owoc to: "+fruits[fruits.length-1]);
	
		for (int i=0;i<fruits.length;i++){
		System.out.println(fruits[i]);
		}
	}
}


