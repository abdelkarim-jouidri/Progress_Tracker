package com.example.progress_tracker.Models;

import lombok.Data;

@Data
public class Goal {
    private Long id;
    private String description;
    private boolean completionStatus;

    public Goal(Long id, String description) {
        this.id = id;
        this.description = description;
        this.completionStatus = false; // Default completion status is false
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(boolean completionStatus) {
        this.completionStatus = completionStatus;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", completionStatus=" + completionStatus +
                '}';
    }
}
