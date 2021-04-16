package yujing.spring2021.term_project;

public class Turkey extends MenuItemDecorator{
    public Turkey(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Turkey";
    }

    @Override
    public double cost() {
        return menuItem.cost() + 3.15;
    }
}
