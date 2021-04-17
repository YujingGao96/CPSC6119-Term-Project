package yujing.spring2021.term_project;

import java.io.IOException;

public interface OrderingModelInterface {
    void init();
    void setBread(String bread);
    void setToastingBehavior(String toastingBehavior);
    void addAddOn(String addOn);
    MenuItem getCurrentMenuItem();
    void placeOrder();
    void addObserver(WorkingMenuItemObserver o);
    void removeObserver(WorkingMenuItemObserver o);
    void notifyObserver();
}
