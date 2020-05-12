import java.util.Scanner;

class EcuacionDeSegundoGrado
{
	public static void main( String[] args )
	{
		double[] abc = new double[3];
		//arreglo para guardar las variables a, b y c dentro de la formula
		double x1, x2;
		//declaro las variables x1 y x2 para cuando la ecuación llegue a 
		//resolver la parte "+- sqrt( b^2 - 4ac )" asignando a x1 la raíz positiva
		//y a x2 la raíz negativa
		String raizNegativa;
		//verifico si el contenido de la raíz es negativo entonces no sigo
		//desarrollando la ecuación
		Scanner scan = new Scanner( System.in );
		//instancio la clase para que el usuario pueda interactuar con el programa

		System.out.println( "\nLa formula de la ecuación de segundo grado es: ax^2 + bx + c = 0" );
		//muestro la formula de la ecuación del segundo grado
		System.out.println( "\nLa formula para hallar el valor de x es: " +
				"x = ( -b +- sqrt( b^2 - 4ac ) ) / 2a\n" );
		//muestro cómo es la formula general para resolver la incógnita de
		//la ecuación de segundo grado
		
		do
		{
			System.out.print( "Ingrese el valor de \"a\" diferente de 0: " );
			//pido al usuario ingresar el valor de "a"
			abc[0] = scan.nextInt();
			scan.nextLine();
			//leo el valor que ingrese el usuario y recojo el salto de linea con nextLine
		} while( abc[0] == 0 );
		//el programa permanecerá en el bucle mientras que "a" es 0

		System.out.print( "Ingrese el valor de \"b\": " );
		//pido el valor de "b"
		abc[1] = scan.nextInt();
		scan.nextLine();
		//leo el valor de "b"

		System.out.print( "Ingrese el valor de \"c\": " );
		//pido el valor de "c"
		abc[2] = scan.nextInt();
		scan.nextLine();
		//leo el valor de "c"

		//aplico la formula y voy mostrando al usuario cómo desarrollar la ecuación de
		//segundo grado

		System.out.println( "\nx = " + ( abc[1] * (-1) ) +
				" +- sqrt( " + abc[1] + "^2 -4*" + abc[0] + "*" + abc[2] + " )" +
				" / " + "2*" + abc[0] );
		System.out.println( "\nx = " + ( abc[1] * (-1) ) +
				" +- sqrt( " + ( abc[1] * abc[1] ) + " " + ( -4 * abc[0] * abc[2] ) + " )" +
				" / " + ( 2 * abc[0] ) );
		System.out.println( "\nx = " + ( abc[1] * (-1) ) +
				" +- sqrt( " + ( abc[1] * abc[1] -4 * abc[0] * abc[2] ) + " )" +
				" / " + ( 2 * abc[0] ) );

		raizNegativa = Double.toString( abc[1] * abc[1] -4 * abc[0] * abc[2] );
		
		//si el contenido de la raíz no es negativo sigo con el programa
		switch( raizNegativa.charAt( 0 ) )
		{
			case '-':
				System.out.println( "\nLa raíz es un número imaginario, " +
						"no se puede seguir resolviendo la ecuación" );
				System.out.println( "\nx = " + ( abc[1] * (-1) ) +
					" +- sqrt( " + ( abc[1] * abc[1] -4 * abc[0] * abc[2] ) + " )" +
					" / " + ( 2 * abc[0] ) );
				break;
			
			default:
				System.out.println( "\nx = " + ( abc[1] * (-1) ) +
					" +- " + Math.sqrt( abc[1] * abc[1] -4 * abc[0] * abc[2] ) +
					" / " + ( 2 * abc[0] ) );

				//llegó a la parte de "+- sqrt( ? )" se debe continuar con x1 y x2
				System.out.println( "\nx1 con raíz positiva: " );

				System.out.println( "\nx1 = " + ( abc[1] * (-1) ) +
					" + " + Math.sqrt( abc[1] * abc[1] -4 * abc[0] * abc[2] ) +
					" / " + ( 2 * abc[0] ) );
				System.out.println( "\nx1 = " +
					( abc[1] * (-1) + Math.sqrt( abc[1] * abc[1] -4 * abc[0] * abc[2] ) ) +
					" / " + ( 2 * abc[0] ) );

				x1 = ( abc[1] * (-1) + Math.sqrt( abc[1] * abc[1] -4 * abc[0] * abc[2] ) ) /
					( 2 * abc[0] );

				System.out.println( "\nx1 = " + x1 );

				//ahora utiliza x2 con la raíz negativa
				System.out.println( "\nx2 con raíz negativa: " );

				System.out.println( "\nx2 = " + ( abc[1] * (-1) ) +
					" - " + Math.sqrt( abc[1] * abc[1] -4 * abc[0] * abc[2] ) +
					" / " + ( 2 * abc[0] ) );
				System.out.println( "\nx2 = " +
					( abc[1] * (-1) - Math.sqrt( abc[1] * abc[1] -4 * abc[0] * abc[2] ) ) +
					" / " + ( 2 * abc[0] ) );

				x2 = ( abc[1] * (-1) - Math.sqrt( abc[1] * abc[1] -4 * abc[0] * abc[2] ) ) /
					( 2 * abc[0] );

				System.out.println( "\nx2 = " + x2 );

				//parte de comprobación utilizando x1
				System.out.println( "\nComprobación utilizando x1: " );

				System.out.println( "\na*" + x1 + "^2 + b*" + x1 + " + c = " + 
						( abc[0] * ( x1 * x1 ) + abc[1] * x1 + abc[2] ) );

				//parte de comprobación utilizando x2
				System.out.println( "\nComprobación utilizando x2: " );

				System.out.println( "\na*" + x2 + "^2 + b*" + x2 + " + c = " + 
						( abc[0] * ( x2 * x2 ) + abc[1] * x2 + abc[2] ) );
				
		}
	}
}
