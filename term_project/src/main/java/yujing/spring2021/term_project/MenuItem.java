package yujing.spring2021.term_project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class MenuItem {
    String description;

    public abstract String getDescription();

    public abstract double cost();

    public String getTotalPrice() {
        return "Total price is: $" + Utility.round(cost(), 2);
    }
}
