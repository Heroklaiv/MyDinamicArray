public class Main {
    public static void main(String[] args) {
        int number = 0;
        GenericArray<String> array = new GenericArray<>(10);
        for (int i = 0; i < 100; i++) {
            array.add(Integer.toString(i)+" elment");
        }
        array.add("Hello", 56);
        array.writelnArray();
        System.out.println(array.searchElementIndex(15));
        System.out.println(array.getSize());
    }
}