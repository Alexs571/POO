package uml;
public class Render{
private String formato;
public Render(String formato){
this.formato=formato;
}
public String getFormato(){return formato;}
public void setFormato(String formato){this.formato=formato;}
public String toString(){return "Render{"+"formato="+formato+"}";}
}