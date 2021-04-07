package yujing.spring2021.term_project;

public class Tuna extends MenuItemDecorator{
    public Tuna(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Tuna";
    }

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

    @Override
    public double cost() {
        return menuItem.cost() + 3.85;
    }
}
