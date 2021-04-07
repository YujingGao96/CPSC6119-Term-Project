package yujing.spring2021.term_project;

public class HerbsAndCheeseBread extends Bread {
    public HerbsAndCheeseBread() {
        this.toastedBehavior = null;
        this.description = "Herbs and Cheese Bread";
    }

    @Override
    public String getDescription() {
        return toastedBehavior.toast() + " " + super.getDescription();
    }

    @Override
    public double cost() {
        return 4.75;
    }
}
