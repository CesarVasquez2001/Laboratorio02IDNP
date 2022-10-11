package com.example.laboratorio02;

public class postulante {
    private String paterno;
    private String materno;
    private String nombre;
    private String fecha;
    private String colegio;
    private String carrera;

    public postulante(String paterno, String materno, String nombre, String fecha, String colegio, String carrera) {
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombre;
        this.fecha = fecha;
        this.colegio = colegio;
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "\npostulante{" +
                "\npaterno='" + paterno + '\'' +
                ", \nmaterno='" + materno + '\'' +
                ", \nnombre='" + nombre + '\'' +
                ", \nfecha='" + fecha + '\'' +
                ", \ncolegio='" + colegio + '\'' +
                ", \ncarrera='" + carrera + '\'' +
                "}\n";
    }
}
