//Brandon Isaias Ampérez Aldana 0909-21-4628
package calculadorab;

import java.util.Scanner;

/**
 *
 * @author aldan
 */
public class CalculadoraB {
    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
  
        
        System.out.println("--------------------------------------------------");
        System.out.println("-----Bienvenido al programa de metodos MathBA-----");
        System.out.println("--------------------------------------------------");
       
              
         Scanner sc= new Scanner(System.in);
         CalculadoraBA calculadoraB = new CalculadoraBA();
         CalculadoraEspecialBA nuevoProgramaBAC = new CalculadoraEspecialBA();
        
          int opcion =0;
          
         do{
  
              System.out.println("Ingrese la opcion que desea realizar");
              System.out.println("{1) Sumar"); 
              System.out.println("{2) Restar"); 
              System.out.println("{3) Multiplicar"); 
              System.out.println("{4) Dividir"); 
              System.out.println("{5) MostrarHistorial");
              System.out.println("{6) Salir");
              
              
              System.out.println("Ingrese la opcion que desea usar: ");
              opcion =sc.nextInt();
              switch(opcion){
                 
                 case 1:
                      
                     System.out.println("Ingrese el Primer Numero para sumar: ");
                      double primerNumero = sc.nextDouble();
         
                      System.out.println("Ingrese el Segundo Numero para sumar: ");
                      double segundoNumero = sc.nextDouble();
                      
                      System.out.println(calculadoraB.sumar(primerNumero, segundoNumero));
                      System.out.println("La suma total es de:  "+calculadoraB.sumarB);
                     
                 break;
                 
                case 2:
                    
                      System.out.println("Ingrese el Primer Numero para restar: ");
                      primerNumero = sc.nextDouble();
         
                      System.out.println("Ingrese el Segundo Numero para restar: ");
                      segundoNumero = sc.nextDouble();
                      
                      System.out.println(calculadoraB.restar(primerNumero, segundoNumero));  
                      System.out.println("Su resta total es de:  "+calculadoraB.restaB);
                     
                 break;
                 
                case 3:
                      
                      System.out.println("Ingrese el Primer Numero para multiplicar: ");
                      primerNumero = sc.nextDouble();
         
                      System.out.println("Ingrese el Segundo Numero para multiplicar: ");
                      segundoNumero = sc.nextDouble();
                      
                      System.out.println(calculadoraB.multiplicar(primerNumero, segundoNumero));  
                      System.out.println("El total de su multiplicacion es de:  "+calculadoraB.multiB);
                     
                 break;
                 
                case 4:
                      
                      System.out.println("Ingrese el Primer Numero para dividir: ");
                      primerNumero = sc.nextDouble();
         
                      System.out.println("Ingrese el Segundo Numero para dividir: ");
                      segundoNumero = sc.nextDouble();
                      
                      System.out.println(calculadoraB.dividir(primerNumero, segundoNumero));  
                      System.out.println("El total de su division es de:  "+calculadoraB.divB);
                     
                 break;
                 
                 case 5:
        
                       calculadoraB.mostrarTransacciones();
           
                 break;
                 
                  case 6:
          
                 break;
              }
         
         }while(opcion!=6);        
    
         System.out.println("El programa a finalizado");
    }
}
 

//case 1:
                 //System.out.println("Ingrese el numero que desea sacarle raiz cuadrada: ");
                 //double primerNumero = sc.nextDouble();
                  //System.out.println(calculadoraB.raizBA(primerNumero) );
                  //System.out.println("El resultado de la raiz es:  "+calculadoraB.raiz);
                 
                 //break;

                 //case 2:
                     
                      //System.out.println("Ingrese el Primer Numero: ");
                      //int primerNumeroB = sc.nextInt();
         
                      //System.out.println("Ingrese el Segundo Numero: ");
                      //int segundoNumeroB = sc.nextInt();
                      //System.out.println(calculadoraB.potenciaBA(primerNumeroB, segundoNumeroB));
                      //System.out.println("El resultado de la potencia es:  "+calculadoraB.potencia);
                     
                     
                 //break;
                
                 //case 3:
                        //System.out.println("Ingrese un Numero: ");
                        //primerNumero = sc.nextDouble();
                        
                        //System.out.println(calculadoraB.redondearBA(primerNumero));
                        //System.out.println("El redondeo de la aproximacion es de:  "+calculadoraB.redondear);
          
                     
                 //break;
                 
                //case 4:
                      
                      //System.out.println(calculadoraB.numeroAleatorioBA());
                      //System.out.println("El numero creado al azar fue:  "+calculadoraB.numeroAleatorio);
                     
                 //break;


    

