package com.example.demo;

public class Enrollment {
    private int enrollnmentKey;

    public Enrollment(int enrollnmentKey) {
        this.enrollnmentKey = enrollnmentKey;
    }

    public int getEnrollnmentKey() {
        return enrollnmentKey;
    }

    public void setEnrollnmentKey(int enrollnmentKey) {
        this.enrollnmentKey = enrollnmentKey;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollnmentKey=" + enrollnmentKey +
                '}';
    }
}
