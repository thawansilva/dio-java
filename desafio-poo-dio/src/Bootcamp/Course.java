package Bootcamp;

public class Course extends Content {
    private int workload;

    public Course(String title, String description) {
        super(title, description);
    }

    @Override
    public double calculateXp() {
        return XP_PADRAO * workload;
    }

    public Course(String title, String description, int workload) {
        super(title, description);
        this.workload = workload; 
    }

    @Override
    public String toString() {
        return "Curso {cargaHoraria=" + workload + ", título=" + getTitle() + ", descricao=" + getDescription()
                + "}";
    }
    
}
