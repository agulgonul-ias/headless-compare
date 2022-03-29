package advan;

import java.io.*;
import java.util.*;

public class CompareTheLogs {

    //logs that received from Mac
    static String test = "CypressPropertyNames.txt";
    static String test2 = "ManualPropertyNames.txt";

    public static void main(String[] args) throws IOException {

        File file1Logs = new File(test);
        BufferedReader file1LogsBuffered = new BufferedReader(new FileReader(file1Logs));

        String[] file1LogsInArray = file1LogsBuffered.readLine().split(",");

        File file2Logs = new File(test2);
        BufferedReader file2LogsBuffered = new BufferedReader(new FileReader(file2Logs));

        String[] file2LogsInArray = file2LogsBuffered.readLine().split(",");

        List<String> file1LogsListed = Arrays.asList(file1LogsInArray);

        System.out.println("file1LogsListed = " + file1LogsListed);
        List<String> file2LogsListed = Arrays.asList(file2LogsInArray);

        System.out.println("file2LogsListed = " + file2LogsListed);
        Set<String> setOfFile1Logs = new HashSet<>(file1LogsListed);
        setOfFile1Logs.removeAll(file2LogsListed);

        Set<String> setOfFile2Logs = new HashSet<>(file2LogsListed);
        setOfFile2Logs.removeAll(file1LogsListed);

        System.out.println("Unique SetOfFile2Logs = " + setOfFile2Logs);
        System.out.println("Unique SetOfFile1Logs = " + setOfFile1Logs);
        System.out.println("setOfFile1Logs.size() = " + setOfFile1Logs.size());
        System.out.println("setOfFile2Logs.size() = " + setOfFile2Logs.size());

    }
}
