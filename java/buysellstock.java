import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by gersonda on 12/25/2014.
 */
public class buysellstock {


    public static void main(String[] args) {

        int[] input;
        input = new int[5];

        input[0] = 2;
        input[1] = 1;
        input[2] = 2;
        input[3] = 0;
        input[4] = 1;

        maxProfit(input);
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
        Stack maxStack = new Stack();
        int fifo = 0;
        Queue<Integer> minQueue = new LinkedList<Integer>();


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
                maxStack.push(maxnum);

                fifo = prices[i];
                if (i == 0) {
                    minnum = fifo;
                }
                if (fifo < minnum) {
                    minnum = fifo;
                }
                minQueue.add(maxnum);
            }


            for (int i = 0; i < numlen; i++) {
                curmin = ((Integer) minQueue.remove()).intValue();
                curmax = ((Integer) maxStack.pop()).intValue();
                if (maxProf < curmax - curmin) {
                    maxProf = curmax - curmin;
                }
            }
            return maxProf;
        }
    }

}
