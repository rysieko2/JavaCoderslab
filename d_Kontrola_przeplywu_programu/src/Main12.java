public class Main12 {

    public static void main(String[] args) {
    /*	#### Zadanie 12 � **dodatkowe**

    	1. W pliku `Main12.java` napisz program definiuj�cy trzy liczby w zmiennych: `a, b, c`.
    	2. Program ma sprawdzi�, czy podane liczby mog� by� bokami tr�jk�ta.
    	3. T� figur� geometryczn� mo�na zbudowa� z trzech linii tylko wtedy, gdy suma d�ugo�ci dw�ch z nich jest wi�ksza ni� d�ugo�� trzeciej linii, czyli:

    	```
    	a + b > c
    	c + b > a
    	a + c > b
    	```

    	Po sprawdzeniu wypisz na konsoli odpowiedni� informacj�, wg poni�szego wzoru:  
    	  
    	`Z podanych bok�w mo�na zbudowa� tr�jk�t.`  
    	  
    	lub  

    	`Z podanych bok�w nie mo�na zbudowa� tr�jk�ta.`
    */	
    	int a,b,c;
    	a=2;
    	b=2;
    	c=4;
    	
    	if (a+b>c && c + b > a && a + c > b){
    		System.out.print("Z podanych bok�w mo�na zbudowa� tr�jk�t.");
    	}
    	else{
    		System.out.print("Z podanych bok�w nie mo�na zbudowa� tr�jk�ta.");
    		}
   }
}


