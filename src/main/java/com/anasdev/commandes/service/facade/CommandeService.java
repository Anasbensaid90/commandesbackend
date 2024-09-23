package com.anasdev.commandes.service.facade;


import com.anasdev.commandes.bean.Commande;

import java.util.List;

public interface CommandeService {

    Commande findByReference(String reference);

    int deleteByReference(String reference);

    Commande save(Commande commande);

    List<Commande> findAll();
}

