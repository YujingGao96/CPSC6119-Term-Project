package yujing.spring2021.term_project;

public class ItalianBread extends Bread{

    public ItalianBread() {
        this.toastedBehavior = null;
        this.description = "Italian Bread";
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
