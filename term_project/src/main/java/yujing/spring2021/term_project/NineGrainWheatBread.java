package yujing.spring2021.term_project;

public class NineGrainWheatBread extends Bread {
    public NineGrainWheatBread() {
        this.toastedBehavior = null;
        this.description = "9-Grain Wheat Bread";
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
