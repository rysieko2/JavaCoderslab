
public class Main13 {

    public static void main(String[] args) {
  /*  	W pliku `Main13.java` napisz program, kt�ry wystawi ocen� z testu.

    	* `0-39` pkt � ocena niedostateczna 
    	* `40-54` pkt � ocena dopuszczaj�ca 
    	* `55-69` pkt � ocena dostateczna 
    	* `70-84` pkt � ocena dobra 
    	* `85-98` pkt � ocena bardzo dobra 
    	* `99-100` pkt � ocena celuj�ca

    	1. Stw�rz zmienn� `points`, do kt�rej b�dzie przypisany wynik z testu.
    	2. Na pocz�tku sprawd�, czy liczba punkt�w jest:
    	* wi�ksza b�d� r�wna `0`, je�li nie � wypisz na konsoli komunikat: `Liczba punkt�w mniejsza ni� 0.`;
    	* mniejsza b�d� r�wna `100`, je�li nie � wypisz na konsoli komunikat: `Liczba punkt�w wi�ksza ni� 100.`.
    	4. Nast�pnie sprawd� jaka ocena odpowiada danej liczbie punkt�w i wypisz j� na konsoli wg wzoru: `Wynik: ocena dobra`.
    	5. Rozwi�� to zadanie u�ywaj�c konstrukcji `if ... else if ... else`.
   */
    	int points=50;
    	
    	if (points >100){
        	System.out.print("Liczba punkt�w wi�ksza ni� 100");	
    	}else if (points >98){
    		System.out.print("`99-100` pkt � ocena celuj�ca");	
    	}else if (points >84){
    		System.out.print("`85-98` pkt � ocena bardzo dobra ");		
    	}else if (points >69){
    		System.out.print("`70-84` pkt � ocena dobra ");	
    	}else if (points >54){
    		System.out.print("`55-69` pkt � ocena dostateczna ");		
    	}else if (points >39){
    		System.out.print("40-54` pkt � ocena dopuszczaj�ca ");
    	}else if (points >=0){
    		System.out.print("0-39` pkt � ocena niedostateczna");	
    	}else{
    		System.out.print("Liczba punkt�w mniejsza ni� 0.");
    	}
    }
}
