package com.Tingesoback.Tingeso.models;

import lombok.Data;
import lombok.NonNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "estudiante")
public class Carrera{

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String nombre;

}