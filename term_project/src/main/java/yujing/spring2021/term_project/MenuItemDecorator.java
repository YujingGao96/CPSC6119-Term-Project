package yujing.spring2021.term_project;

public abstract class MenuItemDecorator extends MenuItem {
    MenuItem menuItem;

    @Override
    public String getDescription() {
        return menuItem.getDescription() + "\n\t- " + this.description;
    }

}
