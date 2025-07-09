package com.sctimetracker.screentimetracker.controller;

import com.sctimetracker.screentimetracker.model.ScreenTimeTracker;
import com.sctimetracker.screentimetracker.repository.ScreenTimeTrackerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/screentime")
public class ScreenTimeTrackerController {

    @Autowired
    private ScreenTimeTrackerRespository repo;

    @PostMapping("")
    public String create(@ModelAttribute ScreenTimeTracker tracker) {
        repo.save(tracker);
        System.out.println("Saved: " + tracker.getAppName() + " | " + tracker.getMinutesSpent() + " mins | "
                + tracker.getCategory() + " | " + tracker.getDate() + " | " + tracker.getNotes());
        return "redirect:/addscreentime.html";
    }

    // Single list method with optional category filter
    @GetMapping("")
    @ResponseBody
    public List<ScreenTimeTracker> list(@RequestParam(required = false) String category) {
        if (category == null || category.isEmpty()) {
            return repo.findAll(Sort.by(Sort.Direction.DESC, "date"));
        }
        return repo.findByCategoryIgnoreCaseOrderByDateDesc(category);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ScreenTimeTracker get(@PathVariable long id) {
        return repo.findById(id).orElse(null);
    }

    @GetMapping("/viewall")
    public String viewAll(Model model) {
        List<ScreenTimeTracker> entries = repo.findAll(Sort.by(Sort.Direction.DESC, "date"));
        model.addAttribute("entries", entries);
        return "viewall"; 
    }
    
    @GetMapping("/weekly-summary")
    @ResponseBody
    public List<WeeklySummary> getWeeklySummary() {
        List<Object[]> results = repo.findWeeklyCategorySummary();

        // Map results to a DTO class
        return results.stream().map(r -> new WeeklySummary(
            (String) r[0].toString(),   // yearweek string
            (String) r[1],              // category
            ((Number) r[2]).intValue() // totalMinutes
        )).toList();
    }

    // DTO class (could be inner or separate)
    public static class WeeklySummary {
        private String yearWeek;
        private String category;
        private int totalMinutes;

        public WeeklySummary(String yearWeek, String category, int totalMinutes) {
            this.yearWeek = yearWeek;
            this.category = category;
            this.totalMinutes = totalMinutes;
        }

  
        public String getYearWeek() { return yearWeek; }
        public String getCategory() { return category; }
        public int getTotalMinutes() { return totalMinutes; }
    }


    @PutMapping("/{id}")
    @ResponseBody
    public ScreenTimeTracker update(@PathVariable long id, @RequestBody ScreenTimeTracker tracker) {
        tracker.setId(id);
        return repo.save(tracker);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<String> delete(@PathVariable long id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entry not found.");
        }
        repo.deleteById(id);
        return ResponseEntity.ok("Entry deleted successfully.");
    }
}
