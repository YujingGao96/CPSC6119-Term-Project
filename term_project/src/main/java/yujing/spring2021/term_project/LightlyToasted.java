package yujing.spring2021.term_project;

public class LightlyToasted implements ToastedBehavior {
    private final String behaviorName;

    public LightlyToasted() {
        this.behaviorName = "Lightly Toasted";
    }

    @Override
    public String toast() {
        return this.behaviorName;
    }
}
