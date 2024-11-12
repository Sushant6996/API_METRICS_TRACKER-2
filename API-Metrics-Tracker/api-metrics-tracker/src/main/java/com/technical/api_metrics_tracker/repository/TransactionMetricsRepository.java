package com.technical.api_metrics_tracker.repository;

import com.technical.api_metrics_tracker.model.TransactionMetrics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionMetricsRepository extends JpaRepository<TransactionMetrics, Long> {

    // Custom query methods can be added here if needed
}