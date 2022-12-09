package partB.ex02;

public class LoopPrintExample {
    public static String loops() {
        String response = "";
        int i = 0;
        while (i < 5) {
            System.out.println("My name is non ya bidness!");
            i++;
        }
        return response;

    }
    public static void main(String[] args) {
        String loop = loops();
        System.out.print(loop);
    }



}
