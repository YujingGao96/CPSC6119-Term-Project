package yujing.spring2021.term_project;

public class NineGrainWheatBread extends Bread {
    public NineGrainWheatBread() {
        this.description = "9-Grain Wheat Bread";
    }

    public NineGrainWheatBread(ToastedBehavior toastedBehavior) {
        this();
        this.toastedBehavior = toastedBehavior;
    }

    @Override
    public String getDescription() {
        return toastedBehavior.toast() + " " + super.getDescription();
    }

    @Override
    public double cost() {
        return 4.45;
    }
}
