package yujing.spring2021.term_project;

public class BlackOlives extends MenuItemDecorator {
    public BlackOlives(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Black Olives";
    }

    @Override
    public double cost() {
        return menuItem.cost() + 0.20;
    }
}
