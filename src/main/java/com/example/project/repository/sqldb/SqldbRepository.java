package com.example.project.repository.sqldb;

import com.example.project.entity.region_waste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SqldbRepository extends JpaRepository<region_waste, Long> {
}