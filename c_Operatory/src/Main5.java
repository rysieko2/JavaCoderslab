public class Main5 {
	public static void main(String[] args) {
	/*	Otw�rz plik `Main5.java`. 
		Spr�buj � bez uruchamiania � odpowiedzie� na pytanie jaki b�dzie wynik programu zawartego w pliku.
		Zweryfikuj w�asne przypuszczenia poprzez uruchomienie programu.
		Opisz w komentarzu wyja�nienie dzia�ania programu.
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
					
		/*funkcja "++a" dzia�a tak, �e inkrementacja wykonywana jest przed wykonaniem funkcji,
		  a funkcja "a++" tak �e inkrementacja wykonywana jest po wykonaniu funkcji 
		*/
	}
}
