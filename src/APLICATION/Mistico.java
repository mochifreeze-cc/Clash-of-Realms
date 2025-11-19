package APLICATION;

import ABSTRACT.Personaje;

public class Mistico extends Personaje {
    public Mistico(String nombre, int vida, int ataque, int defensa) {
        super(nombre,vida,ataque,defensa);
    }

    @Override
    public void usarEstrategia() {
        System.out.println("El místico usa una estrategia de magia ancestral.");
    }
}
