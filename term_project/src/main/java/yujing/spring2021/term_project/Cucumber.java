package yujing.spring2021.term_project;

public class Cucumber extends MenuItemDecorator{

    public Cucumber(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Cucumber";
    }

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

    @Override
    public double cost() {
        return menuItem.cost() + 0.20;
    }
}
