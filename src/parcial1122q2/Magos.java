
package parcial1122q2;


public class Magos extends Aventurero{
    
    private int puntosMana;

    public Magos(String codIdentificacion, String nombre, Rango rango,int puntosMana) {
        super(codIdentificacion, nombre, rango);
        this.puntosMana = puntosMana;
    }

    
    
     public void validarMana(){
        if(puntosMana < 0){
            throw new IllegalArgumentException("El nivel de mana debe ser mayor a cero.");
        }
    }
     
     @Override
     public void atacar(){
         System.out.println(this.getNombre() + "mago lanza un ataque magico.");
     }
     
     @Override
     public int getPoderCombate(){
         return this.puntosMana + 10;
     }
}
