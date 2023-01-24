package com.voces.apiresttuvoz.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("entradanoticia")
public class EntradaNoticia {
    @Id
    private String id;
    private String titulo;
    private String cuerpo;
    private String autor;
    private String fechaCreacion;
    private String fechaActualizacion;
    private String fuente;

    public EntradaNoticia(String id, String titulo, String cuerpo, String autor, String fechaCreacion, String fechaActualizacion, String fuente) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.fuente = fuente;
    }
}
