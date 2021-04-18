package yujing.spring2021.term_project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utility {
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static String formatDescription(String description) {
        return "<html>" + description.replace("\n", "<br/>").replace("\t", "&nbsp;&nbsp;&nbsp;&nbsp;") + "</html>";
    }

}
