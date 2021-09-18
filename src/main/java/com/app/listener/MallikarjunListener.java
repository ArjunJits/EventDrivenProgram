package com.app.listener;

//import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


import com.app.event.MansuMamathaEvent;
import com.app.event.SimaAwardEvent;

@Component
public class MallikarjunListener/* implements ApplicationListener<MansuMamathaEvent> */ {
	

	public void listenEvent(String eventName)
	{
		System.out.println("Inside Mallikarjun Listener class");
		System.out.println("Mallikarjun is listening event "+eventName);
	}

	@EventListener
	public void onEvent(MansuMamathaEvent event) {
		listenEvent(event.getEventName());
		
	}
	@EventListener
	public void onEvent2(SimaAwardEvent event)
	{
		listenEvent(event.getEventName());
	}
}
