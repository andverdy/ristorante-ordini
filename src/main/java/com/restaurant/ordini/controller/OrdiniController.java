package com.restaurant.ordini.controller;

import com.restaurant.ordini.entities.LocaliEntity;
import com.restaurant.ordini.services.OrdiniService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/ordini")
@RequiredArgsConstructor
public class OrdiniController {
    private final OrdiniService ordiniService;

    @GetMapping("/getOrdini")
    public List<LocaliEntity> getOrdini() throws Exception {
        List<LocaliEntity> response = ordiniService.getOrdini();
        return response;
    }
}
