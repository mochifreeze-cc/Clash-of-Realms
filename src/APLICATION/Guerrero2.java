package APLICATION;

import ABSTRACT.Personaje;

public class Guerrero2 extends Personaje {
    public Guerrero2(String nombre, int vida, int ataque, int defensa) {
        super(nombre,vida,ataque,defensa);

    }
    @Override
    public void usarEstrategia() {
        this.ataque = this.ataque *2;
    }

}
