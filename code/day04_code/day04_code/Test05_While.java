/*
（二）while循环
语法格式：
while(循环条件){
	循环体语句块
}

执行过程：
（1）先判断循环条件
（2）如果循环条件成立，那么就执行循环体语句，再回到（1）
	如果循环条件不成立，那么就结束while循环
	
仔细分析，仍然有四个要素：
（1）循环变量的初始化，例如：int i = 1;
（2）循环条件，例如：i<=100
（3）循环体语句，例如：	sum+=i;
（4）迭代语句，例如：i++

结论：
	各种循环之间是可以互相替换的，只不过，在某些场景，那么某一中循环更合适（可读性方面）
	for循环一般用于：次数比较明显，以及后面数组等遍历
	while循环一般用于：条件比较明显，次数不太明显
*/
class Test05_While{
	public static void main(String[] args){
		//1、求1-100的和
		/*
		两个变量：
		（1）sum：存总和
		（2）循环变量，从1-100
		*/
		int sum = 0;
		int i = 1;
		while(i<=100){
			sum+=i;//需要重复执行的语句，累加每一个i
			i++;
		}
		System.out.println("sum = " + sum);
	}
}