public class RecursionTrees {

    public static void tab(int n) {
        for(int i = 0; i < n; i++) { System.out.print("\t"); }
    }

    public static int recursive(int a, int b, int depth) {
        if(a <= 1 || b <= 1) return 1;

        tab(depth); System.out.println("("+depth+") precall  1: a " + a + ", b "+ b);

        a = recursive(a-1, b-1, depth+1);

        tab(depth); System.out.println("("+depth+") postcall 1: a " + a + ", b "+ b);

        b = recursive(a+1, b>>1, depth+1);

        tab(depth); System.out.println("("+depth+") postcall 2: a " + a + ", b "+ b);

        return a > b ? a : b;
    }
    
    public static void main(String[] args) {
        recursive( 5, 10, 0);
        //recursive(10, 20, 0);
    }

}
