package yujing.spring2021.term_project;

public class BarbecueSauce extends MenuItemDecorator{
    public BarbecueSauce(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Barbecue Sauce";
    }

    @Override
    public double cost() {
        return menuItem.cost() + 0.05;
    }
}
