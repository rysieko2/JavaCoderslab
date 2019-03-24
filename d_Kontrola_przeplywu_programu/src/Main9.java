
public class Main9 {

    public static void main(String[] args) {
    /*	W pliku `Main9.java` napisz program rysuj¹cy, na podstawie wartoœci zmiennej `n`, nastêpuj¹cy schemat:

    		Przyk³ad dla `n = 5`
    		```
    		* 2 3 4 5
    		* * 3 4 5
    		* * * 4 5
    		* * * * 5
    		* * * * *
    		```

    		Przyk³ad dla `n = 3`  
    		```
    		* 2 3
    		* * 3
    		* * *
    		```

    		Do stworzenia takiego zapisu, w œrodku zagnie¿d¿onej pêtli, u¿yj wyra¿enia warunkowego `if`, dziêki któremu zdecydujesz czy wypisaæ gwiazdkê, czy licznik z zagnie¿d¿onej pêtli. 
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