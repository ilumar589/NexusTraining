package com.company.nexus.util;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by eduardparvu on 24/10/16.
 */
public class AppendingObjectOutputStream extends ObjectOutputStream {


    public AppendingObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    protected AppendingObjectOutputStream() throws IOException, SecurityException {
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // do not write a header, but reset:
        // this line added after another question
        // showed a problem with the original
        reset();
    }
}
