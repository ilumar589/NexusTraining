package com.company.nexus.simHttp.service.impl;

import com.company.nexus.simHttp.service.IPlayRoomService;
import com.company.nexus.util.FactoryCreation;

/**
 * Created by WolframAlpha on 23/10/2016.
 */
public class PlayRoomService implements IPlayRoomService,FactoryCreation<PlayRoomService> {

    private static PlayRoomService service = new PlayRoomService();

    private PlayRoomService(){}

    @Override
    public void printServiceLocation() {
        System.out.println("I'm in play room service");
    }

    public static PlayRoomService getInstance(Boolean singleton) {
        if (service != null && singleton) return service;
        return new PlayRoomService();
    }
}
