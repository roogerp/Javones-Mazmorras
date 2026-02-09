/**
 * Clase que representa a un mago, capaz de lanzar hechizos usando maná.
 * Hereda de Personaje y añade funcionalidad relacionada con la magia.
 */
public class Mago extends Personaje {
    private int mana;

    /**
     * Constructor de Mago
     * @param nombre Nombre del mago
     * @param nivel Nivel inicial
     * @param puntosVida Puntos de vida iniciales
     * @param mana Cantidad inicial de maná
     */
    public Mago(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    /**
     * Lanza un hechizo consumiendo maná
     * Si no hay suficiente maná, el hechizo no se lanza
     * @param costeMana Coste de maná del hechizo
     */
    public void lanzarHechizo(int costeMana) {
        if (mana >= costeMana) {
            mana -= costeMana;
            System.out.println(nombre + " lanza un hechizo poderoso. Maná restante: " + mana);
        } else {
            System.out.println(nombre + " no tiene suficiente maná para lanzar el hechizo. Maná actual: " + mana + ", necesario: " + costeMana);
        }
    }

    /**
     * Aumenta el maná del mago
     * @param cantidad Cantidad de maná a recuperar
     */
    public void recargarMana(int cantidad) {
        mana += cantidad;
        System.out.println(nombre + " recarga " + cantidad + " puntos de maná. Maná actual: " + mana);
    }

    /**
     * Devuelve la cantidad actual de maná
     * @return Maná actual del mago
     */
    public int getMana() {
        return mana;
    }

    /**
     * Sobrescribe el método mostrarInfo para incluir información de maná
     */
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Maná: " + mana);
        System.out.println("Clase: Mago");
    }
}