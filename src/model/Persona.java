package model;

public class Persona {

    String rut,nombre, estado_Civil, especialidad, ciudad;
    int sueldo;
    String sexo;

    public Persona(String rut, String nombre, String estado_Civil, String especialidad, String ciudad, int sueldo, String sexo) {
        this.rut = rut;
        this.nombre = nombre;
        this.estado_Civil = estado_Civil;
        this.especialidad = especialidad;
        this.ciudad = ciudad;
        this.sueldo = sueldo;
        this.sexo = sexo;
    }

    public Persona() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado_Civil() {
        return estado_Civil;
    }

    public void setEstado_Civil(String estado_Civil) {
        this.estado_Civil = estado_Civil;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
