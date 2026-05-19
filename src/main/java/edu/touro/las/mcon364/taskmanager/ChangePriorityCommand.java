package edu.touro.las.mcon364.taskmanager;

public final class ChangePriorityCommand implements Command {
    private final TaskRegistry registry;
    private final String taskName;
    private final Priority newPriority;

    public ChangePriorityCommand(TaskRegistry registry, String taskName, Priority newPriority) {
        this.registry = registry;
        this.taskName = taskName;
        this.newPriority = newPriority;
    }

    public void execute() {
        Task existing = registry.get(taskName).orElseThrow(() -> new TaskNotFoundException("Cannot change priority: task " + taskName
                        + " not found"));
        registry.add(new Task(existing.name(), newPriority));
    }
}
