package uml;
public class Celular{
private int imei;
private String marca;
private String modelo;
private Bateria bateria;
private Usuario usuario;
public Celular(int imei, String marca, String modelo, Bateria bateria, Usuario usuario){
this.imei=imei;
this.marca=marca;
this.modelo=modelo;
this.bateria=bateria;
this.usuario=usuario;
}
public int getImei(){return imei;}
public void setImei(int imei){this.imei=imei;}
public String getMarca(){return marca;}
public void setMarca(String marca){this.marca=marca;}
public String getModelo(){return modelo;}
public void setModelo(String modelo){this.modelo=modelo;}
public Bateria getBateria(){return bateria;}
public void setBateria(Bateria bateria){this.bateria=bateria;}
public Usuario getUsuario(){return usuario;}
public void setUsuario(Usuario usuario){this.usuario=usuario;}
public String toString(){return "Celular{"+"imei="+imei+","+"marca="+marca+","+"modelo="+modelo+","+"bateria="+bateria+","+"usuario="+usuario+"}";}
}