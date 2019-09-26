public class Bsadasda {
    public static void main(String[] args) {
        System.out.println(getInt());
    }

    public static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
            /* return a 在程序执行到这一步的时候，
             后面还有finally，所以继续执行finally的内容，a=40
             * 再次回到以前的路径,继续走return 30，形成返回路径之后，这里的a就不是a变量了，而是常量30             */
        } finally {
            a = 40;
            return a;
            //如果这样，就又重新形成了一条返回路径，由于只能通过1个return返回，所以这里直接返回40
        }
    }
}
