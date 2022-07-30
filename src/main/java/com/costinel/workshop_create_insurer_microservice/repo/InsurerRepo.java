package com.costinel.workshop_create_insurer_microservice.repo;

import com.costinel.workshop_create_insurer_microservice.model.Insurer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsurerRepo extends JpaRepository<Insurer, Long> {
}
