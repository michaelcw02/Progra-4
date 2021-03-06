package cr.ac.una.prograv.lab.dominio;
// Generated 07-abr-2017 18:54:00 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Personas generated by hbm2java
 */
public class Personas  implements java.io.Serializable {


     private int pkCedula;
     private String nombre;
     private String apellido1;
     private String apellido2;
     private Date fecNacimiento;
     private Integer sexo;
     private String observaciones;
     private String ultUsuario;
     private Date ultModificacion;
     private List<Direcciones> direccioneses;
     private List<Telefonos> telefonoses;

    public Personas() {
    }

	
    public Personas(int pkCedula, String nombre, String apellido1, Date fecNacimiento) {
        this.pkCedula = pkCedula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.fecNacimiento = fecNacimiento;
    }
    public Personas(int pkCedula, String nombre, String apellido1, String apellido2, Date fecNacimiento, Integer sexo, String observaciones, String ultUsuario, Date ultModificacion, List<Direcciones> direccioneses, List<Telefonos> telefonoses) {
       this.pkCedula = pkCedula;
       this.nombre = nombre;
       this.apellido1 = apellido1;
       this.apellido2 = apellido2;
       this.fecNacimiento = fecNacimiento;
       this.sexo = sexo;
       this.observaciones = observaciones;
       this.ultUsuario = ultUsuario;
       this.ultModificacion = ultModificacion;
       this.direccioneses = direccioneses;
       this.telefonoses = telefonoses;
    }
   
    public int getPkCedula() {
        return this.pkCedula;
    }
    
    public void setPkCedula(int pkCedula) {
        this.pkCedula = pkCedula;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return this.apellido1;
    }
    
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return this.apellido2;
    }
    
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public Date getFecNacimiento() {
        return this.fecNacimiento;
    }
    
    public void setFecNacimiento(Date fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }
    public Integer getSexo() {
        return this.sexo;
    }
    
    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public String getUltUsuario() {
        return this.ultUsuario;
    }
    
    public void setUltUsuario(String ultUsuario) {
        this.ultUsuario = ultUsuario;
    }
    public Date getUltModificacion() {
        return this.ultModificacion;
    }
    
    public void setUltModificacion(Date ultModificacion) {
        this.ultModificacion = ultModificacion;
    }
    public List<Direcciones> getDireccioneses() {
        return this.direccioneses;
    }
    
    public void setDireccioneses(List<Direcciones> direccioneses) {
        this.direccioneses = direccioneses;
    }
    public List<Telefonos> getTelefonoses() {
        return this.telefonoses;
    }
    
    public void setTelefonoses(List<Telefonos> telefonoses) {
        this.telefonoses = telefonoses;
    }

}


