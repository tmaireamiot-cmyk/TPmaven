package fr.esir.omd.ci;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TaskManagerTest {
    private List<Task> tasks;
    private static final Logger logger = LoggerFactory.getLogger(TaskManager.class);

    public TaskManagerTest() {
        tasks = new ArrayList<>();
        
    }

    public void addTask(Task task) {
        tasks.add(task);
        logger.info("Nouvelle tâche ajoutée {}", task.getTitle());
    }

    public List<Task> getTasks() {
        logger.debug("Récupération de la liste des {} tâches", tasks.size());
        return tasks;
    }
}
