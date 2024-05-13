package com.example.Practic1305;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import lombok.Setter;
import lombok.Getter;


@Entity
@Table(name = "users")
@Data
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter @Setter
    private int id;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String job;
}



