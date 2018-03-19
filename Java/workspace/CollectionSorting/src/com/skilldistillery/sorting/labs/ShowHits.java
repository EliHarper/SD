package com.skilldistillery.sorting.labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ShowHits {

    public static void main(String[] args) {
        run();

    }

    public static void run() {
        readFile();

    }
    
    public static void readFile() {
        File accessLog = new File("." + File.separator + "access_log");
        try {
            FileReader fr = new FileReader(accessLog);
            BufferedReader br = new BufferedReader(fr);
            String line;
            Map<String, Integer> visitorHits = new TreeMap<>();
            while ((line = br.readLine()) != null) {
                String[] userRecord = line.split(" - - ");
                String userID = userRecord[0];
                //if already visited, increment visit count, else start count
                if (visitorHits.containsKey(userID)) {
                    Integer count = visitorHits.get(userID);
                    count++;//unbox Integer to int, increment int, rebox to new Integer object
                    visitorHits.put(userID, count);
                }
                else {
                    visitorHits.put(userID, 1);
                }
            }
            br.close();
            
            Set<String> keys = visitorHits.keySet();
            for(String key : keys) {
                System.out.println(key + ": " + visitorHits.get(key));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Invalid filename: " + e.getMessage());
            return;
        } catch (IOException e) {
            System.err.println("Problem while reading " + accessLog + e.getMessage());
            return;
        }
    }
    
    

}