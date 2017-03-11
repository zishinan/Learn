package com.ouyang.interview;
/*
题目描述：
有N队学生，编号分别为1，2，3，…，n。每队上有若干学生，但学生总数必为n的倍数。可以在任一队上移动若干个学生。
移动的规则是：在编号为1的队上移动学生，只能移到编号为2的队上；在编号为n的队上移动的学生，只能移动到编号为n-1
的队上；其他队上移动的学生，可以移到相邻左边或右边的队上。现在要求找出一种移动方法，用最少的移动次数使每队上的
学生人数一样多。例如：n=3，3队学生分别为：3，4，2则移动一次可以达到目的：从第2队中移动一名学生到第3对中即可
实现每队人数相同。

输入：
要求从标准输入中获得两类数据，值的范围正整数（1~100之间），表示队数和每队人数；第一行输入队数，第二行输入每队
人数，每行多个数值之间空格隔开。

输出：
程序输出需要移动的次数

输入示例：
3
3 4 2

输出示例：
1  
*/
public class Migu {
	public static int getStep(int[] nums){
		int total = 0;
		for (int i : nums) {
			total += i;
		}
//		求平均数，并验证数据
		int average = total / nums.length;
		if(average*nums.length != total){
			System.err.println("数据错误");
			return -1;
		}
//		生成新的平均数差值数组
		int[] aveNums = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			aveNums[i] = nums[i] - average;
		}
//		计算总的步数
		int totalStep = 0;
		int temp = 0;
		for (int i : aveNums) {
			temp = temp + i;
			if(temp == 0){
				continue;
			}
			totalStep++;
		}
		return totalStep;
	}
}
