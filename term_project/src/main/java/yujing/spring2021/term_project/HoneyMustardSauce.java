package yujing.spring2021.term_project;

public class HoneyMustardSauce extends MenuItemDecorator{
    public HoneyMustardSauce(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Honey Mustard Sauce";
    }

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

    @Override
    public double cost() {
        return menuItem.cost() + 0.05;
    }
}
