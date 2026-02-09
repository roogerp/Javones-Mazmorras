/**
 * Clase base que representa a cualquier personaje del juego.
 * Contiene atributos y métodos comunes a todos los tipos de personajes.
 */
public class Personaje {
    // Atributos protegidos para permitir acceso desde clases hijas
    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected boolean protegido;
    protected Inventario inventario;

    /**
     * Constructor de Personaje
     * @param nombre Nombre del personaje
     * @param nivel Nivel inicial del personaje
     * @param puntosVida Puntos de vida iniciales
     */
    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.protegido = false;
        this.inventario = new Inventario();
    }

    /**
     * Muestra por consola la información básica del personaje
     */
    public void mostrarInfo() {
        System.out.println(" Información del Personaje ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de Vida: " + puntosVida);
        System.out.println("Protegido: " + (protegido ? "Sí" : "No"));
        
    }

    /**
     * Reduce los puntos de vida del personaje
     * Si está protegido, el daño se reduce a la mitad
     * @param cantidad Cantidad de daño a recibir
     */
    public void bajarVida(int cantidad) {
        int danoReal = cantidad;
        
        if (protegido) {
            danoReal = cantidad / 2;
            System.out.println(nombre + " está protegido. Daño reducido de " + cantidad + " a " + danoReal);
        }
        
        puntosVida -= danoReal;
        
        if (puntosVida < 0) {
            puntosVida = 0;
        }
        
        System.out.println(nombre + " recibe " + danoReal + " de daño. Vida restante: " + puntosVida);
        
        if (puntosVida == 0) {
            System.out.println("¡" + nombre + " ha caído en combate!");
        }
    }

    /**
     * Aumenta los puntos de vida del personaje
     * @param cantidad Cantidad de vida a recuperar
     */
    public void curar(int cantidad) {
        puntosVida += cantidad;
        System.out.println(nombre + " se cura " + cantidad + " puntos de vida. Vida actual: " + puntosVida);
    }

    /**
     * Devuelve el inventario del personaje
     * @return Inventario del personaje
     */
    public Inventario getInventario() {
        return inventario;
    }

    /**
     * Añade un equipamiento al inventario del personaje
     * @param equipamiento Equipamiento a añadir
     */
    public void agregarEquipamiento(Equipamiento equipamiento) {
        inventario.agregarEquipamiento(equipamiento);
        System.out.println(nombre + " ha obtenido: " + equipamiento.getNombre());
    }

    /**
     * Cambia el estado de protección del personaje
     * @param protegido true si está protegido, false en caso contrario
     */
    public void setProtegido(boolean protegido) {
        this.protegido = protegido;
    }

    /**
     * Verifica si el personaje está protegido
     * @return true si está protegido, false en caso contrario
     */
    public boolean estaProtegido() {
        return protegido;
    }

    // Getters adicionales
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }
}