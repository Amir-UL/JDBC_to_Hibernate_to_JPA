package org.aiokleo.devices;

public class Laptop {
    private int Lid;
    private String laptopName;

    public int getLid() {
        return Lid;
    }

    public void setLid(int lid) {
        Lid = lid;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public Laptop(int lid, String laptopName) {
        Lid = lid;
        this.laptopName = laptopName;
    }

    public Laptop() {
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Lid=" + Lid +
                ", laptopName='" + laptopName + '\'' +
                '}';
    }
}
