package com.app.event;

import lombok.Getter;

@Getter
public class SimaAwardEvent {
private String eventName;
	
	public SimaAwardEvent(String eventName) {
		this.eventName=eventName;
	}
}
