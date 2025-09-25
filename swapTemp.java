public class swapTemp {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap, a="+a+", b="+b);
    }
}
