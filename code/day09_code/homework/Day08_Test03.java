/*
?	��Test03���У��������·���������᷽���Ĳ������ݻ��ƣ�

1��public static  void  doubleNumber(int num)��
	���Խ�num��Ϊԭ����2���󣬿��Ƿ���Խ���num��ֵ��ʵ�α���ֵҲ����2����
	Ϊʲô��������ܣ�����ô����أ����ܣ���д�������޸�Ϊ�з���ֵ�ĺ���������ӷ���ֵ����ֱ���ڱ����õķ��������
2��public static void toUpperCase(char letter)��
	���Խ�letter��Сд��ĸתΪ��д��ĸ�����Ƿ���Խ���letter��ֵ��ʵ�α���ֵҲתΪ��д��
	Ϊʲô��������ܣ�����ô����أ����ܣ���д�������޸�Ϊ�з���ֵ�ĺ���������ӷ���ֵ
3��public static void expandCircle(Circle  c��double times)��
	���Խ�Circle��c����İ뾶����Ϊԭ����times����
	���Ƿ���Խ���c��ֵ��ʵ�ζ���İ뾶Ҳ����times����Ϊʲô��������ܣ�����ô����أ����ԣ���Ϊ���ݵĲ�����Ӧ������
4��public static void sort(int[] arr)�����Զ�arr����ʵ�ִ�С�������򣬿��Ƿ���Խ���arr��ֵ��ʵ������Ҳ����Ϊʲô��������ܣ�����ô����أ�
5��public static void concatAtguigu(String str)��������str����ƴ�ӡ�atguigu"�ַ��������Ƿ���Խ���str��ֵ��ʵ���ַ�������Ҳ�޸��ˣ�Ϊʲô��������ܣ�����ô�����
6��public static void main(String[] args)�����Ϸ�����main�е��ò���
*/
class Day08_Test03{
	public static void main(String[] args){
		int x = 1;
		//doubleNumber(x);
		x = doubleNumber(x);
		System.out.println("x = " + x);
		
		char c = 'a';
		//toUpperCase(c);
		c = toUpperCase(c);
		System.out.println(c);
		
		Circle c1 = new Circle();
		c1.radius = 1.0;
		
		expandCircle(c1, 5);
		System.out.println("�뾶��" + c1.radius);
		
		String str = "hello";
		//concatAtguigu(str);
		str = concatAtguigu(str);
		System.out.println(str);
	}
	/*͵������
	public static  void  doubleNumber(int x){
		x *= 2;
		System.out.println("x = " + x);
		System.exit(0);//�����˳�����ִ��
	}*/
	public static int doubleNumber(int num){
		return num*2;
	}
	
	//public static void toUpperCase(char letter){
	//	letter = (char)(letter - 32);
	//}
	public static char toUpperCase(char letter){
		return (char)(letter - 32);
	}
	
	public static void expandCircle(Circle  c,double times){
		c.radius *= times;
	}
	
	//������str����ƴ�ӡ�atguigu"�ַ��������Ƿ���Խ���str��ֵ��ʵ���ַ�������Ҳ�޸��ˣ�
	//Ϊʲô��������ܣ�����ô�����
	//���ܣ���ΪString���ͱȽ����⣬���Ķ����ǲ��ɱ����һ���޸ģ�����ƴ�ӣ��ͻ�����¶���
	//public static void concatAtguigu(String str){
	//	str += "atguigu";//str�޸ĺ��ָ���¶��󣬾Ͳ���ԭ����ʵ�ε��Ǹ��ַ���������
	//}
	public static String concatAtguigu(String str){
		return str += "atguigu";
	}
	
}
class Circle{
	double radius;
}