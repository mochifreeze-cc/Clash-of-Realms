package APLICATION;

import ABSTRACT.Personaje;

public class Main {
    public static void main(String[] args) {

        // Crear equipos y personajes de ejemplo
        Equipo equipo1 = new Equipo("Equipo Rojo");
        equipo1.agregarPersonaje(new Guerrero("Guerrero Rojo", 100, 20, 10));
        equipo1.agregarPersonaje(new Guerrero2("Guerrero Rojo 2", 100, 25, 15));
        equipo1.agregarPersonaje(new Mago("Mago Rojo", 80, 25, 5));
        equipo1.agregarPersonaje(new Mistico("Mistico Rojo", 95, 30, 15));

        Equipo equipo2 = new Equipo("Equipo Azul");
        equipo2.agregarPersonaje(new Guerrero("Guerrero Azul", 90, 18, 12));
        equipo2.agregarPersonaje(new Guerrero2("Guerrero Azul 2", 95, 20, 14));
        equipo2.agregarPersonaje(new Mago("Mago Azul", 70, 30, 3));
        equipo2.agregarPersonaje(new Mistico("Mistico Azul", 80, 35, 20));

        int ronda = 1;

        // ======= SIMULACIÓN DE COMBATE =======
        while (ronda <= 15) {
            System.out.println("\n===== RONDA " + ronda + " =====");

            // Equipo 1 ataca
            System.out.println("\nEl Equipo atacante " + equipo1.getNombre());
            equipo1.atacarOtroEquipo(equipo2);

            if (equipo2.estaDerrotado()) {
                System.out.println("¡" + equipo1.getNombre() + " gana el combate!");
                return;
            }

            // Equipo 2 ataca
            System.out.println("\nEl Equipo atacante " + equipo2.getNombre());
            equipo2.atacarOtroEquipo(equipo1);

            if (equipo1.estaDerrotado()) {
                System.out.println("¡" + equipo2.getNombre() + " gana el combate!");
                return;
            }

            ronda++;
        }

        // ======= SI LLEGAMOS AQUI → SE ACABARON LAS 15 RONDAS =======
        System.out.println("\n===== FIN DE LAS 15 RONDAS =====");

        int vidaEquipo1 = sumarVida(equipo1);
        int vidaEquipo2 = sumarVida(equipo2);

        System.out.println("\nVida total del " + equipo1.getNombre() + ": " + vidaEquipo1);
        System.out.println("Vida total del " + equipo2.getNombre() + ": " + vidaEquipo2);

        if (vidaEquipo1 > vidaEquipo2) {
            System.out.println("\n¡" + equipo1.getNombre() + " gana por mayor vida!");
        } else if (vidaEquipo2 > vidaEquipo1) {
            System.out.println("\n¡" + equipo2.getNombre() + " gana por mayor vida!");
        } else {
            System.out.println("\n¡EMPATE! Ambos equipos tienen la misma vida total.");
        }
    }

    // ======= FUNCIÓN PARA SUMAR VIDA =======
    public static int sumarVida(Equipo equipo) {
        int total = 0;
        for (Personaje p : equipo.getPersonajes()) {
            if (p.estaVivo()) {
                total += p.getVida();
            }
        }
        return total;
    }
}