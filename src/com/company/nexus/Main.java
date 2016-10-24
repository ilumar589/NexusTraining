package com.company.nexus;

import com.company.nexus.simHttp.controller.DelegationController;

public class Main {

    public static void main(String[] args) {
        DelegationController controller = new DelegationController();

        // operations
        controller.save();
        controller.get();

    }
}
