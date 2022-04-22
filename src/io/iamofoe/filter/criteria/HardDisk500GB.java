package io.iamofoe.filter.criteria;

import io.iamofoe.filter.model.Laptop;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class HardDisk500GB implements Criteria {
    private final String size = "500GB";

    @Override
    public List<Laptop> meetsCriteria(List<Laptop> laptops) {
        return laptops.stream().filter(laptop -> size.equals(laptop.getHardDisk())).collect(toList());
    }
}
