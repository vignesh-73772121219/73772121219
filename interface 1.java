
interface resize{
	public void height(int h);
	public void width(int w);
}
public class jackrose implements resize{
	public void height(int h) {
		h=8;
		System.out.println(h);
	}
	public void width(int w) {
		w=7;
		System.out.println(w);
	}
	public static void main(String[] args) {
		jackrose ob= new jackrose();
		ob.height(6);
		ob.width(4);
	}
}
