package com.company.nexus;

import com.company.nexus.simHttp.controller.DelegationController;

public class Main {

    public static void main(String[] args) {
        DelegationController controller = new DelegationController();
        controller.setChildService(true); controller.setPlayRoomService(true);


        // operations
        controller.save();
        controller.get();

    }
}
