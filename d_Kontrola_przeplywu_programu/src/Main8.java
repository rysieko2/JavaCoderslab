
public class Main8 {

	public static void main(String[] args) {
	/*	W pliku `Main8.java`, jest program, kt�ry wypisuje w konsoli
		schemat z `n` gwiazdek, taki jak poni�ej.  
		Przeanalizuj go bardzo dok�adnie.
		Przyk�ad dla  ```n = 5```:

		```
		* * * * *
		* * * * *
		* * * * *
		* * * * *
		* * * * *
		```

		U�ywamy do tego zadania p�tli zagnie�d�onych! 
	 */
				
		//definicja zmiennej z liczbą rzędów i gwiazdek w wierszu
	    int n = 5;

	    //tworzymy pętlę która będzie generowała nam WIERSZE
	    for (int i = 0; i < n; i++) {
	        String row = "";//zmienna która jest zerowana na początku każdej iteracji, przechowująca gwiazdki z wiersza

	        //tworzymy pętlę generującą nam gwiazdki w wierszu
	        for (int j = 0; j < n; j++) {
	            row += "* ";
	        }
	        System.out.print(row + "\n");//wyświetlamy gwiazdki z wiersza i dodajemy znak nowej lini
	    }
	}

}
