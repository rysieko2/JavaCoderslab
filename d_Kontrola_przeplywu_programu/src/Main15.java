
public class Main15 {

    public static void main(String[] args) {
    /*	#### Zadanie 15 � **dodatkowe**

    	W pliku `Main15.java`  

    	1. Napisz program licz�cy warto�� `x!`, gdzie `!` oznacza silni�, a `x` jest zmienn�.  
    	2. U�yj do tego obu znanych Ci p�tli.
    	3. Silnia ma by� zapisana do zmiennej `factorial`.
    	4. Po wyliczeniu silni wy�wietl w konsoli komunikat wg wzoru: `Silnia 3! to 6.`.

    	**Silnia** to wynik mno�enia wszystkich liczb ca�kowitych od jeden do podanej liczby w��cznie, czyli:

    	```
    	5! = 1*2*3*4*5 = 120
    	
    */
    	int x = 4;
    	int factorial = 1;
    	
    	for (int a=1;a<=x;a++){
    		factorial = factorial*a;
    	}
    		System.out.print("Silnia "+x+"! to "+factorial+".");
    }		
}


