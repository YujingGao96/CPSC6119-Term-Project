package yujing.spring2021.term_project;

public abstract class Bread extends MenuItem {
    ToastedBehavior toastedBehavior;
    String description;

    public Bread() {
    }

    public abstract double cost();

    public void setToastedBehavior(ToastedBehavior toastedBehavior) {
        this.toastedBehavior = toastedBehavior;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
