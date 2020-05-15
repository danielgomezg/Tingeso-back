package com.Tingesoback.Tingeso.repositories;

import com.Tingesoback.Tingeso.models.Estudiante;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{
    Estudiante findEstudianteById(Long id);
}