package HW_3.stringReverse;

import HW_3.stack.IStack;
import HW_3.stack.StackImpl;

public class StringReverse<E> {

    public String reverse(String text) {
        IStack<Character> stack = new StackImpl<>(text.length());
        StringBuilder reverseString = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentCharInput = text.charAt(i);
            stack.push(currentCharInput);
        }
        for (int i = 0; i < text.length(); i++) {
            reverseString.append(stack.pop());
        }
        return reverseString.toString();
    }
}
