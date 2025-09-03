package strings;
import java.util.Scanner;
public class ShortestLongest{
	public static void main( String arg[]) {
		Scanner sc=new Scanner(System.in);
		//StringBuilder str=new StringBuilder(sc.nextLine());
		String str= sc.nextLine();
		String arr[]=str.split("\\s+");
		String sm=arr[0];
		String lar=arr[0];
		for(int i=0;i<arr.length-1;i++) {
		    //  System.out.println(arr[i]);
		      if(arr[i+1].length()<sm.length()) {
		    	  sm=arr[i+1];
		      }
		      if(arr[i+1].length()>lar.length()) {
		    	  lar=arr[i+1];
		      }
		
		
	     }
		 System.out.println("smallest string"+" "+sm );
		 System.out.println("largest string"+" "+lar );
	}
	
}