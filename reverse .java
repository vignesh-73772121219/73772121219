package beginner;
public class Basic 
{
	public static void main(String[] args) 
	{	
        String s = "hellow";
        String d = "";
        char c=0; 
        int b = s.length();
         for(int i=(b/2);i<b;i++) {
        	d=s.charAt(i)+d;	 
        }
        for(int j=0;j<(b/2);j++) {
        	 c=s.charAt(j);
             System.out.print(c);

        }
        System.out.println(d);
	}

}
