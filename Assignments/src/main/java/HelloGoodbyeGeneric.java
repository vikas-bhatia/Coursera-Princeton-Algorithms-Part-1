public class HelloGoodbyeGeneric {
    public static void main(String[] args){

        StringBuilder hello=new StringBuilder("Hello ");
        StringBuilder bye=new StringBuilder("Goodbye ");
        int l=args.length;
        for (int i = 0; i < l; i++) {
            if(i>0) {
               hello.append(" and ");
               bye.append(" and ");
            }
            hello.append(args[i]);
            bye.append(args[l - 1 - i]);
        }

        System.out.println(hello);
        System.out.println(bye);
    }
}