package org.telran;

import org.telran.entity.ImageDescriptor;
import org.telran.service.FileService;
import org.telran.service.ImageDescriptorService;

import java.util.List;

public class ImageProcessor {
    public static void main(String[] args) {
        String fileName = args[0];

        FileService fileService = new FileService();
        ImageDescriptorService imageDescriptorService = new ImageDescriptorService(fileService);

        List<ImageDescriptor> imageDescriptors = imageDescriptorService.geteImageDescriptors(fileName);

        imageDescriptors.stream().forEach(s -> System.out.println(s));

    }
}
