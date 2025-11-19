//import ABSTRACT.Personaje;
//import java.util.ArrayList;
//
//public class Equipo {
//    //atributos
//    private String nombre;
//    private ArrayList<Personaje> personajes;
//    //metodos
//    public Equipo(String nombre) {
//        this.nombre = nombre;
//        this.personajes = new ArrayList<>();
//    }
//
//    public void setPersonajes(ArrayList<Personaje> personajes) {
//        this.personajes = personajes;
//    }
//
//    public void agregarPersonaje(Personaje p) {
//        personajes.add(p);
//    }
//
//    //getter
//
//    public String getNombre(){
//        return nombre;
//    }
//
//    public ArrayList<Personaje> getPersonajes() {
//        return personajes;
//    }
//
//    public void atacarOtroEquipo(Equipo e) {
//    // Lógica: cada personaje de este equipo ataca a personajes del otro equipo
//        System.out.println("El equipo atacante " + this.nombre + " va a empezar el ataque");
//        int i = 0;
//        for (Personaje personaje: personajes){
//            if (personaje.estaVivo()){
//                System.out.println(personaje.getNombre() + " ataca a " + e.personajes.get(i).getNombre());
//                personaje.realizarAtaque(e.personajes.get(i));
//            }
//            i++;
//        }
//    }
//
//    //boolean
//    public boolean estaDerrotado() {
//        int muertos = 0;
//
//        for (Personaje personaje:personajes){
//            if (personaje.estaVivo()){
//            }
//            else{
//                muertos++;
//            }
//        }
//        if (muertos == personajes.size()){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//}
