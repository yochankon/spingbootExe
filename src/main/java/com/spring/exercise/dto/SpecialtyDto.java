package com.spring.exercise.dto;

public class SpecialtyDto{
    String name;
    String level;

    public SpecialtyDto(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }
}
