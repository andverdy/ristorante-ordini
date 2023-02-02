package com.restaurant.ordini.services;

import com.restaurant.ordini.adapter.OrdiniAdapter;
import com.restaurant.ordini.entities.LocaliEntity;
import com.restaurant.ordini.repositories.OrdiniRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdiniService {

    @Autowired
    private OrdiniRepository ordiniRepository;
    private final OrdiniAdapter ordiniAdapter;

    public List<LocaliEntity> getOrdini() throws Exception {
        ResponseEntity<Object> response = ordiniAdapter.getOrdini();
        return (List<LocaliEntity>) response.getBody();
    }
}
