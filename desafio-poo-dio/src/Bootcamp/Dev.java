package Bootcamp;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();
    private LocalDate closingDate;

    public Dev(String name) {
        this.name = name;
    }

    public void subscribeBootcamp(Bootcamp bootcamp) {
        subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getDevsInscritos().add(this);
        closingDate = bootcamp.getFinalDate();
    }
    
    public void progress() {
        Optional<Content> completedContent = this.subscribedContents.stream().findFirst();
        if (completedContent.isPresent()) {
            this.completedContents.add(completedContent.get());
            subscribedContents.remove(completedContent.get()); 
        } else {
            System.out.println("Você não está matriculado em nenhum conteudo!");
        }
    }
    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }
    public double calculateTotalXp() {
        return completedContents.stream().mapToDouble(Content::calculateXp).sum();
    }
    public void showSubscribedCourses() {
        System.out.println(this.getSubscribedContents());
    }
    public void showCompletedCourses() {
        System.out.println(this.getCompletedContents());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }
    public void showProgression() {
        double porcentageProgression = (Double.valueOf(completedContents.size()) / Double.valueOf(subscribedContents.size())) * 100;
        System.out.println("Sua progressão no conteúdo é de " + porcentageProgression + "%");
    }
    public void showClosingDate() {
        System.out.println("Closing date: " + this.closingDate);
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((subscribedContents == null) ? 0 : subscribedContents.hashCode());
        result = prime * result + ((completedContents == null) ? 0 : completedContents.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (subscribedContents == null) {
            if (other.subscribedContents != null)
                return false;
        } else if (!subscribedContents.equals(other.subscribedContents))
            return false;
        if (completedContents == null) {
            if (other.completedContents != null)
                return false;
        } else if (!completedContents.equals(other.completedContents))
            return false;
        return true;
    }
}
