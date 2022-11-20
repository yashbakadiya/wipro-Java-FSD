
class ArrayDemo {
    public static void main(String args[]) {
        int numbers[] = {10, 11, 12, 13};
        String names[] = {"repul", "lakshmi", "maddy"};
        String fruits[] = new String[3];

        int num1 = numbers[1];
        int num0 = numbers[0];
        fruits[0] = "banana";
        fruits[1] = "apple";
        fruits[2] = "mango";

        System.out.println("numbers below");
        for (int i = 0; i < numbers.length; i++) {
            int iterated = numbers[i];
            System.out.println(iterated);
        }

        for (int iterated:numbers) {
            System.out.println(iterated);
        }

        System.out.println("names below");

        for (int i = 0; i < names.length; i++) {
            String iterated = names[i];
            System.out.println(iterated);

        }

        System.out.println("fruits below");

        for (int i = 0; i < fruits.length; i++) {
            String iterated = fruits[i];
            System.out.println(iterated);
        }


        for (String iterated : fruits) {
            System.out.println(iterated);
        }

    }

}
