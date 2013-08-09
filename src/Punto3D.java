/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 202
 */
public class Punto3D extends Punto{
   double z;
    public Punto3D(double x, double y,double z) {
        super(x, y);
        this.z = z;
    }
   @Override
    double distancia(Punto p)
    {
        return 0;
    }
    
}
