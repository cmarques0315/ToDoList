package todo;

import org.junit.jupiter.api.Test;
import javax.ws.rs.core.Response;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    void testAddTask() {
        TaskData data = new TaskData();

        Map<String, String> body = new HashMap<>();
        body.put("task", "Study CI/CD");

        Response response = data.addTask(body);

        List<String> tasks = (List<String>) response.getEntity();

        assertEquals(1, tasks.size());
        assertEquals("Study CI/CD", tasks.get(0));
    }

    @Test
    void testDeleteTask() {
        TaskData data = new TaskData();

        Map<String, String> body = new HashMap<>();
        body.put("task", "Delete me");
        data.addTask(body);

        data.deleteTask(0);

        List<String> tasks = data.getTasks();

        assertEquals(0, tasks.size());
    }
}
