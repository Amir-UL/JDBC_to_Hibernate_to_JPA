package org.aiokleo.devices;

public class Phones {
    private int Pid;
    private String phoneName;

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Phones(int pid, String phoneName) {
        Pid = pid;
        this.phoneName = phoneName;
    }

    public Phones() {
    }

    @Override
    public String toString() {
        return "Phones{" +
                "Pid=" + Pid +
                ", phoneName='" + phoneName + '\'' +
                '}';
    }
}
