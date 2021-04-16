package yujing.spring2021.project2;

import java.awt.*;

public class SimpleColorFactory {
    /**
     * Get the Color object of the RGB values
     * @param rgb RGB values array
     * @return Color object representation
     */
    public Color getColor(int[] rgb) {
        if (validRGB(rgb)) {
            return new Color(rgb[0], rgb[1], rgb[2]);
        }
        return null;
    }

    /**
     * Get the Hex representation of the RGB values
     * @param rgb RGB values array
     * @return Hex representation
     */
    public String getHex(int[] rgb) {
        if (validRGB(rgb)) {
            return "HEX: " + String.format("%02X%02X%02X", rgb[0], rgb[1], rgb[2]);
        }
        return "RGB values out of range";
    }

    /**
     * Check if the RGB values are within the range
     *
     * @param rgb An integer array contains the values of R(ed), G(reen), B(lue)
     * @return Whether or not the RGB is valid
     */
    public static boolean validRGB(int[] rgb) {
        for (int value : rgb) {
            if (value < 0 || value > 255) return false;
        }
        return true;
    }
}
