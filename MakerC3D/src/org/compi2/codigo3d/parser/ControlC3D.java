package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {

    
    
    private static int temp = 0;
    private static String c3d = "";
    
    private static int etiqueta = 0;
    private static String etiqueva_v = "";
    private static String etiqueta_f = "";
    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        c3d = "";
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
     public static String generaEtq(){
        return "L"+etiqueta++;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }
    
    /**
     * @return the etiqueta
     */
    public static int getEtiqueta() {
        return etiqueta;
    }

    /**
     * @param aEtiqueta the etiqueta to set
     */
    public static void setEtiqueta(int aEtiqueta) {
        etiqueta = aEtiqueta;
    }

    /**
     * @return the etiqueva_v
     */
    public static String getEtiqueva_v() {
        return etiqueva_v;
    }

    /**
     * @param aEtiqueva_v the etiqueva_v to set
     */
    public static void setEtiqueva_v(String aEtiqueva_v) {
        etiqueva_v = aEtiqueva_v;
    }

    /**
     * @return the etiqueta_f
     */
    public static String getEtiqueta_f() {
        return etiqueta_f;
    }

    /**
     * @param aEtiqueta_f the etiqueta_f to set
     */
    public static void setEtiqueta_f(String aEtiqueta_f) {
        etiqueta_f = aEtiqueta_f;
    }
}
