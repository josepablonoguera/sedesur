import java.util.Scanner;
public class Ejercicio_6{

public static void main(String[] args){

Scanner entrada = new Scanner(System.in);

double interes=0, sumainteres=0;
double cuenta=1000000;


for(int i=1; i<=10; i++){

	interes=(double)(cuenta*0.05);

	System.out.println("interes en el a�o "+ i + " = " + interes);

	cuenta=(cuenta+interes);
	sumainteres=sumainteres+interes;
	System.out.println("Saldo final en el a�o "+ i + " = " + cuenta);
	}


	System.out.println("Total de interes ganado " + sumainteres);

}

}