/**
 * Clase que representa a un ladrón, capaz de volverse invisible.
 * Hereda de Personaje y añade funcionalidad de sigilo.
 */
public class Ladron extends Personaje {
    private boolean invisible;

    /**
     * Constructor de Ladron
     * @param nombre Nombre del ladrón
     * @param nivel Nivel inicial
     * @param puntosVida Puntos de vida iniciales
     */
    public Ladron(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.invisible = false;
    }

    /**
     * Realiza un robo
     * El mensaje mostrado depende de si el ladrón está invisible o no
     */
    public void robar() {
        if (invisible) {
            System.out.println(nombre + " roba sigilosamente sin ser detectado. ¡Nadie se ha dado cuenta!");
        } else {
            System.out.println(nombre + " intenta robar a plena vista. ¡Han descubierto el robo!");
        }
    }

    /**
     * Alterna el estado de invisibilidad del ladrón
     */
    public void hacerseInvisible() {
        invisible = !invisible;
        if (invisible) {
            System.out.println(nombre + " se vuelve invisible y desaparece entre las sombras.");
        } else {
            System.out.println(nombre + " vuelve a ser visible.");
        }
    }

    /**
     * Verifica si el ladrón está invisible
     * @return true si está invisible, false en caso contrario
     */
    public boolean estaInvisible() {
        return invisible;
    }

    /**
     * Sobrescribe el método mostrarInfo para incluir información de invisibilidad
     */
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Clase: Ladrón");
        System.out.println("Invisible: " + (invisible ? "Sí" : "No"));
    }
}