package yujing.spring2021.term_project;

public class ItalianBread extends Bread{

    public ItalianBread() {
        this.description = "Italian Bread";
    }

    public ItalianBread(ToastedBehavior toastedBehavior) {
        this();
        this.toastedBehavior = toastedBehavior;
    }

    @Override
    public String getDescription() {
        return toastedBehavior.toast() + " " + super.getDescription();
    }

    @Override
    public double cost() {
        return 4.15;
    }
}
