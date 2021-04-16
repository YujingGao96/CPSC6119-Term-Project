package yujing.spring2021.project2;

import java.awt.*;

public interface RGBModelInterface {
    void initialize();
    void setRGB(int r, int g, int b);
    int[] getRGB();
    Color getCurrentColor();
    String getCurrentHex();
    void registerObserver(RGBObserver rGBObserver);
    void removeObserver(RGBObserver rGBObserver);
    void notifyRGBObservers();
}
