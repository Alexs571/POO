package uml;
public class TarjetaDeCredito{
private String numero;
private java.util.Date fechaVencimiento;
private Cliente cliente;
private Banco banco;
public TarjetaDeCredito(String numero, java.util.Date fechaVencimiento, Cliente cliente, Banco banco){
this.numero=numero;
this.fechaVencimiento=fechaVencimiento;
this.cliente=cliente;
this.banco=banco;
}
public String getNumero(){return numero;}
public void setNumero(String numero){this.numero=numero;}
public java.util.Date getFechaVencimiento(){return fechaVencimiento;}
public void setFechaVencimiento(java.util.Date fechaVencimiento){this.fechaVencimiento=fechaVencimiento;}
public Cliente getCliente(){return cliente;}
public void setCliente(Cliente cliente){this.cliente=cliente;}
public Banco getBanco(){return banco;}
public void setBanco(Banco banco){this.banco=banco;}
public String toString(){return "TarjetaDeCredito{"+"numero="+numero+","+"fechaVencimiento="+fechaVencimiento+","+"cliente="+cliente+","+"banco="+banco+"}";}
}