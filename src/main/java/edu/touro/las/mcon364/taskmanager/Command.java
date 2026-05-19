package edu.touro.las.mcon364.taskmanager;

public sealed interface Command
        permits AddTaskCommand, AddUniqueTaskCommand, ChangePriorityCommand, RemoveTaskCommand, UpdateTaskCommand {
    void execute();
}
