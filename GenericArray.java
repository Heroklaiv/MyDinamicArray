import java.util.Arrays;

public class GenericArray<T> {
    private T[] array;
    private int size;
    private int lastIndex = 0;

    public GenericArray(int capacity) {
        this.size = capacity;
        this.array = (T[]) new Object[capacity];
    }

    public GenericArray() {
        this.size = 10;
        this.array = (T[]) new Object[10];
    }

    public boolean add(T element) {
        if (lastIndex + 1 == size) {
            newSize();
            array[lastIndex] = element;
            lastIndex++;
            return true;
        } else {
            array[lastIndex] = element;
            lastIndex++;
            return true;
        }
    }

    public T add(T element, int index) {
         T oldElement;
        if (index <= size) {
            oldElement =array[index];
            array[index] = element;
            System.out.println(array[index]);
            return oldElement;
        } else {
            return null;
        }
    }

    private void newSize() {
        if (size < ((Integer.MAX_VALUE / 2) - 8)) {
            size = size * 2;
            T[] newArray= Arrays.copyOf(array, size);
            array = newArray;
        }
        if (size > ((Integer.MAX_VALUE / 2) - 8) && (size < (Integer.MAX_VALUE - 2_000_000))) {
            size = size + 1_000_000;
            T[] newArray= Arrays.copyOf(array, size);
            array = newArray;
        }
        if (size > (Integer.MAX_VALUE - 2_000_000)) {
            size = Integer.MAX_VALUE - 8;
            T[] newArray;
            newArray = Arrays.copyOf(array, size);
            array = newArray;
        }

    }

    public void writelnArray() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                System.out.println(array[i]);
        }
    }

    public void writeArray() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                System.out.print(array[i] + ", ");
        }
    }

    public T searchElementIndex(int i) {
        if (i < lastIndex)
            return array[i];
        else return null;
    }

    public int getSize() {
        return size;
    }

    public int getLastIndex() {
        return lastIndex;
    }
}