package edu.touro.las.mcon364.taskmanager;

public final class AddUniqueTaskCommand implements Command {
    private final TaskRegistry registry;
    private final Task task;

    public AddUniqueTaskCommand(TaskRegistry registry, Task task) {
        this.registry = registry;
        this.task = task;
    }

    public void execute() {
        if (registry.get(task.name()).isPresent()) {
            throw new DuplicateTaskException(
                    "Task '" + task.name() + "' already exists");
        }
        registry.add(task);
    }
}
