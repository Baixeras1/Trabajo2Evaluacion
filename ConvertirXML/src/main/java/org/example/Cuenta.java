package org.example;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class Cuenta {

    private String tipo;
    private String nombre;
    private String numero;
    private String saldohaber;
    private String saldodebe;
    private String aportacion;

    public String getTipo() {
        return tipo;
    }

    @XmlAttribute(name = "tipo")
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    @XmlElement(name = "nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    @XmlElement(name = "numero")
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSaldohaber() {
        return saldohaber;
    }

    @XmlElement(name = "saldohaber")
    public void setSaldohaber(String saldohaber) {
        this.saldohaber = saldohaber;
    }

    public String getSaldodebe() {
        return saldodebe;
    }

    @XmlElement(name = "saldodebe")
    public void setSaldodebe(String saldodebe) {
        this.saldodebe = saldodebe;
    }

    public String getAportacion() {
        return aportacion;
    }

    @XmlElement(name = "aportacion")
    public void setAportacion(String aportacion) {
        this.aportacion = aportacion;
    }
}
