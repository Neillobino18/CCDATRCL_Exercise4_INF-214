import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> Enrollment = new LinkedList<>();

        // Adds elements to the queue
        Enrollment.add("Neil Rifarial");
        Enrollment.add("Ronn matthew adia");
        Enrollment.add("Alexander Du");
        Enrollment.add("Mycko Par");
        Enrollment.add("Lawrence Aranilla");
        

        System.out.println(Enrollment);

        System.out.println(Enrollment.size());

        System.out.println(Enrollment.peek());

       Enrollment.remove();
       Enrollment.remove();
       Enrollment.remove();
       Enrollment.remove();
       Enrollment.remove();

       System.out.println(Enrollment);

       Enrollment.add("Marianne papina");
       Enrollment.add("jap bolanos");
       Enrollment.add("Tristan tenerife");
       Enrollment.add("kean dapitillo");
       Enrollment.add("Ivan guansing");

       System.out.println(Enrollment);

       System.out.println(Enrollment.size());

       System.out.println(Enrollment.peek());

    }
}
