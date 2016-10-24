package com.company.nexus.simHttp.service.impl;

import com.company.nexus.simHttp.model.Child;
import com.company.nexus.simHttp.service.IChildService;
import com.company.nexus.util.AppendingObjectOutputStream;
import com.company.nexus.util.FactoryCreation;
import com.company.nexus.util.FileOperations;

import java.io.*;
import java.util.StringTokenizer;

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

    public void save(){
        Child child = new Child.ChildBuilder(1L,"Child1")
                .parentName("Child 1 parent")
                .build();

        BufferedWriter childOutput = FileOperations.getObjectOutputStreamForChild(true);
        try {
            writeChildData(childOutput,child);
        }catch (Exception e){

        }

    }

    private void writeChildData(BufferedWriter stream,Child child){
        try {
            stream.write(child.toString());
            stream.newLine();
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void get(){
        BufferedReader childInput = FileOperations.getObjectInputStreamForChild();
        childInput.lines().forEach(line -> {
            StringTokenizer stringTokenizer = new StringTokenizer(line,"#");
            while (stringTokenizer.hasMoreElements()){
                System.out.println(stringTokenizer.nextElement().toString());
            }

        });
    }



    public static ChildService getInstance(Boolean singleton) {
        if (service != null && singleton) return service;
        return new ChildService();
    }
}
