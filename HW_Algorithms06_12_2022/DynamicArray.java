package HW_Algorithms.HW_Algorithms06_12_2022;

import java.util.Arrays;

public class DynamicArray {
    private int[] arr;
    public static final int INITIAL_CAPACITY = 13;
    private int capacity;
    private int size = 0;

    public DynamicArray() {
        this.arr = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }
    public void sort() {
        Arrays.sort(arr);
        for (int v : arr) {
            System.out.print(v + " , ");
        }
    }

    public void add(int value) {
        if (size > capacity) {
            growSize(-1);
        }
        arr[size++] = value;
    }

    public void addAt(int index, int value) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size >= capacity) {
            growSize(index);
        } else {
            for (int i = size - 1; i >= index; i--) {
                arr[i + 1] = arr[i];
            }
        }
        arr[index] = value;
        size++;
    }

    public int get(int index) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    }

    public void remove() {
        arr[--size] = 0;
    }
    public void removeAt(int index) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException("перебор......");
        }
        if (index == size) {
            remove();
            return;
        }
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void set(int index, int value) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[index] = value;
    }

    public boolean contains(int value) {
        for (int e : arr) {
            if (e == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }
    public void clear() {
        arr = new int[INITIAL_CAPACITY];
        capacity = INITIAL_CAPACITY;
        size = 0;
    }

    public void shrinkSize() {
        capacity = size;
        int[] tempArr = new int[capacity];

        System.arraycopy(arr, 0, tempArr, 0, size);
        arr = tempArr;
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }
    private void growSize(int index) {
        capacity *= 2;
        int[] tempArr = new int[capacity];
        int i = 0;
        while (i < size) {
            int pos = index == -1 || i < index ? i : i + 1;
            tempArr[pos] = arr[i];
            i++;
        }
        arr = tempArr;
    }
}
