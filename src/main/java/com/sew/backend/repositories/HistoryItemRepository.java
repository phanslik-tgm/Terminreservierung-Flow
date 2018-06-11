package com.sew.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sew.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
