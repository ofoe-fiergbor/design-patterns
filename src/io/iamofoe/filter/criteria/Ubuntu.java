package io.iamofoe.filter.criteria;

import io.iamofoe.filter.model.Laptop;

import java.util.List;
import java.util.stream.Collectors;

public class Ubuntu implements Criteria {
    private final String os = "UBUNTU";

    @Override
    public List<Laptop> meetsCriteria(List<Laptop> laptops) {
        return laptops.stream().filter(laptop -> laptop.getOperatingSystem().equals(os)).collect(Collectors.toList());
    }
}
