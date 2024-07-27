public class Main {
    public static void main(String[] args) {
        int number = 0;
        GenericArray<String> array = new GenericArray<>(10);
        for (int i = 0; i < 1_000_000; i++) {
            array.add(Integer.toString(i));
        }
        array.writeArray();
        System.out.println(array.searchElemenIndex(15));
        System.out.println(array.getSize());
    }
}