package challenges.samples;

import flow.IEvent;

public class EmailEvent implements IEvent {
	  private String value;

	  public EmailEvent(String value) {
	    this.value = value;
	  }

	  public String trigger() {
	    return "MSG:" + value;
	  }
}
