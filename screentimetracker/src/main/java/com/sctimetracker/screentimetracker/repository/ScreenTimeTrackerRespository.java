package com.sctimetracker.screentimetracker.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sctimetracker.screentimetracker.model.ScreenTimeTracker;

public interface ScreenTimeTrackerRespository extends JpaRepository<ScreenTimeTracker, Long> {
	List<ScreenTimeTracker> findByCategoryIgnoreCaseOrderByDateDesc(String category);
	 
	@Query(value = "SELECT YEARWEEK(date, 1) as yearweek, category, SUM(minutes_spent) as totalMinutes " +
             "FROM screen_time_tracker " +
             "GROUP BY yearweek, category " +
             "ORDER BY yearweek DESC", nativeQuery = true)

	List<Object[]> findWeeklyCategorySummary();
}
