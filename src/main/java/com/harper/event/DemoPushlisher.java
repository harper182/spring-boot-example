package com.harper.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by hbowang on 7/29/16.
 */
@Component
public class DemoPushlisher {
    @Autowired
    private ApplicationContext context;
    public void publish(String msg){
        context.publishEvent(new DemoEvent(this,msg));
    }
}
