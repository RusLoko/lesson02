package Lesson2;

public class Main2 {

    public static void main(String[] args) {
        int[] arr = new int[8];
        int j = 0;
        int maxMass = arr.length;

        for (int i = 0; i < maxMass; i++, j = j + 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }
    //cnew changes
}

