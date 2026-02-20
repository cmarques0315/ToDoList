package todo;

import org.glassfish.jersey.server.ResourceConfig;

@javax.ws.rs.ApplicationPath("/api")
public class Rest extends ResourceConfig {
    public Rest() {
        packages("todo"); 
        
    }
}
