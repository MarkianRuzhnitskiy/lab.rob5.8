public class Second {
    public static void main(String[] args) {
        int x = 182;
        int x1 = x / 100;
        int x2 = (x % 100)/10;
        int x3 = x % 10;
        if((x1 > x3) && (x1>x2)){
            System.out.println(x1);
        }
        else if ((x2>x3)&&(x2>x1)){
            System.out.println(x2);
        }
        else {
            System.out.println(x3);
        }
    }
}
