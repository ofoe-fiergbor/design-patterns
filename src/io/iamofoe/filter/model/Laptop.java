package io.iamofoe.filter.model;

public class Laptop {
    private final int id;
    private final String hardDisk;
    private final String processor;
    private final String ram;
    private final String operatingSystem;

    public Laptop(int id, String hardDisk, String processor, String ram, String operatingSystem) {
        this.id = id;
        this.hardDisk = hardDisk;
        this.processor = processor;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    public int getId() {
        return id;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", hardDisk='" + hardDisk + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
