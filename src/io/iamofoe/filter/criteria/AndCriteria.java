package io.iamofoe.filter.criteria;

import io.iamofoe.filter.model.Laptop;

import java.util.List;

public class AndCriteria implements Criteria {

    private final Criteria[] criterias;

    public AndCriteria(Criteria... criterias) {
        this.criterias = criterias;
    }

    @Override
    public List<Laptop> meetsCriteria(List<Laptop> laptops) {
        List<Laptop> filteredLaptops = laptops;

        for (Criteria criteria: criterias) {
            filteredLaptops = criteria.meetsCriteria(laptops);
        }

        return filteredLaptops;
    }
}
