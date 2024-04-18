public class Task {
    private int taskId;
    private String description;
    private String dueDate;
    private boolean completed = false;
    private String priority;
    // All the variables are private in order to ensure encapsulation. They are reachable by public methods.
    Task (String description, String dueDate, String priority){
        this.description=description;
        this.dueDate=dueDate;
        this.priority=priority;
    }

    public String getDueDate(){
        return dueDate;
    } // I added one getter method for the due Date in order to be able to make a report with the tasks that need to be done today.
    public void setTaskId (int TaskId) {
        taskId = TaskId;
    } // I decided to set the ID of the task after the object has been created. The ID will automatically be created and it will be different than the one before with 1.
    public void setCompleted (boolean completed) {
        this.completed=completed;
    } // In order for the user to mark tasks completed I needed to make a setter method that will allow the user to change the variable.
    public String toString() {
        return ("Task Id: "+taskId+
                "   Description: "+ description +
                "   Due date: "+ dueDate +
                "   Priority: " + priority+
                "   Completion: "+completed);
    } // I created this method in order for the array List to be able to print out the different variables of each object.
}
