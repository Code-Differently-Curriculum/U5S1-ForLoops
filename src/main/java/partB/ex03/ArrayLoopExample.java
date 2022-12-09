package partB.ex03;

public class ArrayLoopExample {

    public static String ArrayLoops() {
        String response = "";
        double[] numbers = {1.2, 2.1, 3.4, 4.3};
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        return response;

    }
    public static void main(String[] args) {
        String loop = ArrayLoops();
        System.out.print(loop);
    }

}
