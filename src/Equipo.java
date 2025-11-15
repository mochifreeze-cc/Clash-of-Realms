public class Equipo {
    //atributos
    private String nombre;
    private Arraylist<Personaje> personajes;
    //metodos 
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.personajes = new arraylist<Personaje>();
    }

    public void agregarPersonaje(Personaje p) {
        personajes.add(p);
        // personajes.add(Guerrero);
        // personajes.add(Mago);
        // personajes.add(Mistico);
        // personajes.add(Guerrero2);
    }

    //getter
    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }
    
    public void atacarOtroEquipo(Equipo e) {
    // Lógica: cada personaje de este equipo ataca a personajes del otro equipo
    for (Personaje miPersonaje : this.personajes) {
        for (Personaje enemigo : e.getPersonajes()) {
            if (enemigo.estaVivo()) {
                miPersonaje.realizarAtaque(enemigo);
                break; // Ataca solo a uno
            }
        }
    }
}
    //boolean 
    public boolean estaDerrotado() {
        for (Personaje p : personajes) {
            if (p.estaVivo()) {
                return false;
            }
        }
        return true;
    }
    
}
