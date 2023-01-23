package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "type_of_work")
public class TypeOfWork {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    @Column(name = "cost_per_square")
    private int costPerSquare;
}
