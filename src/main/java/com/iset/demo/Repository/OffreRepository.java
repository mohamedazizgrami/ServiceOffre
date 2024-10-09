package com.iset.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iset.demo.entities.Offre;

public interface OffreRepository extends JpaRepository<Offre, Long>{
    
}
