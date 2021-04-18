package yujing.spring2021.term_project;

public class HouseSandwichSauce extends MenuItemDecorator {
    public HouseSandwichSauce(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "House Sandwich Sauce";
    }

    @Override
    public double cost() {
        return menuItem.cost() + 0.05;
    }
}
