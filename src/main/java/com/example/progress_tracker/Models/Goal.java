package com.example.progress_tracker.Models;

import lombok.Data;

@Data
public class Goal {
    private int id;
    private String description;
    private CompletionStatus completionStatus;

    public enum CompletionStatus{
        IN_PROGRESS,
        COMPLETED
    }
}
