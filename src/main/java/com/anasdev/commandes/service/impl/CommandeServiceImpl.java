package com.anasdev.commandes.service.impl;

import com.anasdev.commandes.bean.Commande;
import com.anasdev.commandes.dao.CommandeDao;
import com.anasdev.commandes.service.facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {

    @Override
    public List<Commande> findAll() {
        return commandeDao.findAll();
    }


    @Override
    public Commande findByReference(String reference) {
        return commandeDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String reference) {
        return commandeDao.deleteByReference(reference);
    }

    public Commande save(Commande commande) {
        return commandeDao.save(commande);
    }

    @Autowired
    private CommandeDao commandeDao;
}
