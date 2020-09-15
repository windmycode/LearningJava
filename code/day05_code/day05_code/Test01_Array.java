/*
数组(array)：
	简单的说，就是一组数
	
	当一组数据的数据类型，意义是一样的时候，那么为了方便的统一的管理它们，我们需要
	用新的数据的存储结构来进行存储。例如：数组
	
所谓数组(Array)，就是相同数据类型的元素按一定顺序排列的集合，
就是把有限个类型相同的变量用一个名字命名，以便统一管理他们，
然后用编号区分他们，这个名字称为数组名，编号称为下标或索引(index)。
组成数组的各个变量称为数组的元素(element)。数组中元素的个数称为数组的长度(length)。	

int[] scores = new int[7];
scores[0] = 89;
数组名：例如：scores
下标：范围：[0,长度-1]
	例如：[0]
元素：数组名[下标]
	例如：scores[0]

数组的长度：元素的总个数，可以这么表示：   数组名.length
*/
class Test01_Array{
	public static void main(String[] args){
		/*
		要存储本组学员的成绩，例如：第1组，有7个同学
		*/
		/*
		int score1 = 89;
		int score2 = 89;
		int score3 = 67;
		int score4 = 99;
		int score5 = 89;
		int score6 = 34;
		int score7 = 89;
		
		//用7个变量存储没问题，但是如果涉及到对数据的管理：例如，求最值，排序等，就非常麻烦
		*/
		int[] scores = new int[7];//用scores这一个统一的名称，来管理7个int类型的元素
		scores[0] = 89;//每一个元素都有自己的下标，编号，索引
		scores[1] = 89;
		scores[2] = 67;
		scores[3] = 99;
		scores[4] = 89;
		scores[5] = 34;
		scores[6] = 89;
	//	scores[7] = 56;// java.lang.ArrayIndexOutOfBoundsException:数组下标越界异常
		
		System.out.println(scores.length);
	}
}