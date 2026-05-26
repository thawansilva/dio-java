package Bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private LocalDate initialDate = LocalDate.now();
    private LocalDate finalDate = initialDate.plusDays(60);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public Bootcamp(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    public Set<Content> getContents() {
        return contents;
    }
    public LocalDate getFinalDate() {
        return finalDate;
    }
}
