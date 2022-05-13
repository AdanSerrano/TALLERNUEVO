import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;
public class LabNO3 {

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
     
   
   
   public  static int  cuentaAtrasRec2  ( int n) {
       if  ( n==0) {
              return 1 ;  
        
       } else {
           System.out.println(n);
   }  return cuentaAtrasRec2 (n-1);
       }
 
   
   
 
   
   
   
   
///////////////////////////////////////////////////////////////////////////	 

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion, opcion2;
        while(!salir){
            System.out.println("Escribe 1 para Calcular el Factorial ");
            System.out.println("Escribe 2 para Positivo? o Negativo? ");
            System.out.println("Escribe 3 para Serie Fibonacci ");
            System.out.println("Escribe 4 para división por restas sucesivas");
            System.out.println("Escribe 5 para Invertir un número");
            System.out.println("Escribe 6 para sumar los dígitos de un número");
            System.out.println("Escribe 7 para Multiplicación utilizando el método Ruso");
            System.out.println("Escribe 8 para Calcular el cuadrado");
            System.out.println("Escribe 9 para Suma de numeros recursivo");
            System.out.println("Escribe 10 para contar atras metodo recursivo");
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
                	break;
                case 9:
                	System.out.println("Introduzca el primer numero:");
                	int numArray = sn.nextInt();
					int sumRec = SumaRecur(numArray);
                	System.out.println("La suma recursiva es: "+ sumRec);
                	System.out.println("-------------------------------------------");
                	
                case 10:
                	System.out.println("Introduzca el numero que quieres retroceder:");
                    int num4 = sn.nextInt();
                    num4 = cuentaAtrasRec2(num4);
                	System.out.println("-------------------------------------------");
                	break;
                	
                	
                	
                	//salir=true;
                	//break;
                default:
                	Scanner op = new Scanner(System.in);
                	if (opcion == 9) {
                		 while(!salir){
                			  	System.out.println("Escribe 1 para Sumar desde ese numero hasta el 100, solo pares ");
                	            System.out.println("Escribe 2 para Positivo? o Negativo? ");
                	            System.out.println("Escribe 3 para Serie Fibonacci ");
                	            System.out.println("Escribe 4 para división por restas sucesivas");
                	            opcion2 = op.nextInt();
                	            
                	            
            	            switch(opcion2) {
            	            case 1:
                        		System.out.println("La suma recursiva de ese numero hasta el 100 es:");
                        		int numArray1 = sn.nextInt();
                            	numArray1 = sumar1_100_pares_rec1(numArray1);
                            	System.out.println("-------------------------------------------");
                            	
                            	
            	            case 2:
                        	}    	            
            	            
            	        }
                	}
                }
            }
        }
    }
