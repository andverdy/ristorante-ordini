package com.restaurant.ordini.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
@Entity(name = "locali")
@Table(schema = "restaurant")
public class LocaliEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locali")
    private Integer idLocali;

    @Column(name = "nome_locale")
    private String nomeLocale;

    @Column(name = "larghezza_locale")
    private String larghezzaLocale;

    @Column(name = "lunghezza_locale")
    private String lunghezzaLocale;

    @Column(name = "capienza_tavoli_locale")
    private String capienzaTavoliLocale;
}
