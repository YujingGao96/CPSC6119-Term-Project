package yujing.spring2021.term_project;

public class SaltAndPepper extends MenuItemDecorator{
    public SaltAndPepper(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Salt and Pepper";
    }

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

    @Override
    public double cost() {
        return menuItem.cost() + 0;
    }
}
