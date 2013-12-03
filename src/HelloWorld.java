import org.apache.tools.ant.Task;
import org.apache.tools.ant.BuildException;

public class HelloWorld extends Task{

	String message;

	public void setMessage(String msg) {
		message = msg;
	}

	public void execute() {
		if (message == null) {
			throw new BuildException("No Message Set.");
		}
		log(message);
	}
}