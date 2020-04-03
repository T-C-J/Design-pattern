package behavioral.strategy.example;

import behavioral.strategy.interfaces.Sort;

import java.util.List;

public class QuickSort implements Sort {

    @Override
    public void soft(List<Integer> list) {
        list.sort(Integer::compareTo);
    }
}
