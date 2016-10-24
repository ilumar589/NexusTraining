package com.company.nexus.util;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by WolframAlpha on 23/10/2016.
 */
public class FileOperations {

    private final static String MODEL_STORAGE = "/src/com/company/nexus/simHttp/modelStorage";
    private final static String CHILD_MODEL = "/child.model";
    private final static String PLAY_ROOM_MODEL = "/playRoom.model";

    public static String getNewLineSeparator(){
        return System.lineSeparator();
    }

    public static Path getChildStorage(){
        return Paths.get(getStorageDirectory().toString(),CHILD_MODEL);
    }

    public static Path getPlayRoomStorage(){
        return Paths.get(getStorageDirectory().toString(),PLAY_ROOM_MODEL);
    }

    public static Path getStorageDirectory(){
        return Paths.get(getCurrentDirectory().toString(),MODEL_STORAGE);
    }

    public static Path getCurrentDirectory(){
        return Paths.get(".").normalize().toAbsolutePath();
    }

    public static BufferedReader getObjectInputStreamForChild(){
        try {
            return new BufferedReader(new FileReader(getChildStorage().toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static BufferedWriter getObjectOutputStreamForChild(Boolean append){
        try {
            return new BufferedWriter(new FileWriter(getChildStorage().toString(),append));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
