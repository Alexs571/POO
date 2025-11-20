package uml;
public class FirmaDigital{
private String codigoHash;
private java.util.Date fecha;
private Usuario usuario;
public FirmaDigital(String codigoHash, java.util.Date fecha, Usuario usuario){
this.codigoHash=codigoHash;
this.fecha=fecha;
this.usuario=usuario;
}
public String getCodigoHash(){return codigoHash;}
public void setCodigoHash(String codigoHash){this.codigoHash=codigoHash;}
public java.util.Date getFecha(){return fecha;}
public void setFecha(java.util.Date fecha){this.fecha=fecha;}
public Usuario getUsuario(){return usuario;}
public void setUsuario(Usuario usuario){this.usuario=usuario;}
public String toString(){return "FirmaDigital{"+"codigoHash="+codigoHash+","+"fecha="+fecha+","+"usuario="+usuario+"}";}
}