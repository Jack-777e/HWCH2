public class Sample2_22 {
    public static void main(String[] args) {
        int[][] test = new int[2][5];

        test[0][0] = 80;
        test[0][1] = 70;
        test[0][2] = 40;
        test[0][3] = 64;
        test[0][4] = 25;
        test[1][0] = 16;
        test[1][1] = 99;
        test[1][2] = 46;
        test[1][3] = 34;

        for(int i=0; i<test[1].length; i++){
            System.out.println("第" + (i+1) + "個人的國語分數是" + test[0][i] + "分");
            System.out.println("第" + (i+1) + "個人的數學分數是" + test[1][i] + "分");
        }

    }
}
