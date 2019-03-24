import java.util.Scanner;
public class CiagFibonacciego

{
	public static void main(String[] args)
	{
		System.out.print("Podaj ile wyswietlic liczb Ciagu Fibonnaciego:"); //wyświetla napis
		Scanner klawiatura = new Scanner(System.in);				
		int x = klawiatura.nextInt();  						//pobiera dane z klawiatury dla x
	//	System.out.println(x);
		long fib[] = new long[x];   						//deklaracja długości tablicy

			fib[0]=1; 							// dodanie do tablicy 1 elementu wartość 1
			fib[1]=1;
					
											// dodanie do tablicy 1 elementu wartość 1

			for (int i=2; i<x; i++)  					//użycie pętli for licznik od 2 do mniejszej od x

				fib[i] = fib[i-2] + fib[i-1];				//dodanie do tablicy



		System.out.print("Fibonacci dla "+ x + " elelentow:("); 

		for (int i=0; i<x; i++)  
			if (i<x-1)
			System.out.print(fib[i] + ",");
			else
			System.out.print(fib[i] + ")");
	 }
}
