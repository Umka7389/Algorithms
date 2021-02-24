package HW_5.BagSolve;

import java.util.LinkedList;
import java.util.List;

public class BagOptimization {
    List<Item> optimizedItemList = new LinkedList<>();

    public boolean checkWeight(List<Item> itemList, int maxBagSize) {
        int itemListWeight = 0;
        for (Item item : itemList) {
            itemListWeight += item.getWeight();
        }
        return itemListWeight <= maxBagSize;
    }

    public int calcItemListCost(List<Item> itemList) {
        int itemListCost = 0;
        for (Item item : itemList) {
            itemListCost += item.getCost();
        }
        return itemListCost;
    }


    public List<Item> optimize(List<Item> itemList, int maxBagSize) {


        if (itemList.size() > 0) {
            if (optimizedItemList.size() == 0) {
                if (checkWeight(itemList, maxBagSize)) {
                    optimizedItemList = itemList;
                }
            }
            if (checkWeight(itemList, maxBagSize) && (calcItemListCost(itemList) > calcItemListCost(optimizedItemList))) {
                optimizedItemList = itemList;
            }

            for (int i = 0; i < itemList.size(); i++) {
                List<Item> newItemList = new LinkedList<>(itemList);
                newItemList.remove(i);
                optimize(newItemList, maxBagSize);
            }
        }
        return optimizedItemList;
    }


}






