package yujing.spring2021.term_project;

public class HerbsAndCheeseBread extends Bread {
    public HerbsAndCheeseBread() {
        this.description = "Herbs and Cheese Bread";
    }

    public HerbsAndCheeseBread(ToastedBehavior toastedBehavior) {
        this();
        this.toastedBehavior = toastedBehavior;
    }

    @Override
    public double cost() {
        return 4.75;
    }
}
