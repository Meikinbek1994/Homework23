import java.util.*;

public class Main {
    public static void main(String[] args) {


        Random random=new Random();

        int[] numbers=new int[10];
        ArrayList<Integer>arrayList=new ArrayList<>();
        LinkedList<Integer>linkedList=new LinkedList<>();

        for(int i=0; i<numbers.length; i++){
            int randomNumbers= random.nextInt(2);
            numbers[i]=randomNumbers;
            //System.out.println(numbers[i]);
        }System.out.println("Array numbers before sorting.");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array numbers after sorting.");
        System.out.println(Arrays.toString(numbers));


        for(int i=0; i<10; i++){
            int randomNumbers= random.nextInt(2);
            arrayList.add(randomNumbers);

        }System.out.println("ArrayList numbers before sorting.");
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println("ArrayList numbers after sorting.");
        System.out.println(arrayList);


        for(int i=0; i<10; i++){
            int randomNumbers= random.nextInt(2);
            linkedList.add(randomNumbers);


        }System.out.println("LinkedList numbers before sorting.");
        System.out.println(linkedList);

        Collections.sort(linkedList);
        System.out.println("LinkedList numbers after sorting.");
        System.out.println(linkedList);

    }

}