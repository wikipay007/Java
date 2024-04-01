/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
	Scanner scanner = new Scanner (System.in);
	int a;
	  System.out.
	  println
	  ("Escolha uma opC'C#o:\n 1- Soma \n 2- SubtraC'C#o\n 3 - Calculo de perimetro\n 4 - Calculo de area\n");
	  a = scanner.nextInt ();
	switch (a)
	  {
	  case 1:
		System.out.println ("Soma");
		int numUm;
		int numDois;
		  System.out.println ("Digite o primeiro numero");
		  numUm = scanner.nextInt ();
		  System.out.println ("Digite o segundo numero");
		  numDois = scanner.nextInt ();
		int resultado = numUm + numDois;
		  System.out.println ("Resultado igual a " + resultado);
		  break;
		case 2:System.out.println ("Subtração");
		int numA;
		int numB;
		  System.out.println ("Digite o primeiro numero:");
		  numA = scanner.nextInt ();
		  System.out.println ("Digite o segundo numero:");
		  numB = scanner.nextInt ();
		int result = numA - numB;
		  System.out.println ("O resultado C) " + result);
		  break;
		case 3:System.out.println ("Calculo de perimetro");
		double ladoUm;
		double ladoDois;
		double ladoTres;
		double ladoQuatro;
		  System.out.println ("Qual a medida do lado 1?");
		  ladoUm = scanner.nextDouble ();
		  System.out.println ("Qual a medida do lado 2?");
		  ladoDois = scanner.nextDouble();
		  System.out.println("Qual a medida do lado 3?");
		  ladoTres = scanner.nextDouble();
		  System.out.println("Qual a medida do lado 4?");
		  ladoQuatro= scanner.nextDouble();
		  double resultOfPeri = ladoUm+ladoDois+ladoTres+ladoQuatro;
		  System.out.println("O perimetro é "+ resultOfPeri);
		  break;
		default:System.out.println ("Numero invalido");
	  }























  }
}
