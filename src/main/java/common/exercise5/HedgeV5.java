package common.exercise5;

import common.Direction;
import common.ExerciseFail;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import static common.Direction.*;


public class HedgeV5 {

    public static final int COLOR = new Color(255, 0, 0).getRGB();
    private int xPos = 0;
    private int yPos = 0;
    private Direction direction = RIGHT;
    private final int side;

    private final BufferedImage image;
    private final Graphics2D graphics;
    private final AffineTransform zoom;
    private final JLabel label;
    private final JFrame frame;


    public HedgeV5(int side) {
        int displayZoom = 20;
        int border = 50;
        this.side = side;
        image = new BufferedImage(side, side, BufferedImage.TYPE_INT_RGB);
        BufferedImage displayImage = new BufferedImage(side * displayZoom, side * displayZoom, BufferedImage.TYPE_INT_RGB);
        graphics = displayImage.createGraphics();
        zoom = new AffineTransform(displayZoom, 0, 0, displayZoom, 0, 0);
        ImageIcon icon = new ImageIcon(displayImage);
        frame = new JFrame();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        frame.setSize(displayImage.getWidth(null) + border, displayImage.getHeight(null) + border);
        label = new JLabel();
        label.setIcon(icon);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void moveForward() throws ExerciseFail {
        switch (direction) {
            case LEFT:
                xPos--;
                break;
            case RIGHT:
                xPos++;
                break;
            case UP:
                yPos--;
                break;
            case DOWN:
                yPos++;
                break;
        }
        checkBounds();
    }

    private void checkBounds() throws ExerciseFail {
        if (xPos < 0 || xPos >= side || yPos < 0 || yPos >= side) {
            throw new ExerciseFail("Hedge went outside the painting.");
        }
    }

    public void turnRight() {
        switch (direction) {
            case LEFT:
                this.direction = UP;
                break;
            case RIGHT:
                this.direction = DOWN;
                break;
            case UP:
                this.direction = RIGHT;
                break;
            case DOWN:
                this.direction = LEFT;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case LEFT:
                this.direction = DOWN;
                break;
            case RIGHT:
                this.direction = UP;
                break;
            case UP:
                this.direction = LEFT;
                break;
            case DOWN:
                this.direction = RIGHT;
                break;
        }
    }

    public void paint() {
        image.setRGB(xPos, yPos, COLOR);
        graphics.drawImage(image, zoom, label);
        frame.repaint();
    }

}
