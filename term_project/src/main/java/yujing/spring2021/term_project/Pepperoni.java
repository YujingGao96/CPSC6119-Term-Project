package yujing.spring2021.term_project;

public class Pepperoni extends MenuItemDecorator {
    public Pepperoni(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Pepperoni";
    }

    @Override
    public double cost() {
        return menuItem.cost() + 3.55;
    }
}
