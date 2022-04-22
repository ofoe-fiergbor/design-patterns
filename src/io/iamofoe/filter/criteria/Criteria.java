package io.iamofoe.filter.criteria;

import io.iamofoe.filter.model.Laptop;

import java.util.List;

public interface Criteria {
    List<Laptop> meetsCriteria(List<Laptop> laptops);
}
