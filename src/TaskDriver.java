import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TaskDriver {
    public static Scanner s = new Scanner(System.in);
    public static ArrayList<Task> listOfTasks = new ArrayList<>();

    public static void main(String[] args) {
        String name;
        String p;
        String c;

        System.out.print("Enter list of tasks in the following format: \n" +
                "NAME,PRIORITY,COMPLEXITY\n" +
                "\nonce you've finished just enter word 'stop'."
                );
        // Create list of tasks
        while (true) {

            String newTask = s.next();

            if (newTask.equalsIgnoreCase("stop")) {
                break;
            }

            name = newTask.split(",")[0];
            p = newTask.split(",")[1];
            c = newTask.split(",")[2];

            listOfTasks.add(new Task(name, p, c));
        }

        calculateDuration();

        System.out.println("\nEnter desired priority: HIGH, MEDIUM or LOW");

        getListOfTasksByPriority();

        //Calculate how many tasks can be completed in 'n' days
        System.out.println("\nHow many days do we have to complete tasks?");

        getListOfTasksCompletedInNDays();

    }

    public static void calculateDuration() {
        //Calculate tasks duration
        int h = 0;
        for (Task task : listOfTasks) {
            h += task.getComplexity().getHours();
        }
        System.out.println("It takes " + h + " hours to complete all tasks.");
    }

    public static void getListOfTasksByPriority(){
        String p;

        //Get list of task by given priority
        p = s.next();
        System.out.println("Below the list of tasks that match entered priority:");
        for (Task task : listOfTasks) {
            if (task.getPriority()==Priority.valueOf(p)) {
                System.out.println(task.toString());
            }
        }
    }

    public static void getListOfTasksCompletedInNDays() {
        int d;
        d = s.nextInt();
        //Provide 8 hours working days
        int h = d * 8;
        System.out.println("We have only " +h+ " hours. Let's do our best to complete following tasks: ");

        for (Task task : listOfTasks) {
            if (task.getComplexity().getHours() <= h) {
                System.out.println(task.toString());
                h -= task.getComplexity().getHours();

            }
        }
    }

}