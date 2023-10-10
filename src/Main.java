public class Main {
    public static void main(String[] args) {
        partOfTheArray (10, 50, 3, 7);
    }

    public static int [] partOfTheArray (int number, int max, int first, int last) {
        java.util.Random random = new java.util.Random ();
        int [] arr = new int[number];
        System.out.println("Все четные числа увеличиваем на единицу: ");
        for (int i = 0; i < arr.length; i++) {
            arr [i] = random.nextInt(max);
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] + 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Возвращаем кусок списка с 3-го по 7-й элемент: ");
        for (int i = first-1; i <= last-1; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}