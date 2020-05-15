package com.Tingesoback.Tingeso.repositories;

import com.Tingesoback.Tingeso.models.Carrera;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long>{
    Carrera findEstudianteById(Long id);
}