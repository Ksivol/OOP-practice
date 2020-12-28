package ru.ssau.tk.Practice_SAS.Tanks.graphics;

import ru.ssau.tk.Practice_SAS.Tanks.utils.ResourсeLoader;

import java.awt.image.BufferedImage;

public class TextureAtlas {
    BufferedImage image;

    public TextureAtlas(String imageName){
        image = ResourсeLoader.loadImage(imageName);
    }

    public BufferedImage cut(int x, int y, int w, int h){
        return image.getSubimage(x,y,w,h);
    }

}
