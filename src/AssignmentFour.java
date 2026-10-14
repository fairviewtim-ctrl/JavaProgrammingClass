import java.util.Scanner;
import java.util.ArrayList;

class TimeTask {

    private String taskName;
    private Integer minutes;
    private Boolean completed;

    public TimeTask(String taskName, Integer minutes) {
        this.taskName = taskName;
        this.minutes = minutes;
        this.completed = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public void displayTask() {
        System.out.println("Task: " + taskName);
        System.out.println("Time: " + minutes + " minutes");
        System.out.println("Completed: " + completed);
    }
}

public class AssignmentFour {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<TimeTask> tasks = new ArrayList<>();

        String again = "y";
        while (again.equals("y")) {

            System.out.print("Enter your task: ");
            String task = input.nextLine();

            System.out.print("Enter time in minutes: ");
            Integer minutes = input.nextInt();
            input.nextLine();

            TimeTask newTask = new TimeTask(task,minutes);

            System.out.print("Is the task completed? (y/n)");
            newTask.setCompleted(input.nextLine().equalsIgnoreCase("y"));

            tasks.add(newTask);
            System.out.print("Add another task? (y/n): ");
            again = input.nextLine();
        }

        System.out.println("\nYour Schedule:");
        for (TimeTask t : tasks) {
            t.displayTask();
        }

        input.close();
    }
}