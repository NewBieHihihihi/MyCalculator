package Test;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
		Queue<String> dsSV = new LinkedList<String>();
		dsSV.add("Hihi");
		dsSV.offer("Nguyen Thanh Nhat");//Put in dsSV index 
		dsSV.offer("Nguyen Thi A");
		dsSV.offer("Nguyen Van B");
		while(true)
		{
		   System.out.println(dsSV.poll());
		   //poll => Put out but deleted.
		   //peek => Put out but not deleted.
		   if(dsSV.isEmpty())//if dsSV empty => break
		   {
			break;
		   }
		}
	}
}
