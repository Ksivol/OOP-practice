package ru.ssau.tk.Practice_SAS.Tasks.Point;

import ru.ssau.tk.Practice_SAS.Tasks.Generator.Resettable;

public class NamedPoint extends Point implements Resettable {
    private String name;

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    public NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    public void reset() {
        name = "Absent";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
