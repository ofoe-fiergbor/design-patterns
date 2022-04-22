package io.iamofoe.filter;

import io.iamofoe.filter.model.Laptop;

import java.util.Arrays;
import java.util.List;

public class LaptopFactory {
    public static List<Laptop> manufactureInBulk() {
        return Arrays.asList(
                new Laptop(100, "250GB", "M1", "16GB", "MAC"),
                new Laptop(101, "250GB", "M1", "8GB", "MAC"),
                new Laptop(102, "250GB", "I7", "8GB", "MAC"),
                new Laptop(103, "500GB", "I7", "16GB", "MAC"),

                new Laptop(104, "250GB", "M1", "8GB", "UBUNTU"),
                new Laptop(105, "250GB", "M1", "16GB", "UBUNTU"),
                new Laptop(106, "500GB", "17", "8GB", "UBUNTU"),
                new Laptop(107, "200GB", "i7", "16GB", "UBUNTU"),

                new Laptop(108, "200GB", "M1", "8GB", "WINDOWS"),
                new Laptop(109, "250GB", "I7", "8GB", "WINDOWS"),
                new Laptop(110, "500GB", "I7", "16GB", "WINDOWS")
        );
    }
}
