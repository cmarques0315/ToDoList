package todo;

import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/tasks")
@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
public class TaskData {
	
    private static final List<String> tasks = new ArrayList<>();


    @GET
    public List<String> getTasks() {
    
        return tasks;
    }

    @POST
    public Response addTask(Map<String, String> body) {
        String task = body.get("task");
        if (task != null && !task.isBlank()) {
            tasks.add(task);
        }
      
        return javax.ws.rs.core.Response.ok(tasks).build();
    }

    @DELETE
    @Path("/{index}")
    public Response deleteTask(@PathParam("index") int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
        return Response.ok(tasks).build();
    }
}
