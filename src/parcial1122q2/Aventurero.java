
package parcial1122q2;

import java.util.Objects;


public abstract class Aventurero{
    
    private String codIdentificacion;
    private String nombre;
    private Rango rango;

    
    /**
     * cree el constructor con los atributos declarados.
     * @param codIdentificacion de tipo string.
     * @param nombre de tipo string.
     * @param rango de tipo Rango.
     */
    public Aventurero(String codIdentificacion, String nombre, Rango rango) {
        this.codIdentificacion = codIdentificacion;
        this.nombre = nombre;
        this.rango = rango;
    }

    
    /**
     * cree los getters para que desde el main.
     * @return 
     */
    public String getCodIdentificacion() {
        return codIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Rango getRango() {
        return rango;
    }
    
    
    /**
     * cree el metodo validarnull para q no sea nulo.
     * que codIdentificacion y nombre no esten en blanco.
     * en caso que se cumpla con la condicion le lanzo una exception.
     */
    public void validarNull(){
        if(codIdentificacion.isBlank() || nombre.isBlank()){
            throw new IllegalArgumentException("El codigo y el nombre no pueden ser nulos ni estar en blanco.");
        }
    }


    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aventurero other = (Aventurero) obj;
        if (!Objects.equals(this.codIdentificacion, other.codIdentificacion)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return this.rango == other.rango;
    }
    
    public abstract void atacar();
    
    public abstract int getPoderCombate();
    
    
}
