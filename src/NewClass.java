


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * determinar el mayor de 10 números digitados por el usuario
 * @author 202
 */
public class NewClass {
    public static void main(String args[])
    {
      Punto p1,p2,p3;
      p1 = new Punto(0,0);
      p2 = new Punto(2,2);
      p3 = new Punto(2,-2);
      Triangulo triangulo= new Triangulo(p1,p2,p3);
      
        System.out.println("Es un triangulo "+triangulo.tipoTriangulo());
        System.out.println(p1.distancia(p2));
        
    }        
}
