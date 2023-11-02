public class Sample2_17 {
    public static void main(String[] args) {
        int[] test = new int[5];

        test[0] = 80;
        test[1] = 65;
        test[2] = 70;
        test[3] = 40;
        test[4] = 56;

        test[10] = 10;

        for(int i=0; i<5; i++){
            System.out.println("第" + (i+1) + "個人的分數是" + test[i] + "分");
        }
    }
}
