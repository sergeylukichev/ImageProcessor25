package org.telran.service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FileService {

    //private static String FILE_NAME = "test_path.txt";

    public FileService() {

    }

    public List<String> loadStringsFromFile(String fileName) {

        try{
            return Files.lines(Paths.get(fileName)).collect(Collectors.toList());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return Collections.EMPTY_LIST;
        }
    }

}
