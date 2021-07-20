package com.project.dabang.repository;

import com.project.dabang.domain.construction.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplianceRepository extends JpaRepository<Appliance,Long> {
}