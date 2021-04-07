package yujing.spring2021.term_project;

public class Turkey extends MenuItemDecorator{
    public Turkey(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Turkey";
    }

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

    @Override
    public double cost() {
        return menuItem.cost() + 3.15;
    }
}
