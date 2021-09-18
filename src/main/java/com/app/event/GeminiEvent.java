package com.app.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class GeminiEvent {
    @Autowired
	ApplicationEventPublisher applicationEventPublisher;
    
    public void geminiEvent(String eventName)
    {
    	applicationEventPublisher.publishEvent(new SimaAwardEvent(eventName));
    }
	
}
