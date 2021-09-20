package com.app.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AdityaMusicEvent {
@Autowired
ApplicationEventPublisher applicationEventPublisher;

public void listenPromo(String eventName) {
	applicationEventPublisher.publishEvent(new LoveStoryEvent(eventName));
}

	
}
