package yujing.spring2021.term_project;

import java.io.IOException;

public class OrderingController implements ControllerInteface {
    OrderingModelInterface model;
    OrderingView view;

    public OrderingController(OrderingModelInterface model) {
        this.model = model;
        view = new OrderingView(model, this);
        view.createView();
        model.init();
    }

    @Override
    public void setBread(String breadType) {
        model.setBread(breadType);
    }

    @Override
    public void setToasting(String toasting) {
        model.setToastingBehavior(toasting);
    }

    @Override
    public void addAddOns(String addons) {
        model.addAddOn(addons);
    }

    @Override
    public void startOver() {
        model.init();
    }

    @Override
    public void confirmOrder() {
        model.placeOrder();
    }
}
