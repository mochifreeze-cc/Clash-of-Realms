public class Main {
    public static void main(String[] args) {
        // Crear equipos y personajes de ejemplo
        Equipo equipo1 = new Equipo("Equipo Rojo");
        equipo1.agregarPersonaje(new Guerrero("Guerrero Rojo", 100, 20, 10));
        equipo1.agregarPersonaje(new Mago("Mago Rojo", 80, 25, 5));

        Equipo equipo2 = new Equipo("Equipo Azul");
        equipo2.agregarPersonaje(new Guerrero("Guerrero Azul", 90, 18, 12));
        equipo2.agregarPersonaje(new Mago("Mago Azul", 70, 30, 3));

        //COMPLETAR : Escribir código para simular las rondas
        int turno = 1;

        boolean terminar = false;
        do{
            System.out.println("==Ronda " + turno + "==");
            System.out.println("El Equipo atacante " + equipo1.getNombre());
            equipo1.atacarOtroEquipo(equipo2);

            if (equipo2.estaDerrotado()){
                System.out.println("¡" + equipo1.getNombre() + " gana!")
                terminar = true;
            }
            else{
                System.out.println("El Equipo atacante " + equipo2.getNombre());
                equipo2.atacarOtroEquipo(equipo1);

                if (equipo1.estaDerrotado()){
                    System.out.println("¡" + equipo2.getNombre() + " gana!");
                    terminar = true;
                }
            }
            turno++;

        }
        while(terminar != true);
    }
}
