package HW_6;

import java.util.Random;
import java.util.TreeMap;

public class Test6 {

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("s1", 23);
        treeMap.put("s2", 24);
        treeMap.put("s3", 25);
        treeMap.put("s1", 26);

//        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
//        treeMap.put(23, 23);
//        treeMap.put(24, 24);
//        treeMap.put(25, 25);
//        treeMap.put(26, 26);

        System.out.println(treeMap);

        int balancedTreeCount = 0;
        int maxTreeLevel = 4;
        int maxTreeElements = (int) Math.pow(2, maxTreeLevel) - 1;
        for (int i = 0; i < 20; i++) {
            Tree<Integer> tree = new TreeImpl<>(maxTreeLevel);
            for (int j = 0; j <= maxTreeElements; j++) {
                tree.add((int) (Math.random() * 50 - 25));
            }
            if (tree.isBalanced()) {
                balancedTreeCount++;
            }
            System.out.println(tree.isBalanced());
            tree.display();
        }
        System.out.printf("Number of balanced tree: %d/20", balancedTreeCount);

/*
        System.out.println("Find 70: " + tree.contains(70));
        System.out.println("Find 700: " + tree.contains(700));

        tree.display();*/
//        tree.remove(40);
//        tree.display();

//        tree.traverse(Tree.TraverseMode.IN_ORDER);
//        tree.traverse(Tree.TraverseMode.PRE_ORDER);
//        tree.traverse(Tree.TraverseMode.POST_ORDER);

    }
}
