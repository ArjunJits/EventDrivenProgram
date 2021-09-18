package com.app.event;

//import org.springframework.context.ApplicationEvent;

import lombok.Getter;
@Getter
public class MansuMamathaEvent /* extends ApplicationEvent */{
   
//private static final long serialVersionUID = -6016096787132973111L;
private String eventName;

/*
 * public MansuMamathaEvent(Object source) { super(source); }
 */
/*
 * public MansuMamathaEvent(Object source, String eventName) { super(source);
 * this.eventName = eventName; }
 */
	public MansuMamathaEvent(String eventName) {
		this.eventName =eventName;
	}
	

}
