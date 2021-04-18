package yujing.spring2021.term_project;

public class SaltAndPepper extends MenuItemDecorator {
    public SaltAndPepper(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Salt and Pepper";
    }

    @Override
    public double cost() {
        return menuItem.cost() + 0;
    }
}
