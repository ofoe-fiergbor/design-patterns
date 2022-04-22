package io.iamofoe.filter.criteria;

import io.iamofoe.filter.model.Laptop;

import java.util.List;
import java.util.stream.Collectors;

public class Ram8GB implements Criteria{
    private final String ram = "8GB";
    @Override
    public List<Laptop> meetsCriteria(List<Laptop> laptops) {
        return laptops.stream().filter(laptop -> laptop.getRam().equals(ram)).collect(Collectors.toList());
    }
}
