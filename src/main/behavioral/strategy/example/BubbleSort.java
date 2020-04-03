package behavioral.strategy.example;

import behavioral.strategy.interfaces.Sort;

import java.util.List;

public class BubbleSort implements Sort {

    @Override
    public void soft(List<Integer> array) {
        if (array.size() == 0) return;
        for (int i = 0; i < array.size(); i++)
            for (int j = 0; j < array.size() - 1 - i; j++)
                if (array.get(j + 1) < array.get(j)) {
                    int temp = array.get(j + 1);
                    array.set(j + 1,array.get(j));
                    array.set(j,temp);
                }
    }
}
