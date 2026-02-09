/**
 * Clase principal que demuestra el funcionamiento del sistema de personajes
 * del juego Javones y Mazmorras.
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("  BIENVENIDO A JAVONES Y MAZMORRAS");
        

        // Crear personajes
        Mago mago = new Mago("Gandalf", 10, 80, 100);
        Guerrero guerrero = new Guerrero("Aragorn", 12, 150);
        Ladron ladron = new Ladron("Bilbo", 8, 90);

        // Crear equipamiento
        Equipamiento espadaLarga = new Equipamiento("Espada Larga", "Arma");
        Equipamiento varaMagica = new Equipamiento("Vara de Poder", "Arma");
        Equipamiento armaduraPlacas = new Equipamiento("Armadura de Placas", "Armadura");
        Equipamiento dagaEnvenenada = new Equipamiento("Daga Envenenada", "Arma");
        Equipamiento pocionCuracion = new Equipamiento("Poción de Curación Mayor", "Poción");

        System.out.println(">>> CREACIÓN DE PERSONAJES <<<\n");
        
        // Mostrar información inicial
        mago.mostrarInfo();
        System.out.println();
        guerrero.mostrarInfo();
        System.out.println();
        ladron.mostrarInfo();
        System.out.println();

        System.out.println("\n>>> EQUIPAMIENTO DE PERSONAJES <<<\n");
        
        // Equipar personajes
        guerrero.agregarEquipamiento(espadaLarga);
        guerrero.agregarEquipamiento(armaduraPlacas);
        mago.agregarEquipamiento(varaMagica);
        mago.agregarEquipamiento(pocionCuracion);
        ladron.agregarEquipamiento(dagaEnvenenada);

        // Mostrar inventarios
        System.out.println("\nInventario de " + guerrero.getNombre() + ":");
        guerrero.getInventario().mostrarInventario();

        System.out.println("Inventario de " + mago.getNombre() + ":");
        mago.getInventario().mostrarInventario();

        System.out.println("Inventario de " + ladron.getNombre() + ":");
        ladron.getInventario().mostrarInventario();

        System.out.println("\n>>> EXPLORANDO LA MAZMORRA <<<\n");

        // El guerrero protege al mago
        guerrero.proteger(mago);
        System.out.println();

        // Combate
        System.out.println("--- Encuentro con enemigos ---\n");
        
        // El mago lanza hechizos
        mago.lanzarHechizo(30);
        mago.lanzarHechizo(40);
        mago.lanzarHechizo(50); // No debería tener suficiente maná
        System.out.println();

        // Recargar maná
        mago.recargarMana(25);
        mago.lanzarHechizo(20);
        System.out.println();

        // El ladrón se hace invisible y roba
        ladron.hacerseInvisible();
        ladron.robar();
        System.out.println();

        ladron.hacerseInvisible(); // Se hace visible
        ladron.robar();
        System.out.println();

        // Recibir daño
        System.out.println("--- Los personajes reciben daño ---\n");
        
        mago.bajarVida(30); // Daño reducido porque está protegido
        System.out.println();
        
        guerrero.bajarVida(40);
        System.out.println();
        
        ladron.bajarVida(25);
        System.out.println();

        // Curación
        System.out.println("--- Momento de curación ---\n");
        mago.curar(20);
        guerrero.curar(15);
        System.out.println();

        // El guerrero deja de proteger al mago y protege al ladrón
        guerrero.dejarDeProteger();
        guerrero.proteger(ladron);
        System.out.println();

        // Más daño para demostrar la protección
        System.out.println("--- Segundo encuentro ---\n");
        ladron.bajarVida(40); // Ahora está protegido
        mago.bajarVida(40); // Ya no está protegido
        System.out.println();

        // Estado final de los personajes
        System.out.println("\n>>> ESTADO FINAL DE LOS PERSONAJES <<<\n");
        mago.mostrarInfo();
        System.out.println();
        guerrero.mostrarInfo();
        System.out.println();
        ladron.mostrarInfo();

        
        System.out.println("     FIN DE LA AVENTURA");
        
    }
}


