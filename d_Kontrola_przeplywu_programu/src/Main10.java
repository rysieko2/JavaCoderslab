
public class Main10 {

    public static void main(String[] args) {
  /*  	W pliku `Main10.java` napisz program rysuj�cy na podstawie warto�ci zmiennej `n` nast�puj�cy schemat (tutaj dla ```n = 5```).  

    	```
    	*
    	* *
    	* * *
    	* * * *
    	* * * * *
    	```

    	Mo�esz to zadanie rozwi�za� na dwa sposoby:

    	1. u�ywaj�c p�tli zale�nych,
    	2. u�ywaj�c p�tli niezale�nych i instrukcji warunkowej `if`.

    	*Wzoruj si� na poprzednich zadaniach. Trzeba tutaj troch� pomy�le� i rozumie� p�tle zagnie�d�one.*
    */
    	int n = 10;
       	for (int x=1;x<n;x++){
    		String wiersz = "";	
    		for (int y=1;y<n;y++){
    				if (x>=y){
    					wiersz += ("* ");
    				}
    		}
    		System.out.print(wiersz+"\n" );
    	}
    }
}
