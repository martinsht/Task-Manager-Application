import java.util.ArrayList;
public class Task_Manager {
    // I have two classes for organization. Task class holds the variables and Task manager manipulates them.
    ArrayList<Task>tasks = new ArrayList<>(); // created an Array List for easier access of all the tasks.
    public void create_Task (String description, String dueDate, String priority){
        dueDate = dueDate.toLowerCase();
        Task task = new Task(description,dueDate,priority);
        tasks.add(task);
        task.setTaskId(tasks.indexOf(task)+1); // Here I set the ID of the task to be its index in the Array list +1.
    }
    public void Mark_complete (int number){
        tasks.get(number-1).setCompleted(true);
        System.out.println("Task completed!");
        System.out.println();
    }
    public void report_today (){
        System.out.println("Tasks for today:");
        for (int i =0; i<tasks.size();i++) {
            if (tasks.get(i).getDueDate().equals("today")){
                System.out.println(tasks.get(i));
            }
        }
    }
    public void display(){
        for (Task items : tasks) {
            System.out.println(items);
        } // Array list makes it much more easier to display the objects.
    }

    }
