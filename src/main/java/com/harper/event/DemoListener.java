package com.harper.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by hbowang on 7/29/16.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("-----------i have received msg:"+msg);
    }
}
