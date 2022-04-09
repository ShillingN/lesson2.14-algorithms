//package pro.sky.java.course2.algorithms.stringListInterface;
//
//public class StringListImpl implements StringList{
//
//    private String[] stringList;
//    private int size;
//    private final int DEFAULT_CAPACITY = 5;
//    private int id;
//    private int elem;
//
//    public StringListImpl(int capacity) {
//        if (capacity <= 0) {
//            throw new IllegalArgumentException();
//        } else {
//            stringList = new String[capacity];
//        }
//    }
//
//    public StringListImpl() {
//        stringList = new String[DEFAULT_CAPACITY];
//    }
//
//    @Override
//    public String display() {
//        for (String elem : stringList) {
//            System.out.print(elem + " ");
//
//        }
//        return null;
//    }
//
//    @Override
//    public String add(String item) {
//        for (int i = 0; i < stringList.length; i++) {
//            if (stringList[i] == null) {
//                stringList[i] = item;
//                id = i;
//                break;
//            }else {
//                throw new RuntimeException("Массив переполнен");
//            }
//        }
//        return stringList[id];
//    }
//
//    @Override
//    public String add(int index, String item) {
//        for (int i = 0; i < stringList.length; i++) {
//
//        }
//        return null;
//    }
//
//    @Override
//    public String set(int index, String item) {
//        return null;
//    }
//
//    @Override
//    public String remove(String item) {
//        return null;
//    }
//
//    @Override
//    public String remove(int index) {
//        return null;
//    }
//
//    @Override
//    public boolean contains(String item) {
//        return false;
//    }
//
//    @Override
//    public int indexOf(String item) {
//        return 0;
//    }
//
//    @Override
//    public int lastIndexOf(String item) {
//        return 0;
//    }
//
//    @Override
//    public String get(int index) {
//        return null;
//    }
//
//    @Override
//    public boolean equals(StringList otherList) {
//        return false;
//    }
//
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return false;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public String[] toArray() {
//        return new String[0];
//    }
//}
