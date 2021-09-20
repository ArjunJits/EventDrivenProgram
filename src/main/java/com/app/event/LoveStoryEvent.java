package com.app.event;

import lombok.Getter;

@Getter
public class LoveStoryEvent {
private String eventName;

public LoveStoryEvent(String eventName) {
	this.eventName=eventName;
}

}
