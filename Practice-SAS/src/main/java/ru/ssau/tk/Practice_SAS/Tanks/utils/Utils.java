package ru.ssau.tk.Practice_SAS.Tanks.utils;

import java.awt.image.BufferedImage;

public class Utils {
    public static BufferedImage resize (BufferedImage image, int wight, int height){

        BufferedImage newImage = new BufferedImage(wight,height,BufferedImage.TYPE_INT_ARGB);
        newImage.getGraphics().drawImage(image,0,0,wight,height,null);

        return newImage;
    }
}
