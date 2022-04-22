package io.iamofoe.filter.criteria;

import io.iamofoe.filter.model.Laptop;

import java.util.List;
import java.util.stream.Collectors;

public class Ram16GB implements Criteria{
    private final String ram = "16GB";
    @Override
    public List<Laptop> meetsCriteria(List<Laptop> laptops) {
        return laptops.stream().filter(laptop -> laptop.getRam().equals(ram)).collect(Collectors.toList());
    }
}
