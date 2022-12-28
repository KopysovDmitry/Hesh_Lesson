import java.util.Set;

public class TaskList {
    private Set<Task> tasks;

    public TaskList(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task){
        if (tasks.contains(task)){
            throw new IllegalArgumentException("This task is already defined");
        }
        tasks.add(task);
        System.out.println("Added in list: "+task);
    }
    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
