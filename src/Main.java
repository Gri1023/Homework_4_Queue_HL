import ibadts.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> business = new Queue<>();
        business.add(new String[]{"Sir_A","Madam_B","Rick_C"});
        Queue<String> economy = new Queue<>();
        economy.add(new String[]{"Sarah_A","John_B","Wendy_C"});
        String[] array = new String[6];
        int counter = 0;
        while (!economy.isEmpty()) {
            if (!business.isEmpty()) {
                array[counter] = business.dequeue();
                counter++;
            }
            if (!business.isEmpty()) {
                array[counter] = business.dequeue();
                counter++;
            }
            array[counter] = economy.dequeue();
            counter++;
        }
        for (int i=0;i<6;i++)
        System.out.println(array[i]);
    }
}