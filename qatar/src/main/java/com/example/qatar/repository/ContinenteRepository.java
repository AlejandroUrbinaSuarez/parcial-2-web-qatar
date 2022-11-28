package com.example.qatar.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.qatar.model.Continente;

@Repository
public interface ContinenteRepository extends JpaRepository<Continente, Integer>{

}
