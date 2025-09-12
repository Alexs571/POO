package IntroduccionAPoo;

public class _2RegistroMascota {
    public static void main(String[] args) {

        Mascota perrito = new Mascota("Titan", "Perro", "Pitbull", 4);


        System.out.println(perrito.mostrarInfo());

        for(int i = 0; i < 5; i++){
            System.out.println("A pasado " + i + " Feliz cumpleaniossss!!!!!" + perrito.getNombre());
            perrito.cumplirAnios();
            System.out.println(perrito.mostrarInfo());
        }
    }
}




class Mascota{
   private String nombre;
   private String especie;
   private  String raza;
    int edad;

    public Mascota(String nombre, String especie, String raza, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    public void cumplirAnios(){
        this.edad  = this.edad + 1;
    }


    public String mostrarInfo() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                '}';
    }
}
