package com.company.nexus.simHttp.service.impl;

import com.company.nexus.simHttp.service.IChildService;
import com.company.nexus.util.FactoryCreation;

/**
 * Created by WolframAlpha on 23/10/2016.
 */
public class ChildService implements IChildService,FactoryCreation<ChildService>{

    private static ChildService service = new ChildService();

    private ChildService(){}

    @Override
    public void printServiceLocation(){
        System.out.println("I'm in child service");
    }

    public static ChildService getInstance(Boolean singleton) {
        if (service != null && singleton) return service;
        return new ChildService();
    }
}
