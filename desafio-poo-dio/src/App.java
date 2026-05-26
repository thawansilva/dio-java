import java.time.LocalDate;

import Bootcamp.Bootcamp;
import Bootcamp.Course;
import Bootcamp.Dev;
import Bootcamp.Mentorship;

public class App {
    public static void main(String[] args) throws Exception {
        
        Bootcamp bootcamp = new Bootcamp("Curso de Frontend", "Conteúdos para se tornar um dev frontend");
        Course curso1 = new Course("HTML", "Conteúdo html", 4);
        Course curso2 = new Course("CSS", "Conteúdo CSS", 5);
        Course curso3 = new Course("JS", "Conteúdo js", 8);
        Course curso4 = new Course("React", "Conteúdo react", 12);
        Course curso5 = new Course("TailwindCSS", "Conteúdo TailwindCSS", 8);
        Mentorship mentoria = new Mentorship("Entrevista de Emprego", "Como se comportar na entrevista", LocalDate.now());
        
        bootcamp.getContents().add(curso1);
        bootcamp.getContents().add(curso2);
        bootcamp.getContents().add(curso3);
        bootcamp.getContents().add(curso4);
        bootcamp.getContents().add(curso5);
        bootcamp.getContents().add(mentoria);

        Dev thawan = new Dev("Thawan");
        thawan.subscribeBootcamp(bootcamp);


        System.out.println("******");
        System.out.println("Dev: Thawan");
        System.out.println("Conteúdos inscritos: " + thawan.getSubscribedContents());
        System.out.println("---");
        thawan.progress();
        System.out.println("Conteúdos inscritos: " + thawan.getSubscribedContents());
        System.out.println("---");
        System.out.println("Conteúdos completados: " + thawan.getCompletedContents());
        System.out.println("---");
        System.out.println("Total XP: " + thawan.calculateTotalXp());
        thawan.showProgression();
        thawan.showClosingDate();  
        System.out.println("******");
    }
}
