package org.telran.service;

import org.telran.entity.ImageDescriptor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImageDescriptorService {

    private FileService fileService;


    public ImageDescriptorService(FileService fileService) {
        this.fileService = fileService;
    }

    public List<ImageDescriptor> geteImageDescriptors(String fileName) {

        //java collection framework
//        List<ImageDescriptor> imageDescriptors = new ArrayList<>();
//
//        List<String> strings = fileService.loadStringsFromFile(fileName);
//
//        for(int i = 0; i<strings.size();i++) {
//            String s = strings.get(i);
//            ImageDescriptor id = stringToImageDescriptor(s);
//            imageDescriptors.add(id);
//        }

   //     return imageDescriptors;

        return fileService.loadStringsFromFile(fileName).stream()
                .map(s -> stringToImageDescriptor(s))
                .collect(Collectors.toList());
    }

    private static ImageDescriptor stringToImageDescriptor(String string) {
        String[] split = string.split(";");
        return new ImageDescriptor(split[0], split[1]);
    }
}
