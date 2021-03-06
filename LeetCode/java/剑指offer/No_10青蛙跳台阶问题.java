package 剑指offer;

/**
 * 题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * <p>
 * 思路：这其实就是一个斐波那契数列的问题。可以把n级台阶的跳法看作n的函数，记成f(n)。
 * 当它选择第一次跳一步之后，它面临f(n-1)种解法；当它选择第一次跳两步之后，它面临f(n-2)种解法。
 * 最终解法就是f(n)=f(n-1)+f(n-2)，这就是一个显然的斐波那契数列。
 *
 * 扩展：如果此处增加青蛙一次也可以跳上n级，用数学归纳法可以证明是f(n)=2的(n-1)次方
 */
public class No_10青蛙跳台阶问题 {

    public int jumpForg ( int n ) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return jumpForg(n - 1) + jumpForg(n - 2);

    }
}
