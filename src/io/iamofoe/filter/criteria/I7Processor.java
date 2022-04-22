package io.iamofoe.filter.criteria;

import io.iamofoe.filter.model.Laptop;

import java.util.List;
import java.util.stream.Collectors;

public class I7Processor implements Criteria{
    private final String processor = "I7";

    @Override
    public List<Laptop> meetsCriteria(List<Laptop> laptops) {
        return laptops.stream().filter(laptop -> laptop.getProcessor().equals(processor)).collect(Collectors.toList());
    }
}
