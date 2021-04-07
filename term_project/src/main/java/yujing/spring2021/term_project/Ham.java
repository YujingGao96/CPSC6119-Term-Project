package yujing.spring2021.term_project;

public class Ham extends MenuItemDecorator{
    public Ham(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.description = "Ham";
    }

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

    @Override
    public double cost() {
        return menuItem.cost() + 3.45;
    }
}
