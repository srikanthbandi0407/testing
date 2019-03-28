package oops;

public class singleinhertitance {

	public static void main(String[] args) {
		
		a s=new a();
		s.cc();
	}

}

class a extends b {
	
	public void AA()
	{
		System.out.println("A class");
		System.out.println("srikanth");
	}}


	
	class b extends c{
		
		public void BB()
		{
			System.out.println("B class");
		}
}
class c{
		
		public void cc()
		{
			System.out.println("c class");
		}
}