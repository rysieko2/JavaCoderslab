
public class Main9 {

    public static void main(String[] args) {
    /*	W pliku `Main9.java` napisz program rysuj�cy, na podstawie warto�ci zmiennej `n`, nast�puj�cy schemat:

    		Przyk�ad dla `n = 5`
    		```
    		* 2 3 4 5
    		* * 3 4 5
    		* * * 4 5
    		* * * * 5
    		* * * * *
    		```

    		Przyk�ad dla `n = 3`  
    		```
    		* 2 3
    		* * 3
    		* * *
    		```

    		Do stworzenia takiego zapisu, w �rodku zagnie�d�onej p�tli, u�yj wyra�enia warunkowego `if`, dzi�ki kt�remu zdecydujesz czy wypisa� gwiazdk�, czy licznik z zagnie�d�onej p�tli. 
    */
    	int n = 10;
       	for (int x=1;x<n;x++){
    		String wiersz = "";	
    		for (int y=1;y<n;y++){
    			if (x<=y){
    				wiersz += (y+" ");
    			}else{
    				wiersz += ("* ");
    			}
    		}
    		System.out.print(wiersz+"\n" );
    	}
    }
}