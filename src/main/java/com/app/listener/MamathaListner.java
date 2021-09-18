package com.app.listener;

import org.springframework.context.event.EventListener;
//import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.app.event.MansuMamathaEvent;

@Component
public class MamathaListner  /*implements ApplicationListener<MansuMamathaEvent>*/
{ public void listenEvent(String eventName)
	{
		System.out.println("Inside Mamatha Listener class");
		System.out.println("Mamatha is listening event "+eventName);
	}

	@EventListener
	public void onEvent(MansuMamathaEvent event) {
		listenEvent(event.getEventName());
		
	}
}
