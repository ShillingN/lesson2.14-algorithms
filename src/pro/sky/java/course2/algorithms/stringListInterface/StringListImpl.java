package pro.sky.java.course2.algorithms.stringListInterface;

import java.util.Arrays;

public class StringListImpl implements StringList{

    private final String[] stringList;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 5;
    private String elem;

    public StringListImpl(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        } else {
            stringList = new String[capacity];
        }
    }

    public StringListImpl() {
        stringList = new String[DEFAULT_CAPACITY];
    }


    @Override
    public int sizeOf() {
        return size;
    }

    @Override
    public String add(String item) {
        if (item == null) {
            throw new NullPointerException();
        }
        return stringList[size++] = item;
    }

    @Override
    public String add(int index, String item) {
        if (item == null) {
            throw new NullPointerException();
        }
        if (index >= stringList.length || index < 0) {
            throw new IllegalArgumentException("индекс меньше нуля или выходит за рамки листа");
        }
        if (size - index >= 0) System.arraycopy(stringList, index, stringList, index + 1, size - index);
        size++;
        return stringList[index] = item;
    }

    @Override
    public String set(int index, String item) {
        if (item == null) {
            throw new NullPointerException();
        }
        if (index >= stringList.length || index < 0) {
            throw new IllegalArgumentException("индекс меньше нуля или выходит за рамки листа");
        }
        return stringList[index] = item;
    }

    @Override
    public String remove(String item) {
        if (item == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i <= size; i++) {
            if (item.equals(stringList[i])) {
                elem = stringList[i];
                if (i == stringList.length - 1) {
                    stringList[i] = null; // не понимаю, как сделать удаление последнего элемента без null, если не менять длину массива
                    size--;
                } else {
                    for (int j = i; j < size; j++) {
                        stringList[j] = stringList[j + 1];
                        stringList[j + 1] = null; // если я смещаю последующие элементы - то последний все равно должен стать null
                    }
                    size--;
                }
            } else {
                throw new RuntimeException();
            }
        }
        return elem;
    }

    @Override
    public String remove(int index) {
        String elem = stringList[index];
        if (index == stringList.length - 1) {
            stringList[index] = null; // не понимаю, как сделать удаление последнего элемента без null, если не менять длину массива
            size--;
        } else {
        for (int i = index; i < size; i++) {
            stringList[i] = stringList[i + 1];
            stringList[i + 1] = null;
            }
            size--;
        }
        return elem;
    }

    @Override
    public boolean contains(String item) {
        if (item == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i <= size; i++) {
            if (item.equals(stringList[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        if (item == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i <= size; i++) {
            if (item.equals(stringList[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        if (item == null) {
            throw new NullPointerException();
        }
        int j = 0;
        for (int i = size; i >= 0; i--, j++) {
            if (item.equals(stringList[i])) {
                return j;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        if (index >= stringList.length || index < 0) {
            throw new IllegalArgumentException("индекс меньше нуля или выходит за рамки листа");
        }
        return elem = stringList[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (otherList == null) {
            throw new NullPointerException();
        }
        return Arrays.equals(stringList, new StringList[]{otherList});
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i <= size; i++) {
            if (null != stringList[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i <= size; i++) {
            stringList[i] = null;
        }
    }

    @Override
    public String[] toArray() {
        return new String[DEFAULT_CAPACITY];
    }
}
