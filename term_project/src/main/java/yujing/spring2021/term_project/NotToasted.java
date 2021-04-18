package yujing.spring2021.term_project;

public class NotToasted implements ToastedBehavior {
    private final String behaviorName;

    public NotToasted() {
        this.behaviorName = "Not Toasted";
    }

    @Override
    public String toast() {
        return this.behaviorName;
    }
}
