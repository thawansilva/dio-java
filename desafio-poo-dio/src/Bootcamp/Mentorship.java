package Bootcamp;

import java.time.LocalDate;

public class Mentorship extends Content {
    private LocalDate date;

    public Mentorship(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    @Override
    public double calculateXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Mentoria {data=" + getDate() + ", título=" + getTitle() + ", descrição=" + getDescription()
                + "}";
    }
    
    
}
