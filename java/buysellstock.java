/**
 * Created by gersonda on 12/25/2014.
 */
public class buysellstock {


    public static void main(String[] args) {

        int[] input;
        input = new int[2];

        input[0] = 1;
        input[1] = 2;


        maxProfit(input);
        System.out.print("Val equals");
        System.out.print(maxProfit(input));
    }


    public static int maxProfit(int[] prices) {

        int numlen = prices.length;
        int maxnum = 0;
        int minnum = 0;
        int maxProf = 0;

        int curmax = 0;
        int curmin = 0;


        int lifo = 0;
        int[] maxStack;
        maxStack = new int[numlen];
        int fifo = 0;
        int[] minQueue;
        minQueue = new int[numlen];


        if (numlen == 1) {
            return maxProf;
        } else {
            for (int i = 0; i < numlen; i++) {

                //MinNum Code
                lifo = prices[numlen - 1 - i];
                if (i == 0) {
                    maxnum = lifo;
                }
                if (lifo > maxnum) {
                    maxnum = lifo;
                }
                maxStack[numlen - 1 - i] = (maxnum);

                fifo = prices[i];
                if (i == 0) {
                    minnum = fifo;
                }
                if (fifo < minnum) {
                    minnum = fifo;
                }
                minQueue[i]= minnum;
            }


            for (int i = 0; i < numlen; i++) {
                curmin = minQueue[i];
                curmax = maxStack[i];
                if (maxProf < curmax - curmin) {
                    maxProf = curmax - curmin;
                }
            }
            return maxProf;
        }
    }

}
