package com.harper.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hbowang on 7/29/16.
 */
public class EventMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPushlisher demoPushlisher = context.getBean(DemoPushlisher.class);
        demoPushlisher.publish("hello application context");
        context.close();
    }
}
