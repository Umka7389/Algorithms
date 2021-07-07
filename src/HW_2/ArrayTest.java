package HW_2;

public class ArrayTest {
    public static void main(String[] args) {
        Array<Integer> arrayBubble = new ArrayImpl<>(10000);
        Array<Integer> arraySelect = new ArrayImpl<>(10000);
        Array<Integer> arrayInsert = new ArrayImpl<>(10000);

        for (int i = 1; i <= 10000; i++) {
            arrayBubble.add((int) (Math.random() * 10000));
            arraySelect.add((int) (Math.random() * 10000));
            arrayInsert.add((int) (Math.random() * 10000));
        }
        long currentTime = System.nanoTime();
        arrayBubble.sortBubble();
        System.out.println(System.nanoTime() - currentTime);

        currentTime = System.nanoTime();
        arraySelect.sortSelect();
        System.out.println(System.nanoTime() - currentTime);

        currentTime = System.nanoTime();
        arrayInsert.sortInsert();
        System.out.println(System.nanoTime() - currentTime);


    }
}
