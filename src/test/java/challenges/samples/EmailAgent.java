package challenges.samples;

import java.util.LinkedList;
import java.util.List;

import flow.IAction;
import flow.IAgent;

public class EmailAgent implements IAgent {
	  private String[] values;

	  public EmailAgent(String... values) {
	    this.values = values;
	  }

	  public List<IAction> act() {
	    List<IAction> flow = new LinkedList<IAction>();
	    for (String value : values) {
	      flow.add(new EmailAction(value));
	    }
	    return flow;
	  }
}
