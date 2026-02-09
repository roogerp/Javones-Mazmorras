/**
 * Clase que representa un objeto de equipamiento que puede usar un personaje.
 */
public class Equipamiento {
    private String nombre;
    private String tipo;

    /**
     * Constructor de Equipamiento
     * @param nombre Nombre del equipamiento
     * @param tipo Tipo de equipamiento (arma, armadura, poción, etc.)
     */
    public Equipamiento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * Devuelve el nombre del equipamiento
     * @return Nombre del equipamiento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el tipo del equipamiento
     * @return Tipo del equipamiento
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Representación en texto del equipamiento
     * @return String con la información del equipamiento
     */
    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}