
public class Main13 {

    public static void main(String[] args) {
  /*  	W pliku `Main13.java` napisz program, który wystawi ocenê z testu.

    	* `0-39` pkt – ocena niedostateczna 
    	* `40-54` pkt – ocena dopuszczaj¹ca 
    	* `55-69` pkt – ocena dostateczna 
    	* `70-84` pkt – ocena dobra 
    	* `85-98` pkt – ocena bardzo dobra 
    	* `99-100` pkt – ocena celuj¹ca

    	1. Stwórz zmienn¹ `points`, do której bêdzie przypisany wynik z testu.
    	2. Na pocz¹tku sprawdŸ, czy liczba punktów jest:
    	* wiêksza b¹dŸ równa `0`, jeœli nie – wypisz na konsoli komunikat: `Liczba punktów mniejsza ni¿ 0.`;
    	* mniejsza b¹dŸ równa `100`, jeœli nie – wypisz na konsoli komunikat: `Liczba punktów wiêksza ni¿ 100.`.
    	4. Nastêpnie sprawdŸ jaka ocena odpowiada danej liczbie punktów i wypisz j¹ na konsoli wg wzoru: `Wynik: ocena dobra`.
    	5. Rozwi¹¿ to zadanie u¿ywaj¹c konstrukcji `if ... else if ... else`.
   */
    	int points=50;
    	
    	if (points >100){
        	System.out.print("Liczba punktów wiêksza ni¿ 100");	
    	}else if (points >98){
    		System.out.print("`99-100` pkt – ocena celuj¹ca");	
    	}else if (points >84){
    		System.out.print("`85-98` pkt – ocena bardzo dobra ");		
    	}else if (points >69){
    		System.out.print("`70-84` pkt – ocena dobra ");	
    	}else if (points >54){
    		System.out.print("`55-69` pkt – ocena dostateczna ");		
    	}else if (points >39){
    		System.out.print("40-54` pkt – ocena dopuszczaj¹ca ");
    	}else if (points >=0){
    		System.out.print("0-39` pkt – ocena niedostateczna");	
    	}else{
    		System.out.print("Liczba punktów mniejsza ni¿ 0.");
    	}
    }
}
