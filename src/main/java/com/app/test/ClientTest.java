package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.app.config.JavaConfig;
import com.app.event.EtvEvent;
import com.app.event.GeminiEvent;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext context=
				new AnnotationConfigApplicationContext(JavaConfig.class);
       EtvEvent event=   context.getBean(EtvEvent.class);
       event.EventName("Manasu Mamatha");
    
       GeminiEvent geminiEvent = context.getBean(GeminiEvent.class);
       geminiEvent.geminiEvent("Sima Awards 2021");
       
       ((AbstractApplicationContext) context).close();
	}

}
