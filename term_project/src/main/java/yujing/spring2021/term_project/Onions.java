package yujing.spring2021.term_project;

public class Onions extends MenuItemDecorator{
    public Onions(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Onions";
    }

    @Override
    public double cost() {
        return menuItem.cost() + 0.20;
    }
}
