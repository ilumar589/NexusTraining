package com.company.nexus.simHttp.tests;

import com.company.nexus.simHttp.controller.DelegationController;
import org.junit.Test;

/**
 * Created by eduardparvu on 24/10/16.
 */
public class TestClient {

    private DelegationController delegationController;

    public TestClient(){
        delegationController = new DelegationController();
    }

    @Test
    public void someTestMethod(){
        delegationController.save();
    }
}
