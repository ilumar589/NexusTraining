package com.company.nexus.util;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by WolframAlpha on 23/10/2016.
 */
public interface InputProcessor {
    void executeProcess(InputStream input) throws IOException;
}
