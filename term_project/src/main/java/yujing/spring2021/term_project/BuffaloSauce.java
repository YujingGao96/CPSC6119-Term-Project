package yujing.spring2021.term_project;

public class BuffaloSauce extends MenuItemDecorator{
    public BuffaloSauce(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Buffalo Sauce";
    }

    @Override
    public double cost() {
        return menuItem.cost() + 0.05;
    }
}
