package com.backend.dentsoft.hasta;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "hasta")
@Data
public class Hasta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name;
}
