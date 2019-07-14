package com.forezp.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualService{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry ,"+name;
    }
}
