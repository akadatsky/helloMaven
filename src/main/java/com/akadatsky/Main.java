package com.akadatsky;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");

        Gson gson = new Gson();

        Group group = new Group("java");
        group.addPerson(new Person("Alex", 22));
        group.addPerson(new Person("Ben", 33));

        String json = gson.toJson(group);

        writeToFile(json, "test.txt");


    }

    private static void writeToFile(String string, String fileName) {
        try {
            FileUtils.writeStringToFile(new File(fileName), string, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
