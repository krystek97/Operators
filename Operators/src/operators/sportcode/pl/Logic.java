package operators.sportcode.pl;

public class Logic 
{
	public static void main(String[] args)
	{
	double number1 = 34.56 ;
	double number2 = 56.78 ; 
	boolean greater = number2 > number1;
	boolean less = number2 < number1 ;
	boolean equal = number2 == number1 ;
	boolean conjunction = (number2 > number1) && (number2 != number1) ; 
	
	System.out.println("Liczba "+number2+" jest wieksza od liczby "+number1+" : "+greater);
	System.out.println("Liczba "+number2+" jest mniejsza od liczby "+number1+" : "+less);
	System.out.println("Liczba "+number2+" jest rowna "+number1+" : "+equal);
	System.out.println("Liczba "+number1+" jest mniejsza od liczby "+number2+" i liczba "+number2
	+" nie jest rowna "+number1) ;
	
	}
}

