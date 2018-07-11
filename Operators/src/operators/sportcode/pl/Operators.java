package operators.sportcode.pl;

public class Operators 
{
	public  static void main(String[] args)
	{
		double number1 = 12.34 ; 
		double number2 = 34.56 ; 
		double sum ; 
		double difference ; 
		double product ; 
		double division ;
		double modulo ; 
		
	    sum = number1 + number2 ;
	    System.out.println("Suma liczb "+number1+" i "+number2+" wynosi "+sum);
	    difference = number1 - number2 ;
	    System.out.println("Ró¿nica liczb "+number1+" i "+number2+" wynosi "+difference);
	    product = number1 * number2 ;
	    System.out.println("Iloczyn dwoch liczb "+number1+" i "+number2+" wynosi "+product);
	    division = number1 / number2 ;
	    System.out.println("Wynik dzielenia dwoch liczb "+number1+" i "+number2+" wynosi "+division);
	    modulo = number1 % number2 ;
	    System.out.println("Wynik modulo dwoch liczb "+number1+" i "+number2+" wynosi "+modulo);
	    sum++ ; 
	    System.out.println("Suma dwoch liczb po inkrementacji wynosi "+sum);
	    sum-- ; 
	    sum-- ; 
	    System.out.println("Suma dwoch liczb po dekrementacji wynosi "+sum);
	}
}
