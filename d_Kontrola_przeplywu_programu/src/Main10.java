
public class Main10 {

    public static void main(String[] args) {
  /*  	W pliku `Main10.java` napisz program rysuj¹cy na podstawie wartoœci zmiennej `n` nastêpuj¹cy schemat (tutaj dla ```n = 5```).  

    	```
    	*
    	* *
    	* * *
    	* * * *
    	* * * * *
    	```

    	Mo¿esz to zadanie rozwi¹zaæ na dwa sposoby:

    	1. u¿ywaj¹c pêtli zale¿nych,
    	2. u¿ywaj¹c pêtli niezale¿nych i instrukcji warunkowej `if`.

    	*Wzoruj siê na poprzednich zadaniach. Trzeba tutaj trochê pomyœleæ i rozumieæ pêtle zagnie¿d¿one.*
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
