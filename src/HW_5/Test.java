package HW_5;

import HW_5.BagSolve.BagOptimization;
import HW_5.BagSolve.Item;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Exponentiation exp = new Exponentiation();
        System.out.println(exp.exp(5, 3));


        List<Item> itemList = new LinkedList<>();
        itemList.add(new Item("Книга", 1, 600));
        itemList.add(new Item("Бинокль", 2, 5000));
        itemList.add(new Item("Аптечка", 4, 1500));
        itemList.add(new Item("Ноутбук", 2, 40000));
        itemList.add(new Item("Котелок", 1, 500));

        BagOptimization bagOptimization = new BagOptimization();
        List<Item> optimizedList = bagOptimization.optimize(itemList, 2);
        for (Item item : optimizedList) {
            System.out.println(item.getName());
        }
    }
}
