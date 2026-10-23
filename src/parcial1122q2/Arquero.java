
package parcial1122q2;


public class Arquero extends Aventurero implements Entrenamiento{
    
    private int valorPrecision;

    public Arquero(String codIdentificacion, String nombre, Rango rango,int valorPrecision) {
        super(codIdentificacion, nombre, rango);
        this.valorPrecision = valorPrecision;
    }

    
    
     public void validarPrecision(){
        if(valorPrecision < 0){
            throw new IllegalArgumentException("El nivel de precision debe ser mayor a cero.");
        }
    }
     
     @Override
     public void realizarEntrenamiento(){
         System.out.println("Realizando entrenamiento");
     }
     
     @Override
     public void atacar(){
         System.out.println(this.getNombre() + "dispara una flecha");
     }
     
     @Override
     public int getPoderCombate(){
         return this.valorPrecision * 3;
     }
}
