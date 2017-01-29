package co.com.sergio;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 * @author juan
 */
@ViewScoped
@Named("visitaHumedalControlador")
public class VisitaHumedalControlador implements Serializable{
    
    private String claveMapa;
    
    @PostConstruct
    public void postConstruct() {
        claveMapa = Utilidades.getPropiedad("clave.mapa");
    }

    public String getClaveMapa() {
        return claveMapa;
    }

    public void setClaveMapa(String claveMapa) {
        this.claveMapa = claveMapa;
    }
}
