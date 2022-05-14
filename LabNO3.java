package NuevoProyectoLab3.com;


import java.io.PrintWriter;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab3 {

    public void factorial() {}
    static int factorial(int n){
        if(n==0){
            return 1; //Caso Base
        }
        else {
            return n * factorial(n-1);  //Fórmula Recursiva
        }
    }
    ///////////////////////////////////////////////////////////////////////////
    public void posneg () {}
    static boolean positivo(int n){
        if(n<0) return false;
        else return negativo(n);
    }

    public static boolean negativo(int n){
        if(n>0) return true;
        else return  positivo(n);
    }
    ///////////////////////////////////////////////////////////////////////////
    public void fibonaci () {}
    static int fibonaci(int n){
        if(n==1 || n==2) {
            return 1;
        }
        else{
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }
    ///////////////////////////////////////////////////////////////////////////
    public void divrestsus() {}
    static 	int division (int a, int b)
    {
        if(b > a) {
            return 0;
        }
        else {
            return division(a-b, b) + 1;

        }
    }
    ///////////////////////////////////////////////////////////////////////////
    public void invertir() {}
    static int invertir (int n) {
        if (n < 10) {         //caso base
            return n;
        }
        else {
            return (n % 10) * ((int) Math.pow(10, (int) Math.log10(n))) + invertir(n / 10);
        }
    }

    public void sumar_dig() {}
    static 	int sumar_dig (int n) {
        if (n == 0) {      //caso base
            return n;
        }
        else {
            return sumar_dig (n / 10) + (n % 10);
        }
    }
    
    
    public void mult_rusa() {}
    static 	int mult_rusa(int A, int B) {
        if(A==1){
            return (B);
        }
        if(A%2!=0){
            return (B+mult_rusa( A/2 , B*2));
        }
        else{
            return(mult_rusa( A/2 , B*2));
        }
    }
    
   
  
    public void cuadrado() {}
    static int cuadrado (int n){
        if (n== 1)
	return  1 ;
        	else
	return cuadrado ( n-1) +(2*n -1) ;
    }

    
   public static int SumaRecur (int n)
    { 
	   if(n == 1)
           return 1;
        else
           return n + SumaRecur(n-1);
    }
   static int sumar1_100_pares_rec1 (int n )
    {
        if ( n < 0 || n >=100) {
                    return 0;   
            }
        else {
            if (n%2 == 0)
               return n + sumar1_100_pares_rec1 (n+2);
            else 
                 return sumar1_100_pares_rec1 (n+1);
            
        }
 }
   static int sumar1_100_pares_rec_porCola (int n)
   {
           if ( n ==100){
                       return 100;   
               }
           else {
        	   int total = (n+2) +(n+2);
            return n + sumar1_100_pares_rec_porCola (total);
           }
    } 
    
    
    
     static int sumar1_100_pares_rec2 (int n )
   {
           if ( n < 0 || n >=100) {
                       return 0;   
               }
           else {
               if (n%2 == 0)
                  return n + sumar1_100_pares_rec1 (n+2);
               else 
                    return sumar1_100_pares_rec1 (n+1);
               
           }
   }
        
    
     int sumarRangoValoresMultiploDado (int ini, int fin, int multiplo )
   { int suma =0;
       for (int i = ini; i<= fin; i++){
           if (i%multiplo == 0)
           {suma = suma + i;}
       }
       return suma;
    }
   
   
   public  static int  cuentaAtrasRec2  ( int n) {
       if  ( n==0) {
              return 1 ;  
        
       } else {
           System.out.println(n);
   }  return cuentaAtrasRec2 (n-1);
       }
 
   public static long PotenciaMN  (long numPot, long numPot2)
   {
	    if (numPot2== 1) {
	        return numPot;
	    } else {
	        return numPot * PotenciaMN(numPot, numPot2-1);
	    }
   }
   
   public static  String ReverseString  (String cad)
   {
    if (cad.length() == 1)
       return cad;
   else
       return     ReverseString (cad.substring(1)) + cad.substring(0 ,1)  ;
    // la clave es  el orden donde se hace el llamado.
    // el metodo substring funciona como un vector, donde la primera posicion es 0
   }
   
   public static int combinaciones (int n, int m){
	    if ((m == 0) || (m == n))
	    return 1;
	    else
	    return combinaciones(n-1, m) + combinaciones(n-1, m-1);
	    }   
   
///////////////////////////////////////////////////////////////////////////	 

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion, opcion2, opcion3;
        int valor1= 0;
        while(!salir){
            System.out.println("Escribe 1 para Calcular el Factorial ");
            System.out.println("Escribe 2 para Positivo? o Negativo? ");
            System.out.println("Escribe 3 para Serie Fibonacci ");
            System.out.println("Escribe 4 para división por restas sucesivas");
            System.out.println("Escribe 5 para Invertir un número");
            System.out.println("Escribe 6 para sumar los dígitos de un número");
            System.out.println("Escribe 7 para Multiplicación utilizando el método Ruso");
            System.out.println("Escribe 8 para Calcular el cuadrado");
            System.out.println("Escribe 9 para contar atras metodo recursivo");
            System.out.println("Escribe 10 para potencial de un numero");
            System.out.println("Escribe 11 para Invertir String");
            System.out.println("Escribe 12 para combinar los numeros");
            System.out.println("Escribe 13 para Suma de numeros recursivo");
            System.out.println("Escribe 14 para salir");
            System.out.println("Solo números entre 1 y 13");
            
            opcion = sn.nextInt();
            
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese un número para Calcular el Factorial");
                    int FACT = sn.nextInt();
                    int F1 = factorial(FACT);
                    System.out.println("El Factorial de "+FACT+" es "+F1);
                    System.out.println("-------------------------------------------");
                    break;
                case 2:
                    System.out.println("Positivo? o Negativo? Ingrese un número");
                    int  NUM = sn.nextInt();
                    boolean RESP=positivo(NUM);
                    String RESP2;
                    if (RESP==true) {
                        RESP2="Positivo";
                    }
                    else {
                        RESP2="Negativo";

                    }
                    System.out.println("El Número es "+RESP2);
                      System.out.println("-------------------------------------------");
                  break;
                case 3:
                    System.out.println("Ingrese un número para Fibonacci");
                    int FIBO = sn.nextInt();
                    int FIBO2 = fibonaci(FIBO);
                    System.out.println("El Calculo de la Serie Fibonacci es "+FIBO2);
                     System.out.println("-------------------------------------------");
                     break;
                case 4:
                    System.out.println("Ingrese el primer números para división por restas sucesivas");
                    int DIV1 = sn.nextInt();
                    System.out.println("Ingrese el primer números para división por restas sucesivas");
                    int DIV2 = sn.nextInt();
                    int DIV3 = division(DIV1,DIV2);
                    System.out.println("División por restas sucesivas:  "+DIV3);
                    System.out.println("-------------------------------------------");
                    break;
                case 5:
                    System.out.println("Ingrese el número a invertir");
                    int INV1 = sn.nextInt();
                    int INV2 = invertir(INV1);
                    System.out.println("El número invertido es:  "+INV2);
                    System.out.println("-------------------------------------------");
                    break;
                case 6:
                    System.out.println("Ingrese el número para sumar sus digitos");
                    int SUM1 = sn.nextInt();
                    int SUM2 = sumar_dig(SUM1);
                    System.out.println("La suma de los digitos de "+ SUM1 + " es:  "+SUM2);
                    System.out.println("-------------------------------------------");
                    break;
                case 7:
                    System.out.println("Ingrese el primer numero para Multiplicar");
                    int MULT1 = sn.nextInt();
                    System.out.println("Ingrese el segundo numero para Multiplicar");
                    int MULT2 = sn.nextInt();
                    int MULT3 = mult_rusa(MULT1,MULT2);
                    System.out.println("El resultado por método Ruso es :  "+MULT3);
                    System.out.println("-------------------------------------------");
                    break;
                case 8:
                	System.out.println("Ingrese el numero para calcular cuadrado por cola");
                	int cuaCola = sn.nextInt();
                	int cuadradoCola2 = cuadrado(cuaCola);
                	System.out.println("El resultado del cuadrado por cola es:\t"+ cuadradoCola2);
                	System.out.println("-------------------------------------------");
                	break;
                case 9:
                	System.out.println("Introduzca el numero que quieres retroceder:");
                    int num4 = sn.nextInt();
                    num4 = cuentaAtrasRec2(num4);
                	System.out.println("-------------------------------------------");
                	break;
                case 10:
                	System.out.println("Introduzca el primer numero que quieres sacar la potencia:");
                	long numPot = sn.nextLong();
                	System.out.println("Introduzca el numero de la potencia:");
                	long numPot2 = sn.nextLong();
                	long result =  PotenciaMN(numPot,numPot2);
                    System.out.println("La potencia es:"+ result);
                	System.out.println("-------------------------------------------");
                	break;
                case 11:
                	
                	System.out.println("Introduzca la palabra que desea invertir:");
                	String palabra = sn.next();
                	String reverseStr = ReverseString(palabra);
            		System.out.println(reverseStr);
            		System.out.println("-------------------------------------------");
                	System.out.println("-------------------------------------------");
                	break;
                	
                case 12:
                	System.out.println("Introduzca el primer numero que desea combinar:");
                	int n = sn.nextInt();
                	System.out.println("Introduzca el segundo numero que desea combinar:");
                	int m = sn.nextInt();
                	int resu = combinaciones(n,m);
            		System.out.println(n+""+m);
            		System.out.println("-------------------------------------------");
               break;
               case 13:
                	System.out.println("Introduzca el numero para la suma recursiva:");
                	int numArray = sn.nextInt();
                	
                	int sumRec = numArray;
					Scanner op = new Scanner(System.in);
					System.out.println("Elija una de las siguientes opciones");
					
					if (opcion == 9) {
                		 while(!salir){
                			  	System.out.println("Escribe 1 para Sumar recursivamente");
                	            System.out.println("Escribe 1 para Sumar desde ese numero hasta el 100, solo pares ");
                	            System.out.println("Escribe 3 para continuar ");
                	            System.out.println("Escribe 4 para sumar por cola");
                	            System.out.println("Escribe 5 para salir");
                	            opcion2 = op.nextInt();
                	          //boolean salir1 = false;
            	            switch(opcion2) {
            	            case 1:
            	            	System.out.println("La suma recursiva es:");
            	            	sumRec = SumaRecur(numArray);
            	            	System.out.println( sumRec);
            	            	System.out.println("-------------------------------------------"); 	
        	            	break;
            	            case 2:
                        		System.out.println("La suma recursiva de numeros pares hasta el 100 es:");
                        		int numArray1 = numArray;
                            	numArray1 = sumar1_100_pares_rec1(numArray1);
                            	System.out.println(numArray1);
                            	System.out.println("-------------------------------------------"); 	
            	           break;
            	           case 3:
            	            	System.out.println("La suma recursiva de numeros pares hasta el 100 por cola es:");
                        		int numCola = numArray;
                            	numCola= sumar1_100_pares_rec_porCola(numCola);
                            	System.out.println(numCola);
                            	System.out.println("-------------------------------------------"); 	
            	           break;
            	           case 4:
            	            	System.out.println("La suma recursiva de numeros pares hasta el 100 por cola es:");
                        		int numRango = numArray;
                        		numRango= sumar1_100_pares_rec2(numRango);
                            	System.out.println(numRango);
                            	System.out.println("-------------------------------------------"); 	
            	           break;
            	           //sacar salida
            	           String i= "s";
            	           i = sn.next();
            	           
            	           default:
            	            }
                		 }
					}
            	           
            	        /* case 5:
            	        	   salir=true;
                           	System.out.println("Hasta luego, nos vemos pronto.");
                           	break;
            	          
                           	System.out.println("-------------------------------------------"); 	
*/
                           
            	           
					
                		 
					
					
                            	/*case 5:
            					System.out.println("Escribe 1 para continuar");
                 	           int valor1 = op.n
                 	           extInt();
                 	          
                 	           System.out.println(valor1);
            	            break;
            				case 6:
             	            	System.out.println("La suma recursiva es:");
            	            	sumRec = SumaRecur(numArray);
            	            	System.out.println( sumRec);
             	            }*/
            	            
              
                	
                	/*while (opcion3) {
                		
                	}*/
					
					switch (opcion3) {
            	   case 14:
                	salir=true;
                	System.out.println("Hasta luego, nos vemos pronto.");
                	break;
                	
                default:
                	System.out.println("-------------------------------------------"); 	

                        	}    	             
            	        }
                	}
    }
    }
