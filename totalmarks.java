public class totalmarks {
    public static void main(String[] args) {
        int [] marks = {80,75,90,85,70};
        int total = 0;

        for ( int mark :marks){
            total += mark;
        }
        System.out.println("total marks:"+total);
    }
}
           