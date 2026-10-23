
package parcial1122q2;


public class Guerreros extends Aventurero implements Entrenamiento{
    
    private int valorDeFuerza;

    public Guerreros(String codIdentificacion, String nombre, Rango rango,int valorDeFuerza) {
        super(codIdentificacion, nombre, rango);
        this.valorDeFuerza = valorDeFuerza;
        validarFuerza();
    }

    
    
    public void validarFuerza(){
        if(valorDeFuerza < 0){
            throw new IllegalArgumentException("El nivel de fuerza debe ser mayor a cero.");
        }
    }
    
    @Override
    public void realizarEntrenamiento(){
        System.out.println("Realizando entrenamiento");
    }
    
    @Override
    public int getPoderCombate(){
        return this.valorDeFuerza * 2;
    }
    
    @Override
    public void atacar(){
        System.out.println(this.getNombre() + "ataca con su espada!.");
    }
}
