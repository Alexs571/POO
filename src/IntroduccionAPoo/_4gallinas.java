package IntroduccionAPoo;

public class _4gallinas {

    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(1, 2, 10);
        Gallina gallina2 = new Gallina(2, 1, 5);

        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();

        gallina2.envejecer();
        gallina2.ponerHuevo();

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}

class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " | Edad: " + edad + " | Huevos puestos: " + huevosPuestos);
    }
}
