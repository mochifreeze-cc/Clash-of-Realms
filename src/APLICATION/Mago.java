package APLICATION;

import ABSTRACT.Personaje;

import java.util.ArrayList;

public class Mago extends Personaje {
    private Equipo miEquipo;

    public Mago(String nombre, int vida, int ataque, int defensa) {
        super(nombre,vida,ataque,defensa);

    }

    public void setEquipo(Equipo equipo) {
        this.miEquipo = equipo;
    }

    @Override
    public void usarEstrategia(){
        this.ataque = this.ataque + 2;
        // Curar a un aliado aleatorio
        if (miEquipo != null) {
            ArrayList<Personaje> personajesVivos = miEquipo.getPersonajes();

            if (!personajesVivos.isEmpty()) {
                // Seleccionar personaje aleatorio con Math.random()
                int indiceAleatorio = (int) (Math.random() * personajesVivos.size());
                Personaje personajeSeleccionado = personajesVivos.get(indiceAleatorio);

                // Calcular 25% de la vida del mago
                int curacion = (int) (this.vida * 0.25);

                // Curar al personaje seleccionado
                personajeSeleccionado.curar(curacion);
            }
        }
    }
}

