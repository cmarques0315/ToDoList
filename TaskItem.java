package todopackage;
import jakarta.persistence.*;
// TaskItem goal: store task info - task description and if task has been done or not

@Entity
@Table(name = "task_items")
public class TaskItem {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(nullable = false)
	String description;

	boolean done;

	public TaskItem() {}

	public TaskItem(String d) {
		description = d;
		done = false;
	}

	public void markComplete() {
		done = true;
	}

	@Override
	public String toString() {
	    String status = done ? "y" : "n";
	    return id + ": [" + status + "] " + description;


	}
	public int getId() {return id;}

	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}

	public boolean isDone() {return done;}
	public void setDone(boolean done) {this.done = done;}

}
