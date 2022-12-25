package org.aiokleo.devices;

public class Device {
    private int Lid;
    private String deviceName;

    public int getLid() {
        return Lid;
    }

    public void setLid(int lid) {
        Lid = lid;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Device(int lid,
                  String deviceName) {
        Lid = lid;
        this.deviceName = deviceName;
    }

    public Device() {
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "Lid=" + Lid +
                ", deviceName='" + deviceName + '\'' +
                '}';
    }
}
