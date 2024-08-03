package com.dgn.emptylist.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "T_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @ElementCollection
    @CollectionTable(name = "user_orders", joinColumns = @JoinColumn(name = "user_id"))
    private List<String> orders = new ArrayList<>();
}
