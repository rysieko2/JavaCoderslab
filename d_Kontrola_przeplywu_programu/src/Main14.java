
public class Main14 {

    public static void main(String[] args) {
   /* 	W pliku `Main14.java` napisz program tworz�cy tabliczk� mno�enia dla podanej zmiennej `n`. Na przyk�ad dla ```n = 3``` wynik b�dzie nast�puj�cy:

    		```
    		1 x 1 = 1  
    		1 x 2 = 2  
    		1 x 3 = 3  

    		2 x 1 = 2  
    		2 x 2 = 4  
    		2 x 3 = 6  

    		3 x 1 = 3  
    		3 x 2 = 6  
    		3 x 3 = 9  
    		```

    		Do mno�enia liczb u�yj operatora `*`.  

    		Pami�taj, aby doda� spacj� pomi�dzy liczbami i `x` oraz `=`.
    */
    	int n = 15;
    	for (int x=1;x<=n;x++){
    		for (int y=1;y<=n+1;y++){	
    			if (y==n+1){
        		System.out.print("\n");
    			}
    			else{
        		System.out.print(x +" x "+ y  +" = "+ x*y+"\n");
    			}	
	   		}
    	}
    }		
}


