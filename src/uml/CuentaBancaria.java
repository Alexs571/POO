package uml;
public class CuentaBancaria{
private String cbu;
private double saldo;
private ClaveSeguridad claveSeguridad;
private Titular titular;
public CuentaBancaria(String cbu, double saldo, ClaveSeguridad claveSeguridad, Titular titular){
this.cbu=cbu;
this.saldo=saldo;
this.claveSeguridad=claveSeguridad;
this.titular=titular;
}
public String getCbu(){return cbu;}
public void setCbu(String cbu){this.cbu=cbu;}
public double getSaldo(){return saldo;}
public void setSaldo(double saldo){this.saldo=saldo;}
public ClaveSeguridad getClaveSeguridad(){return claveSeguridad;}
public void setClaveSeguridad(ClaveSeguridad claveSeguridad){this.claveSeguridad=claveSeguridad;}
public Titular getTitular(){return titular;}
public void setTitular(Titular titular){this.titular=titular;}
public String toString(){return "CuentaBancaria{"+"cbu="+cbu+","+"saldo="+saldo+","+"claveSeguridad="+claveSeguridad+","+"titular="+titular+"}";}
}