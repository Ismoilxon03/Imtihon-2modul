package model;

public class Branches {
    private String name;
    private String location;

    public Branches() {
    }

    public Branches(String name, String location) {
        this();
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Branches{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
