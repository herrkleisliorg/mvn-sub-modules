package ch.mycompany.test.gui;

public class MyTag {
    private final String id;
    private final String displayId;

    public MyTag(String id, String displayId) {
        this.id = id;
        this.displayId = displayId;
    }

    @SuppressWarnings("UnusedDeclaration")
    public String getId() {
        return id;
    }

    @SuppressWarnings("UnusedDeclaration")
    public String getDisplayId() {
        int i = 42;
        return displayId;
    }
}
