package com.backend.dentsoft.doktor;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "doktor")
@Data
public class Doktor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name;
}
