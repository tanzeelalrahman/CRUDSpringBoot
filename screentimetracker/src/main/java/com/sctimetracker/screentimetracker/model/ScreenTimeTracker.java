package com.sctimetracker.screentimetracker.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ScreenTimeTracker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String appName;
    private int minutesSpent;
    private String category; 
    private LocalDate date;
    private String notes;

   
    public ScreenTimeTracker() {}


    public ScreenTimeTracker(String appName, int minutesSpent, String category, LocalDate date, String notes) {
        this.appName = appName;
        this.minutesSpent = minutesSpent;
        this.category = category;
        this.date = date;
        this.notes = notes;
    }

   
    public void setId(Long id) {
        this.id = id;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setMinutesSpent(int minutesSpent) {
        this.minutesSpent = minutesSpent;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getAppName() {
        return appName;
    }

    public int getMinutesSpent() {
        return minutesSpent;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNotes() {
        return notes;
    }

}
