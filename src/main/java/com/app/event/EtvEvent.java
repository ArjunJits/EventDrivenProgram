package com.app.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*import com.app.listener.KeerthanaListner;
import com.app.listener.MallikarjunListener;
import com.app.listener.MamathaListner;

import lombok.Getter;
*/
@Component

public class EtvEvent {



/*
 * @Autowired private MallikarjunListener mallikarjunListener;
 * 
 * @Autowired private KeerthanaListner keerthanaListner;
 * 
 * @Autowired private MamathaListner mamathaListner;
 */
@Autowired
ApplicationEventPublisher applicationEventPublisher;

public void EventName(String eventName)
{
 	System.out.println("Etv Event program published: " +eventName);
	/*
	 * mallikarjunListener.listenEvent(eventName);
	 * keerthanaListner.listenEvent(eventName);
	 * mamathaListner.listenEvent(eventName);
	 */	
 	applicationEventPublisher.publishEvent(new MansuMamathaEvent(eventName));
}

}
