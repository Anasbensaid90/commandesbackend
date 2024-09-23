package com.anasdev.commandes.ws.provided;

import com.anasdev.commandes.bean.Commande;
import com.anasdev.commandes.service.facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/commande")
public class CommandWs {

    @Autowired
    private CommandeService commandeService;

    @GetMapping("/reference/{reference}")
    public Commande findByReference(@PathVariable String reference) {
        return commandeService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return commandeService.deleteByReference(reference);
    }

    @PostMapping("/")
    public Commande save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }

    @GetMapping("/")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }
}
