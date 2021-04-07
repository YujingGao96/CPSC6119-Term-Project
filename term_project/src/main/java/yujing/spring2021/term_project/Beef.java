package yujing.spring2021.term_project;

public class Beef extends MenuItemDecorator{
    public Beef(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Beef";
    }

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

    @Override
    public double cost() {
        return menuItem.cost() + 3.55;
    }
}
