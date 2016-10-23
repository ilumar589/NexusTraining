package com.company.nexus.simHttp.controller;

import com.company.nexus.simHttp.service.impl.ChildService;
import com.company.nexus.simHttp.service.impl.PlayRoomService;
import com.company.nexus.util.ReflectionFactory;

/**
 * Created by WolframAlpha on 23/10/2016.
 */
public class DelegationController{

    private ChildService childService;

    private PlayRoomService playRoomService;

    public DelegationController(){}

    public void printChildService(){
        childService.printServiceLocation();
    }

    public void printPlayRoomService(){
        playRoomService.printServiceLocation();
    }

    public void setChildService(Boolean singleton){
        ReflectionFactory<ChildService> factory = new ReflectionFactory<>();
        factory.setClass(ChildService.class);
        this.childService = factory.construct(singleton);
    }

    public void setPlayRoomService(Boolean singleton){
        ReflectionFactory<PlayRoomService> factory = new ReflectionFactory<>();
        factory.setClass(PlayRoomService.class);
        this.playRoomService = factory.construct(singleton);
    }
}
