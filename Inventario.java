import java.util.ArrayList;

/**
 * Clase que gestiona el equipamiento de un personaje.
 * Utiliza composición para almacenar objetos de tipo Equipamiento.
 */
public class Inventario {
    private ArrayList<Equipamiento> equipamiento;

    /**
     * Constructor de Inventario
     * Inicializa la lista de equipamiento vacía
     */
    public Inventario() {
        this.equipamiento = new ArrayList<>();
    }

    /**
     * Añade un objeto de equipamiento al inventario
     * @param equipamiento Equipamiento a añadir
     */
    public void agregarEquipamiento(Equipamiento equipamiento) {
        this.equipamiento.add(equipamiento);
    }

    /**
     * Muestra por consola todos los objetos del inventario
     */
    public void mostrarInventario() {
        System.out.println("\n--- INVENTARIO ---");
       
        if (equipamiento.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (int i = 0; i < equipamiento.size(); i++) {
                System.out.println((i + 1) + ". " + equipamiento.get(i));
            }
        }
       
        System.out.println("------------------\n");
    }

    /**
     * Devuelve la lista de equipamiento
     * @return ArrayList con el equipamiento
     */
    public ArrayList<Equipamiento> getEquipamiento() {
        return equipamiento;
    }

    /**
     * Devuelve el número de objetos en el inventario
     * @return Cantidad de objetos
     */
    public int getCantidadObjetos() {
        return equipamiento.size();
    }
}