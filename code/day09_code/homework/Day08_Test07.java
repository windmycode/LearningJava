/*
?	1������������Rectangle

?	��1���������ԣ����Ϳ�Ҫ������˽�л�

?	��2�������������������޲κ��в�

?	��3����ÿһ�������ṩget/set����

?	��4��public double getArea()

?	��5��public double getPerimeter()

?	��6���ṩgetInfo()���ؾ��ζ������Ϣ

?			���磺����2����3�������6���ܳ���10

?	2��������TestRectangle
������

?	��дTest07�࣬��main�����У�

?	��1������һ��Rectangle[]���飬����Ϊ5

?	��2��������5��Rectangle�ľ��ζ��󣬷ŵ������У����εĳ��Ϳ��������[0,10.0)��Χ�ڵ�ֵ

?	��3��������ʾ

?	��4�����������С��������

?	��5���ٴα�����ʾ
*/
class Day08_Test07{
	public static void main(String[] args){
		Rectangle[] arr  = new Rectangle[5];
		for(int i=0; i<arr.length; i++){
			arr[i] = new Rectangle();
			double d1 = Math.random()*10;
			double d2 = Math.random()*10;
			arr[i].setLength(d1>d2?d1:d2);		
			arr[i].setWidth(d1<=d2?d1:d2);		
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i].getInfo());
		}
		System.out.println("------------------------");
		for(int i=1; i<arr.length; i++){
			for(int j=0; j<arr.length-i; j++){
				if(arr[j].getArea() > arr[j+1].getArea()){
					Rectangle temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i].getInfo());
		}
	}
}
class Rectangle{
	private double length;
	private double width;
	
	public Rectangle(){
		
	}
	public Rectangle(double chang, double kuan){
		length = chang;
		width = kuan;
	}
	
	public void setLength(double chang){
		length = chang;
	}
	public double getLength(){
		return length;
	}
	public void setWidth(double kuan){
		width = kuan;
	}
	public double getWidth(){
		return width;
	}
	
	public double getArea(){
		return length * width;
	}
	public double getPerimeter(){
		return 2 * (length + width);
	}
	public String getInfo(){
		return "����" + length + "����" + width + "�������" + getArea() + "���ܳ���" + getPerimeter(); 
	}
}