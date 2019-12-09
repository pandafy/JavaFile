package com.company.practical5;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class DisplayImage extends Applet {

    private Image img;

    public void init() {

        try {

            File imgFile = new File("C:\\Users\\Tabassum Jahangir\\IdeaProjects\\JavaLab\\src\\com\\company\\practical5\\panda.jpg");
            img = ImageIO.read(imgFile);

        } catch (IOException e) {

            System.out.println("Cannot load image file!");

        }

    }

    public void paint(Graphics g) {

        g.drawImage(img, 30,30, this);

    }

}
