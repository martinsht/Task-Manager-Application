import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Task_Manager obj = new Task_Manager();
        obj.create_Task("Doing my hw","tomorrow", "not urgent");// created this task for testing purposes
        obj.create_Task("Cleaning my room","TODAY", "urgent");
        byte answer =0;
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Task App!");
        do { // created a do-while loop for the menu
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Give list of tasks for today");
            System.out.println("4. Mark task as completed");
            System.out.println("5. Exit app");
            System.out.print("Enter the number that corresponds to the task you want to do:");
            answer=read.nextByte();
            switch (answer){ // created a switch-case statement for the different options in the menu
                case 1:
                    System.out.println("Please add description of task:");
                    String description = read.next();
                    String add = read.nextLine(); // needed to find a way to record the user's input since nextLine is not working properly.
                    System.out.println("Please add due date of task:");
                    String date = read.next();
                    System.out.println("Please add priority of task:");
                    String priority = read.next();
                    String priority_add = read.nextLine();
                    obj.create_Task(description+add,date,priority+priority_add);
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    obj.report_today();
                    break;
                case 4:
                    obj.display();
                    System.out.println();
                    System.out.print("Which task have you completed? Write the number of the task: ");
                    try { // Created a try-catch error for when the user enters a number that is out of the size of the array List/ not the ID of neither task.
                        int input = read.nextInt();
                        obj.Mark_complete(input);
                    } catch (Exception e){
                        System.out.println("The number has to be the ID of the specific task!");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please enter a valid number!");
                    break;
            }
        }while (answer!=5);
    }

}