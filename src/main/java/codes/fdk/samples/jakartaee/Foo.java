package codes.fdk.samples.jakartaee;

public class Foo {

    private final String id;
    private final String bar;

    public Foo(String id, String bar) {
        this.id = id;
        this.bar = bar;
    }

    public String getId() {
        return id;
    }

    public String getBar() {
        return bar;
    }

}