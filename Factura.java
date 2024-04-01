import java.util.Scanner;
public  class Factura{
    public  static void main(String[] args){
    // Variables
        double valorCompra = 0;
        double des1 = 0;
        double des2 = 0;
        double des3 = 0;
    // Variable para lectura  de datos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese valor compra ");
        valorCompra = entrada.nextInt();

        

        if (valorCompra >= 200000){
        des2  = (valorCompra*0.15);
        valorCompra = valorCompra-des2;
        System.out.println("El valor de la compra es mayor a 200000");
        System.out.println("Recibe un descuento del 15% y fue por: "+des2);
        System.out.println("El valor a pagar es: "+valorCompra);
        System.out.println("Muchas gracias "+nombre+"por tu compra");
          }else if (valorCompra >= 50000){
        des1  = (valorCompra*0.02);
        valorCompra = valorCompra-des1;
        System.out.println("El valor de la compra es mayor a 50000");
        System.out.println("Recibe un descuento del 2% y fue por: "+des1);
        System.out.println("El valor a pagar es: "+valorCompra);
        System.out.println("Muchas gracias "+nombre+"por tu compra");
     }else if (valorCompra >= 20000){
        des3  = (valorCompra*0.015);
        valorCompra = valorCompra-des3;
        System.out.println("El valor de la compra es mayor a 20000");
        System.out.println("Recibe un descuento del 1.5% y fue por: "+des3);
        System.out.println("El valor a pagar es: "+valorCompra);
        System.out.println("Muchas gracias "+nombre+" por tu compra");
   }
  }
}
     
  
