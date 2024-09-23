package com.anasdev.commandes.dao;

import com.anasdev.commandes.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommandeDao extends JpaRepository<Commande,Long> {

    Commande findByReference(String reference);

    int deleteByReference(String reference);

}
