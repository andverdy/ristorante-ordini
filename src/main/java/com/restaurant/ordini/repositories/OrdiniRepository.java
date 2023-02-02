package com.restaurant.ordini.repositories;

import com.restaurant.ordini.entities.OrdiniEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdiniRepository extends JpaRepository<OrdiniEntity, Integer> {

}
