
package parcial1122q2;

import java.util.List;
import java.util.ArrayList;

public class GremioAventureros {
    
    private String nombreDeGremio;
    private final List<Aventurero> aventureros ;

    public GremioAventureros(String nombreDeGremio) {
        this.nombreDeGremio = nombreDeGremio;
        this.aventureros =  new ArrayList<>();
    }

    
    /**
     * Agrega un aventurero al gremio de aventureros.
     * @param aventurero se agrega ak aventurero.
     * @throws AventureroDuplicadoException si ya existe un aventurero con el mismo cod y nombre.
     */
    public void agregarAventurero(Aventurero aventurero) throws AventureroDuplicadoException{
        if(this.aventureros.contains(aventurero)){
            throw new AventureroDuplicadoException("El aventurero con codigo "
            + aventurero.getCodIdentificacion() + " y nombre " + aventurero.getNombre() + " ya existe en el gremio.");
        }
        this.aventureros.add(aventurero);
    }
    
     
    /**
     * 
     * @return la lista completa de aventureros registrados.
     */
    public List<Aventurero> obtenerAventureros(){
        return this.aventureros;
    }
    
    
    /**
     * Filtra y devuelve a los aventureros que pertenecen a un rango.
     * @param rango (BRONCE,PLATA,ORO).
     * @return la lista de aventureros que coincidan con el mismo rango.
     */
    public List<Aventurero> filtrarPorRango(Rango rango){
        List<Aventurero> filtrados = new ArrayList<>();
        for(Aventurero a : this.aventureros){
            if(a.getRango() == rango){
                filtrados.add(a);
            }
        }
        return filtrados;
    }
    
    
}
