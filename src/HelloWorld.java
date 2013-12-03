import org.apache.tools.ant.Task;

public class HelloWorld extends Task{

	public void execute() {
		//use of the reference to Project-instance
		String message = getProject().getProperty("ant.project.name");

		//Task's log method
		log("Here is project '" + message + "'.");

		//where is this task used?
		log("I am used in: " + getLocation());
	}
}