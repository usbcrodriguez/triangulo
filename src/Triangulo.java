/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 202
 */
public class Triangulo {
    Punto vertice1;
    Punto vertice2;
    Punto vertice3;

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "vertice1=" + vertice1 + ", vertice2=" + vertice2 + ", vertice3=" + vertice3 + '}';
    }
    
    public double hallarPerimetro()
    {
       // double perimetro = vertice1.distancia(vertice2)+...
        return 0;
    }
    public String tipoTriangulo()
    {
        return "";
    }        
            
    
}
