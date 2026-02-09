/**
 * Clase que representa a un guerrero, capaz de proteger a otros personajes.
 * Hereda de Personaje y añade funcionalidad de protección.
 */
public class Guerrero extends Personaje {
    private Personaje companeroProtegido;

    /**
     * Constructor de Guerrero
     * @param nombre Nombre del guerrero
     * @param nivel Nivel inicial
     * @param puntosVida Puntos de vida iniciales
     */
    public Guerrero(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.companeroProtegido = null;
    }

    /**
     * Protege a un compañero de equipo
     * Un guerrero solo puede proteger a un personaje a la vez
     * @param companero Personaje a proteger
     */
    public void proteger(Personaje companero) {
        // Si ya está protegiendo a alguien, deja de protegerlo primero
        if (companeroProtegido != null) {
            dejarDeProteger();
        }
        
        // Protege al nuevo compañero
        this.companeroProtegido = companero;
        companero.setProtegido(true);
        System.out.println(nombre + " ahora protege a " + companero.getNombre());
    }

    /**
     * Deja de proteger al compañero actual
     */
    public void dejarDeProteger() {
        if (companeroProtegido != null) {
            System.out.println(nombre + " deja de proteger a " + companeroProtegido.getNombre());
            companeroProtegido.setProtegido(false);
            companeroProtegido = null;
        } else {
            System.out.println(nombre + " no está protegiendo a nadie.");
        }
    }

    /**
     * Devuelve el personaje que está siendo protegido
     * @return Personaje protegido o null si no hay ninguno
     */
    public Personaje estaProtegiendo() {
        return companeroProtegido;
    }

    /**
     * Sobrescribe el método mostrarInfo para incluir información de protección
     */
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Clase: Guerrero");
        if (companeroProtegido != null) {
            System.out.println("Protegiendo a: " + companeroProtegido.getNombre());
        } else {
            System.out.println("No está protegiendo a nadie");
        }
    }
}