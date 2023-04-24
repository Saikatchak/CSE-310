import java.util.*;

class Inlist {
    protected int[] list;
    protected int numElements = 0;

    Inlist(int size) {
        list = new int[size];
    }

    void add(int value) {
        if (numElements < list.length) {
            list[numElements] = value;
            numElements++;
        } else {
            System.out.println("The list is full.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numElements; i++) {
            sb.append(list[i]).append(" is at the index ").append(i).append("\n");
        }
        return sb.toString();
    }
}

public class inheritanceinlist {
    public static void main(String[] args) {
        Inlist l1 = new Inlist(3);
        l1.add(3);
        l1.add(6);
        l1.add(9);
        l1.add(12);
        String res = l1.toString();
        System.out.println(res);
    }
}
