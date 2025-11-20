package uml;
public class Pasaporte{
private String numero;
private java.util.Date fechaEmision;
private Foto foto;
private Titular titular;
public Pasaporte(String numero, java.util.Date fechaEmision, Foto foto, Titular titular){
this.numero=numero;
this.fechaEmision=fechaEmision;
this.foto=foto;
this.titular=titular;
}
public String getNumero(){return numero;}
public void setNumero(String numero){this.numero=numero;}
public java.util.Date getFechaEmision(){return fechaEmision;}
public void setFechaEmision(java.util.Date fechaEmision){this.fechaEmision=fechaEmision;}
public Foto getFoto(){return foto;}
public void setFoto(Foto foto){this.foto=foto;}
public Titular getTitular(){return titular;}
public void setTitular(Titular titular){this.titular=titular;}
public String toString(){return "Pasaporte{"+"numero="+numero+","+"fechaEmision="+fechaEmision+","+"foto="+foto+","+"titular="+titular+"}";}
}