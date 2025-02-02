package com.example.sintomedic;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellidos;
    private String localidad;

    @NotBlank
    private String correo;

    private String companiaAseguradora;
    private String telefono;

    @NotBlank
    private String dniNie;

    private String numColegiado;
    private Date fechaNacimiento;
    private String tratamiento;

    private String idListaPacientes;

    private String idListaDoctores;

    //@NotBlank
    private Boolean esDoctor;

    private String linkFotoPerfil;
    //@NotBlank
    private String contrasenia;

    public Usuario() {
        super();
    }

    /*public Usuario(@JsonProperty("contrasenia") String contrasenia, @JsonProperty("dni_nie") String dniNie) {
        super();
        this.dniNie = dniNie;
        this.contrasenia = contrasenia;
    }

    public String getIdListaEnfermedades() {
        return idListaEnfermedades;
    }


    public void setIdListaEnfermedades(String idListaEnfermedades) {
        this.idListaEnfermedades = idListaEnfermedades;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCompaniaAseguradora() {
        return companiaAseguradora;
    }

    public void setCompaniaAseguradora(String companiaAseguradora) {
        this.companiaAseguradora = companiaAseguradora;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDniNie() {
        return dniNie;
    }

    public void setDniNie(String dniNie) {
        this.dniNie = dniNie;
    }

    public String getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(String numColegiado) {
        this.numColegiado = numColegiado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }


    public String getIdListaPacientes() {
        return idListaPacientes;
    }

    public void setIdListaPacientes(String idListaPacientes) {
        this.idListaPacientes = idListaPacientes;
    }

    public String getIdListaDoctores() {
        return idListaDoctores;
    }

    public void setIdListaDoctores(String idListaDoctores) {
        this.idListaDoctores = idListaDoctores;
    }

    public Boolean getEsDoctor() {
        return esDoctor;
    }

    public void setEsDoctor(Boolean esDoctor) {
        this.esDoctor = esDoctor;
    }

    public String getLinkFotoPerfil() {
        return linkFotoPerfil;
    }

    public void setLinkFotoPerfil(String linkFotoPerfil) {
        this.linkFotoPerfil = linkFotoPerfil;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) &&
                Objects.equals(nombre, usuario.nombre) &&
                Objects.equals(apellidos, usuario.apellidos) &&
                Objects.equals(localidad, usuario.localidad) &&
                Objects.equals(correo, usuario.correo) &&
                Objects.equals(companiaAseguradora, usuario.companiaAseguradora) &&
                Objects.equals(telefono, usuario.telefono) &&
                Objects.equals(dniNie, usuario.dniNie) &&
                Objects.equals(numColegiado, usuario.numColegiado) &&
                Objects.equals(fechaNacimiento, usuario.fechaNacimiento) &&
                Objects.equals(tratamiento, usuario.tratamiento) &&
                Objects.equals(idListaPacientes, usuario.idListaPacientes) &&
                Objects.equals(idListaDoctores, usuario.idListaDoctores) &&
                Objects.equals(esDoctor, usuario.esDoctor) &&
                Objects.equals(linkFotoPerfil, usuario.linkFotoPerfil) &&
                Objects.equals(contrasenia, usuario.contrasenia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellidos, localidad, correo, companiaAseguradora, telefono, dniNie, numColegiado, fechaNacimiento, tratamiento, idListaPacientes, idListaDoctores, esDoctor, linkFotoPerfil, contrasenia);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nUsuario");
        sb.append("\nid=").append(id);
        sb.append(", nombre='").append(nombre).append("\n");
        sb.append(", apellidos='").append(apellidos).append("\n");
        sb.append(", localidad='").append(localidad).append("\n");
        sb.append(", correo='").append(correo).append("\n");
        sb.append(", companiaAseguradora='").append(companiaAseguradora).append("\n");
        sb.append(", telefono='").append(telefono).append("\n");
        sb.append(", dniNie='").append(dniNie).append("\n");
        sb.append(", numColegiado='").append(numColegiado).append("\n");
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", tratamiento='").append(tratamiento).append("\n");
        sb.append(", idListaPacientes='").append(idListaPacientes).append("\n");
        sb.append(", idListaDoctores='").append(idListaDoctores).append("\n");
        sb.append(", esDoctor=").append(esDoctor);
        sb.append(", linkFotoPerfil='").append(linkFotoPerfil).append("\n");
        sb.append(", contrasenia='").append(contrasenia).append("\n");
        sb.append("]");
        return sb.toString();
    }
}
