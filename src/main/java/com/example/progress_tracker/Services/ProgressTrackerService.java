package com.example.progress_tracker.Services;

import com.example.progress_tracker.Models.Goal;
import com.example.progress_tracker.Models.User;

public class ProgressTrackerService {
        private User user;
        private Goal goal;

        // Constructors with dependency injection
        public ProgressTrackerService(User user, Goal goal) {
            this.user = user;
            this.goal = goal;
        }

        public void assignGoal() {
            System.out.println("Assigning goal to user: " + user.getFullName());
            System.out.println("Assigned Goal: " + goal);
        }

        public void updateProgress() {
            System.out.println("Updating progress for user: " + user.getFullName());
            goal.setCompletionStatus(true); // Simulating progress update
            System.out.println("Updated Goal: " + goal);
        }

        public void trackAchievements() {
            System.out.println("Tracking achievements for user: " + user.getFullName());
            if (goal.isCompletionStatus()) {
                System.out.println("User achieved the goal!");
            } else {
                System.out.println("User has not achieved the goal yet.");
            }
        }

        // Getters and setters (if needed)

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Goal getGoal() {
            return goal;
        }

        public void setGoal(Goal goal) {
            this.goal = goal;
        }


}
