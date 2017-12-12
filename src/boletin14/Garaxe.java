
package boletin14;

import java.util.Scanner;

public class Garaxe {
private int nCoches;
private String matricula;
private double tiempo;
private double resultado;
private double cartosDevoltos;
private double cartosRecibidos;
Scanner sc=new Scanner(System.in);
public void mirarPlaza(){
    System.out.println("Dime el numero de coches que hay en el garaje");
    nCoches=sc.nextInt();
    if(nCoches<5){
            System.out.println("PLAZA DISPOÑIBLE");
            System.out.println("Introduce Matricula");
            matricula=sc.next();
            
}else{
    System.out.println("COMPLETO");
    }
}
public void calcularPrecio(){
    tiempo=System.currentTimeMillis();
    tiempo=tiempo*3600000;
   
    if(tiempo>3){ 
       double prem3=(tiempo-3)*0.20;
       double resultado=prem3+1.5;
    double cartosDevoltos=cartosRecibidos-resultado;
    }else{
       double resultado=1.5;
       double cartosDevoltos=cartosRecibidos-resultado;
    }
    System.out.println("Precio"+resultado);
    System.out.println("Cantidad de dinero introducido: ");
     cartosRecibidos=sc.nextDouble();
    
}
public void resultadoFinal(){
        System.out.println("FACTURA \n Matricula: "+matricula+"\n Tiempo: "+tiempo+"\n Precio: "+resultado+"€ \n Cartos Recibidos: "+cartosRecibidos+"\n Cartos Devoltos: "+cartosDevoltos+"\n Gracias por usar nuestro Parking" );
    }
}