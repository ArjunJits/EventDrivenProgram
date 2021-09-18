package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.app.listener.KeerthanaListner;
import com.app.listener.MallikarjunListener;
import com.app.listener.MamathaListner;

@Configuration
@ComponentScan(basePackages = {"com.app.event"})
@Import({MallikarjunListener.class,KeerthanaListner.class,MamathaListner.class})
public class JavaConfig {

}
