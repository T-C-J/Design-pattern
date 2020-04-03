package behavioral.strategy;

import behavioral.strategy.example.BubbleSort;
import behavioral.strategy.example.Context;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setSort(new BubbleSort());
        context.doSort();
    }
}
