package yujing.spring2021.term_project;

public class BuffaloSauce extends MenuItemDecorator{
    public BuffaloSauce(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Buffalo Sauce";
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
