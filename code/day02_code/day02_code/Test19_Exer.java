//2����������int���͵ı�����x,y,z�����⸳ֵ����ֵ�������ֵ
class Test19_Exer{
	public static void main(String[] args){
		int x = 23;
		int y = 34;
		int z = 49;
		
		//int max = x>=y ? x : y;//���������max�д����x��y�е����ֵ
		//max = max >=z ? max : z;//���µ�max��z�Ƚ�
		
		int max = (x>=y ? x : y) >= z ? (x>=y ? x : y) : z;
		System.out.println("max = " + max);
		
		
	}
}