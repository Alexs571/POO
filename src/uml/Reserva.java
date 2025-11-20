package uml;
public class Reserva{
private java.util.Date fecha;
private String hora;
private Cliente cliente;
private Mesa mesa;
public Reserva(java.util.Date fecha, String hora, Cliente cliente, Mesa mesa){
this.fecha=fecha;
this.hora=hora;
this.cliente=cliente;
this.mesa=mesa;
}
public java.util.Date getFecha(){return fecha;}
public void setFecha(java.util.Date fecha){this.fecha=fecha;}
public String getHora(){return hora;}
public void setHora(String hora){this.hora=hora;}
public Cliente getCliente(){return cliente;}
public void setCliente(Cliente cliente){this.cliente=cliente;}
public Mesa getMesa(){return mesa;}
public void setMesa(Mesa mesa){this.mesa=mesa;}
public String toString(){return "Reserva{"+"fecha="+fecha+","+"hora="+hora+","+"cliente="+cliente+","+"mesa="+mesa+"}";}
}