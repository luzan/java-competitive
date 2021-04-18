public class ConcatenatedSum {
    public static void main(String[] args){
        System.out.println(getConcatenatedSum(2297, 2));
    }
    public static int getConcatenatedSum(int n, int catlen) {
        StringBuilder catlenStr = new StringBuilder();
        for (int i = 0; i < catlen; i++) {
            catlenStr.append(1);
        }
        int val = Integer.valueOf(catlenStr.toString());
        if (n % val == 0) {
            return 1;
        }
        return 0;
    }
    
}
