public class Main12 {

    public static void main(String[] args) {
    /*	#### Zadanie 12 – **dodatkowe**

    	1. W pliku `Main12.java` napisz program definiuj¹cy trzy liczby w zmiennych: `a, b, c`.
    	2. Program ma sprawdziæ, czy podane liczby mog¹ byæ bokami trójk¹ta.
    	3. Tê figurê geometryczn¹ mo¿na zbudowaæ z trzech linii tylko wtedy, gdy suma d³ugoœci dwóch z nich jest wiêksza ni¿ d³ugoœæ trzeciej linii, czyli:

    	```
    	a + b > c
    	c + b > a
    	a + c > b
    	```

    	Po sprawdzeniu wypisz na konsoli odpowiedni¹ informacjê, wg poni¿szego wzoru:  
    	  
    	`Z podanych boków mo¿na zbudowaæ trójk¹t.`  
    	  
    	lub  

    	`Z podanych boków nie mo¿na zbudowaæ trójk¹ta.`
    */	
    	int a,b,c;
    	a=2;
    	b=2;
    	c=4;
    	
    	if (a+b>c && c + b > a && a + c > b){
    		System.out.print("Z podanych boków mo¿na zbudowaæ trójk¹t.");
    	}
    	else{
    		System.out.print("Z podanych boków nie mo¿na zbudowaæ trójk¹ta.");
    		}
   }
}


