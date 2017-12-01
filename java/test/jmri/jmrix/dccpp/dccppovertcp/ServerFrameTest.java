package jmri.jmrix.dccpp.dccppovertcp;

import java.awt.GraphicsEnvironment;
import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for ServerFrame class.
 *
 * @author Paul Bender Copyright (C) 2016
 */
public class ServerFrameTest {

    @Test
    public void getInstanceTest() {
        Assume.assumeFalse(GraphicsEnvironment.isHeadless());
        // ServerFrame is provided by InstanceManagerAutoInitialize
        ServerFrame f = jmri.InstanceManager.getDefault(ServerFrame.class);
        Assert.assertNotNull("ServerFrame getInstance", f);
        f.dispose();
    }

    @Before
    public void setUp() {
        JUnitUtil.setUp();
        jmri.util.JUnitUtil.initDefaultUserMessagePreferences();
        Server.getInstance();
    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
    }

}
