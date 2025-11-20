package uml;
public class Titular{
private String nombre;
private String dni;
public Titular(String nombre, String dni){
this.nombre=nombre;
this.dni=dni;
}
public String getNombre(){return nombre;}
public void setNombre(String nombre){this.nombre=nombre;}
public String getDni(){return dni;}
public void setDni(String dni){this.dni=dni;}
public String toString(){return "Titular{"+"nombre="+nombre+","+"dni="+dni+"}";}
}