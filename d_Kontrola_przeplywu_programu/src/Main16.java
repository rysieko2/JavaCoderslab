public class Main16 {
    public static void main(String[] args) {
    /*	W pliku `Main16.java` utw�rz dwie zmienne: `x` i `y`, b�d�ce dodatnimi liczbami ca�kowitymi.

    	1. Napisz program wyliczaj�cy najwi�kszy wsp�lny dzielnik (*greatest common divisor � GDC*) dw�ch liczb.
    	2. Skorzystaj z opisu na tej [stronie][GDC].
    	3. Wynik wy�wietl w konsoli wraz z liczbami, dla kt�rych zosta� wyliczony, wg wzoru: `Dla liczb 420 i 168 GDC to: 84`.
   */
    	int x =1420,y=2168, gdc=1; 
   
    	for (int n=1;n<=x && y<=y;n++){
    		if(x%n==0 && y%n==0){
    			gdc = n;
    		}
    	}
    	System.out.print("Dla liczb "+x+" i "+y+" GDC to: "+gdc);	
    }

}
