package Bootcamp;

public abstract class Content {
    protected static final double XP_PADRAO = 10d;
    private String title;
    private String description;

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }
    public abstract double calculateXp();
    
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
}
