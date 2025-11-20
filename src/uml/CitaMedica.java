package uml;
public class CitaMedica{
private java.util.Date fecha;
private String hora;
private Paciente paciente;
private Profesional profesional;
public CitaMedica(java.util.Date fecha, String hora, Paciente paciente, Profesional profesional){
this.fecha=fecha;
this.hora=hora;
this.paciente=paciente;
this.profesional=profesional;
}
public java.util.Date getFecha(){return fecha;}
public void setFecha(java.util.Date fecha){this.fecha=fecha;}
public String getHora(){return hora;}
public void setHora(String hora){this.hora=hora;}
public Paciente getPaciente(){return paciente;}
public void setPaciente(Paciente paciente){this.paciente=paciente;}
public Profesional getProfesional(){return profesional;}
public void setProfesional(Profesional profesional){this.profesional=profesional;}
public String toString(){return "CitaMedica{"+"fecha="+fecha+","+"hora="+hora+","+"paciente="+paciente+","+"profesional="+profesional+"}";}
}