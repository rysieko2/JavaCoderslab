public class Main5 {
	public static void main(String[] args) {
	/*	Otwórz plik `Main5.java`. 
		Spróbuj – bez uruchamiania – odpowiedzieæ na pytanie jaki bêdzie wynik programu zawartego w pliku.
		Zweryfikuj w³asne przypuszczenia poprzez uruchomienie programu.
		Opisz w komentarzu wyjaœnienie dzia³ania programu.
	*/
		int a = 1;
		int b;
		System.out.println(++a);  
		System.out.println(a++);   
		System.out.println(a);     
		b=a++;					  
		System.out.println(b);     
		b=++a;                     
		System.out.println(++a);   
					
		/*funkcja "++a" dzia³a tak, ¿e inkrementacja wykonywana jest przed wykonaniem funkcji,
		  a funkcja "a++" tak ¿e inkrementacja wykonywana jest po wykonaniu funkcji 
		*/
	}
}
