package yujing.spring2021.term_project;

public class Chicken extends MenuItemDecorator{
    public Chicken(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Chicken";
    }

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

    @Override
    public double cost() {
        return menuItem.cost() + 3.25;
    }
}
