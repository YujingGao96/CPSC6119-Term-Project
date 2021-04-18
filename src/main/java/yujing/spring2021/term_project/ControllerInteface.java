package yujing.spring2021.term_project;

import java.io.IOException;

public interface ControllerInteface {
    void setBread(String breadType);

    void setToasting(String toasting);

    void addAddOn(String addon);

    void startOver();

    void confirmOrder() throws IOException;
}
