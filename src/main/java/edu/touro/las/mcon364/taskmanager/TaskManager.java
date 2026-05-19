package edu.touro.las.mcon364.taskmanager;

public class TaskManager {

    private final TaskRegistry registry;

    public TaskManager(TaskRegistry registry) {
        this.registry = registry;
    }

    // TODO: Students must refactor this using pattern-matching switch
    // Current implementation uses old-style instanceof checks
    public void run(Command command) {
        switch (command) {
            case AddTaskCommand c -> c.execute();
            case RemoveTaskCommand c -> c.execute();
            case UpdateTaskCommand c -> c.execute();
            case ChangePriorityCommand c -> c.execute();
            case AddUniqueTaskCommand c -> c.execute();
        }
    }
}
