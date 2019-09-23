package me.cetjs2.weborg;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Todo {
    private String note;
    private LocalDateTime time;

    public Todo(String note) {
        this.note = note;
        this.time = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return this.note + " (created at " + this.time.toString() + ");";
    }
}


