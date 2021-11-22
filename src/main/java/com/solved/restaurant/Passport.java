package com.solved.restaurant;

import java.time.LocalDateTime;

public class Passport {

    private String number;
    private LocalDateTime expiredAt;
    private boolean isOwnerMarried;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(LocalDateTime expiredAt) {
        this.expiredAt = expiredAt;
    }

    public boolean isOwnerMarried() {
        return isOwnerMarried;
    }

    public void setOwnerMarried(boolean ownerMarried) {
        isOwnerMarried = ownerMarried;
    }
}
