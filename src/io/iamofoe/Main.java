package io.iamofoe;

import io.iamofoe.filter.LaptopFactory;
import io.iamofoe.filter.criteria.AndCriteria;
import io.iamofoe.filter.criteria.HardDisk250GB;
import io.iamofoe.filter.criteria.M1Processor;
import io.iamofoe.filter.criteria.Ubuntu;
import io.iamofoe.filter.model.Laptop;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Laptop> laptops = LaptopFactory.manufactureInBulk();

        AndCriteria searchCriteria = new AndCriteria(new HardDisk250GB(), new M1Processor(), new Ubuntu());
        List<Laptop> filteredLaptop = searchCriteria.meetsCriteria(laptops);

        filteredLaptop.forEach(System.err::println);


    }
}
