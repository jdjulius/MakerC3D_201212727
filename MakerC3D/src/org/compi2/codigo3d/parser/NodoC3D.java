package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {

    
    private String cad;
    private String etiqueta_v;
    private String etiqueta_f;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public String getCad(){
        return cad;
    }
    /**
     * @return the etiqueta_v
     */
    public String getEtiqueta_v() {
        return etiqueta_v;
    }

    /**
     * @param etiqueta_v the etiqueta_v to set
     */
    public void setEtiqueta_v(String etiqueta_v) {
        this.etiqueta_v = etiqueta_v;
    }

    /**
     * @return the etiqueta_f
     */
    public String getEtiqueta_f() {
        return etiqueta_f;
    }

    /**
     * @param etiqueta_f the etiqueta_f to set
     */
    public void setEtiqueta_f(String etiqueta_f) {
        this.etiqueta_f = etiqueta_f;
    }
        
  
    public NodoC3D(String lv,String lf) {
        this.etiqueta_v = lv;
        this.etiqueta_f = lf;
    }
    
}
