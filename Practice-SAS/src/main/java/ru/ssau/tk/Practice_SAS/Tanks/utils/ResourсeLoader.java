package ru.ssau.tk.Practice_SAS.Tanks.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ResourсeLoader {
    public static final String PATH = "src/main/java/ru/ssau/tk/Practice_SAS/Tanks/res/";

    public static BufferedImage loadImage(String fileName){

        BufferedImage image = null;

        try{
            image = ImageIO.read( new File(PATH + fileName));
        }catch (IOException e){
            e.printStackTrace();
        }



        return  image;
    }
}
