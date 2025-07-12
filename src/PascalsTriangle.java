public class PascalsTriangle {

    //Variation 1
//    public static long nCr(int n, int r){
//        long res = 1;
//        for(int i=0; i<r; i++){
//            res = res * (n-i);
//            res = res / (i+1);
//        }
//        return res;
//    }
//    public static int pascalTriangle(int r, int c){
//        int element = (int) nCr(r-1, c-1);
//        return element;
//    }
//
//    public static void main(String[] args) {
//        int r = 5; // row number
//        int c = 3; // col number
//        int element = pascalTriangle(r, c);
//        System.out.println("The element at position (r,c) is: " + element);
//    }

    //Variation 2 Naive Approach
//    public static long nCr(int n, int r){
//        long res = 1;
//        for(int i=0; i<r; i++){
//            res = res * (n-i);
//            res = res / (i+1);
//        }
//        return res;
//    }
//    public static ArrayList<Integer> nthRowOfPascalTriangle(int n) {
//        // code here
//        //variation 2
//        ArrayList<Integer> ans = new ArrayList<>();
//        for(int c=1; c<=n; c++){
//            ans.add((int)(nCr(n-1, c-1)));
//        }
//        return ans;
//    }

    //Optimal Variation 2
//    public static ArrayList<Integer> nthRowOfPascalTriangle(int n) {
//        // code here
//        //variation 2
//        ArrayList<Integer> ans = new ArrayList<>();
//        long val = 1;
//        ans.add(1);
//        for(int i=1; i<n; i++){
//            val = val * (n-i);
//            val = val/i;
//            ans.add((int)val);
//        }
//
//        return ans;
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        pascal(n);
//    }

    //variation 3
    //Naive Approach
//    public static int nCr(int n, int r){
//        long res = 1;
//        for(int i=0; i<r; i++){
//            res = res * (n-i);
//            res = res/(i+1);
//        }
//        return (int)res;
//    }
//    public  static List<List<Integer>> generate(int n){
//        List<List<Integer>> ans = new ArrayList<>();
//        for(int row=1; row<=n; row++){
//            List<Integer> temp = new ArrayList<>();
//            for(int col=1; col<=row; col++){
//                temp.add(nCr(row-1, col-1));
//            }
//            ans.add(temp);
//        }
//        return ans;
//    }
    //optimal
//    public static List<Integer> generateRow(int row){
//        long ans = 1;
//        List<Integer> ansR = new ArrayList<>();
//        ansR.add(1);
//
//        for(int col=1; col<row; col++){
//            ans = ans *(row-col);
//            ans = ans/col;
//            ansR.add((int) ans);
//        }
//        return ansR;
//    }
//    public static List<List<Integer>> generate(int numRows){
//        List<List<Integer>> ans = new ArrayList<>();
//        for(int row=1; row<=numRows; row++){
//            ans.add(generateRow(row));
//        }
//        return ans;
//    }

//    public static void main(String[] args) {
//        int n = 5;
//        List<List<Integer>> ans = pascalTriangle(n);
//        for (List<Integer> it : ans) {
//            for (int ele : it) {
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
//    }
}
