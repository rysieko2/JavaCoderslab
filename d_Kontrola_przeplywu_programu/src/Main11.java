
public class Main11 {

    public static void main(String[] args) {
    /*	W pliku `Main11.java` napisz program rysuj�cy, na podstawie warto�ci zmiennej `n`, nast�puj�cy schemat (tutaj dla ```n = 5```):

    		```
    		* 2 3 4 5
    		* * 3 4 5
    		* * * 4 5
    		* * * * 5
    		* * * * *
    		* * * * *
    		* * * * 5
    		* * * 4 5
    		* * 3 4 5
    		* 2 3 4 5
    		```

    		Do stworzenia takiego zapisu, w �rodku zagnie�d�onej p�tli, u�yj wyra�enia warunkowego `if`, dzi�ki kt�remu zdecydujesz czy wypisa� gwiazdk�, czy licznik z zagnie�d�onej p�tli.
   */ 
    	int n = 6;
       	for (int x=1;x<n;x++){
    		String wiersz = "";	
    		for (int y=1;y<n;y++){
    			if (x<=y-1){
    				wiersz += (y+" ");
    			}else{
    				wiersz += ("* ");
    			}
    		}
    		System.out.print(wiersz+"\n" );
    	}
       	for (int x=n;x>1;x--){
    		String wiersz = "";	
    		for (int y=1;y<n;y++){
    			if (y<x){
    				wiersz += ("* ");
    			}else{
    				wiersz += (y+" ");
    			}
    		}
    		System.out.print(wiersz+"\n" );
       	}
    }
}