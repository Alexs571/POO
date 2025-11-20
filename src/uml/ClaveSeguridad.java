package uml;
public class ClaveSeguridad{
private String codigo;
private java.util.Date ultimaModificacion;
public ClaveSeguridad(String codigo, java.util.Date ultimaModificacion){
this.codigo=codigo;
this.ultimaModificacion=ultimaModificacion;
}
public String getCodigo(){return codigo;}
public void setCodigo(String codigo){this.codigo=codigo;}
public java.util.Date getUltimaModificacion(){return ultimaModificacion;}
public void setUltimaModificacion(java.util.Date ultimaModificacion){this.ultimaModificacion=ultimaModificacion;}
public String toString(){return "ClaveSeguridad{"+"codigo="+codigo+","+"ultimaModificacion="+ultimaModificacion+"}";}
}