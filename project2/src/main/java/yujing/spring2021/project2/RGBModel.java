package yujing.spring2021.project2;

import java.awt.*;
import java.util.ArrayList;

public class RGBModel implements RGBModelInterface {
    SimpleColorFactory simpleColorFactory;
    ArrayList<RGBObserver> rgbObservers;
    int[] rgb;

    public RGBModel() {
        simpleColorFactory = new SimpleColorFactory();
        rgbObservers = new ArrayList<>();
        rgb = new int[3];
    }

    /**
     * This method will set the RGB to Black (0, 0, 0) when the program starts
     */
    @Override
    public void initialize() {
        setRGB(0, 0, 0);
    }

    /**
     * This method is the mutator for RGB values
     * @param r The value of red
     * @param g The value of green
     * @param b The value of blue
     */
    @Override
    public void setRGB(int r, int g, int b) {
        rgb[0] = r;
        rgb[1] = g;
        rgb[2] = b;
        notifyRGBObservers();
    }

    /**
     * This method is the accessor for RGB values
     * @return An array contains all the RGB values
     */
    @Override
    public int[] getRGB() {
        return rgb;
    }

    /**
     * This method will use the Simple Color Factory to produce the Color object based on rgb values
     * @return A Color object that represents the RGB color specified
     */
    @Override
    public Color getCurrentColor() {
        return simpleColorFactory.getColor(rgb);
    }

    /**
     * This method will use the Simple Color Factory to produce the Hex String representation based on rgb values
     * @return A Hex String that represents the RGB color specified
     */
    @Override
    public String getCurrentHex() {
        return simpleColorFactory.getHex(rgb);
    }

    /**
     * Register an observer to this subject
     * @param rGBObserver RGBObserver whoever wish to subscribe to this observable
     */
    @Override
    public void registerObserver(RGBObserver rGBObserver) {
        rgbObservers.add(rGBObserver);
    }

    /**
     * Remove an observer from this subject
     * @param rGBObserver RGBObserver whoever wish to be removed from subscription list
     */
    @Override
    public void removeObserver(RGBObserver rGBObserver) {
        rgbObservers.remove(rGBObserver);
    }

    /**
     * Notify all RGBObservers who subscribe to this subject
     */
    @Override
    public void notifyRGBObservers() {
        for (RGBObserver rgbObserver : rgbObservers) {
            rgbObserver.updateColor();
        }
    }

}
