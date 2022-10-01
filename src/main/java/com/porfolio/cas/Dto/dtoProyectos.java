package com.porfolio.cas.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyectos {
    @NotBlank
    private String nombreProyecto;
    @NotBlank
    private String descripcionP;
    private String imagenP;
    
    //Constructor

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreProyecto, String descripcionP, String imagenP) {
        this.nombreProyecto = nombreProyecto;
        this.descripcionP = descripcionP;
        this.imagenP = imagenP;
    }
    
    //Getter y Setter

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcioP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getImagenP() {
        return imagenP;
    }

    public void setImagenP(String imagenP) {
        this.imagenP = imagenP;
    }
    
}
