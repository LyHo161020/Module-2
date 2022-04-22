package com.company;

import java.util.Comparator;

public class SortId implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getId() - o2.getId());
    }
}
