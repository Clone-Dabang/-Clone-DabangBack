package com.project.dabang.repository;

import com.project.dabang.domain.construction.Construction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionRepository extends JpaRepository<Construction, Long> {
}

