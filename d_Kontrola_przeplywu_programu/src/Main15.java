
public class Main15 {

    public static void main(String[] args) {
    /*	#### Zadanie 15 – **dodatkowe**

    	W pliku `Main15.java`  

    	1. Napisz program licz¹cy wartoœæ `x!`, gdzie `!` oznacza silniê, a `x` jest zmienn¹.  
    	2. U¿yj do tego obu znanych Ci pêtli.
    	3. Silnia ma byæ zapisana do zmiennej `factorial`.
    	4. Po wyliczeniu silni wyœwietl w konsoli komunikat wg wzoru: `Silnia 3! to 6.`.

    	**Silnia** to wynik mno¿enia wszystkich liczb ca³kowitych od jeden do podanej liczby w³¹cznie, czyli:

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


