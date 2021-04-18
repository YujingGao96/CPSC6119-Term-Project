package yujing.spring2021.term_project;

import java.io.IOException;

public interface ControllerInteface {
    void setBread(String breadType);

    void setToasting(String toasting);

    void addAddOns(String addons);

    void startOver();

    void confirmOrder() throws IOException;
}
