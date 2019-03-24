public class Main16 {
    public static void main(String[] args) {
    /*	W pliku `Main16.java` utwórz dwie zmienne: `x` i `y`, bêd¹ce dodatnimi liczbami ca³kowitymi.

    	1. Napisz program wyliczaj¹cy najwiêkszy wspólny dzielnik (*greatest common divisor – GDC*) dwóch liczb.
    	2. Skorzystaj z opisu na tej [stronie][GDC].
    	3. Wynik wyœwietl w konsoli wraz z liczbami, dla których zosta³ wyliczony, wg wzoru: `Dla liczb 420 i 168 GDC to: 84`.
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
