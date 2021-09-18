package com.app.listener;

//import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.app.event.MansuMamathaEvent;

@Component
public class KeerthanaListner /*implements ApplicationListener<MansuMamathaEvent> */
{
	public void listenEvent(String eventName)
	{
		System.out.println("Inside Keerthana Listener class");
		System.out.println("Keerthana is listening event "+eventName);
	}
    @EventListener
	public void onApplicationEvent(MansuMamathaEvent event) {
		listenEvent(event.getEventName());
		
	}

}
