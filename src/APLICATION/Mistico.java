package APLICATION;

import ABSTRACT.Personaje;

import java.util.Scanner;

public class Mistico extends Personaje {
    private Equipo equipo;


    public Mistico(String nombre, int vida, int ataque, int defensa) {
        super(nombre,vida,ataque,defensa);
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }


    @Override
    public void usarEstrategia() {
        Scanner entrada = new Scanner(System.in);
        int dado = (int)(Math.random() * 6) + 1;

        System.out.println("El místico lanza un dado...");
        System.out.println("Ingresa un número entre 1 y 6: ");

        int numero = entrada.nextInt();

        if (numero == dado) {
            System.out.println("Adivinaste! (" + numero + " == " + dado + ")");
            System.out.println("El místico activa una poderosa estrategia.");
            // Aquí pones el efecto especial
        } else {
            System.out.println("Fallaste. (" + numero + " != " + dado + ")");
            System.out.println("El místico solo usa una estrategia básica.");
        }


        if (equipo == null) {
            System.out.println("El místico no tiene equipo asignado.");
            return;
        }

        // 🔥 sumar el daño real causado por los otros aliados
        int bono = 0;
        for (Personaje p : equipo.getPersonajes()) {
            if (p != this) {
                bono += p.getDanoRealUltimoAtaque();
            }
        }

        // Guardar el ataque original
        int ataqueOriginal = this.ataque;

        // Aplicar aumento
        this.ataque += bono;

        System.out.println(this.getNombre() +
                " usa magia ancestral. Su ataque sube temporalmente de "
                + ataqueOriginal + " a " + this.ataque);

        // El bono se usa SOLO durante este ataque (realizarAtaque lo aplica)

        // Después del ataque, se restablecerá en realizarAtaque()
    }

}