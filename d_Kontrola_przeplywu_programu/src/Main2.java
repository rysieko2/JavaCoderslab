public class Main2 {

	public static void main(String[] args) {
	/*	1. W pliku `Main2.java` stw�rz trzy zmienne, o nazwach: `nr1, nr2, nr3`, przechowuj�ce liczby ca�kowite.
		2. Nast�pnie, za pomoc� instrukcji warunkowej `if ... else if ... else`, wypisz w konsoli, kt�ra z nich jest najwi�ksza.
		3. Wypisany String ma by� wg wzoru: `Najwi�ksza z liczb 7,2,11 to 11.`. Pami�taj, aby wypisywa� liczby przy pomocy zmiennych.
	*/
		int nr1 = 3;
		int nr2 = 10;
		int nr3 = 9;
		
		if ((nr1 > nr2) && (nr1> nr3)){
			System.out.print("Najwi�ksza z liczb "+nr1+","+nr2+","+nr3+ " to " + nr1 + ".");
		}
		else{
			if ((nr2 > nr3)){
				System.out.print("Najwi�ksza z liczb "+nr1+","+nr2+","+nr3+ " to " + nr2 + ".");
			}
			else{
				System.out.print("Najwi�ksza z liczb "+nr1+","+nr2+","+nr3+ " to " + nr3 + ".");
			}
		}
		
		
		
		
		
		
	
	}

}
