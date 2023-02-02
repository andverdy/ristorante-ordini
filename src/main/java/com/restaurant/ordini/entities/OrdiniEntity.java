package com.restaurant.ordini.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
@Entity(name = "ordini")
@Table(schema = "restaurant")
public class OrdiniEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORDINE")
    private Integer idOrdine;

    @Column(name = "DESC_ORDINE")
    private String descOrdine;
}
