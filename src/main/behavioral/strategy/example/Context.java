package behavioral.strategy.example;

import behavioral.strategy.interfaces.Sort;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Context {
    private Sort sort;

    public void doSort(){
        List<Integer> list =  new ArrayList<Integer>(){{
            add(4);
            add(2);
            add(7);
            add(1);
            add(8);
            add(0);
        }};
        sort.soft(list);
        list.forEach(System.out::println);
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
