package yujing.spring2021.term_project;

public class Lettuce extends MenuItemDecorator {
    public Lettuce(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Lettuce";
    }

    @Override
    public double cost() {
        return menuItem.cost() + 0.20;
    }
}
