package yujing.spring2021.term_project;

public class GreenPepper extends MenuItemDecorator{
    public GreenPepper(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Green Pepper";
    }

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

    @Override
    public double cost() {
        return menuItem.cost() + 0.20;
    }
}
