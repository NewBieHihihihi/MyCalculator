package Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class qriorityQueue {
	public static void main(String[] args) {
        Queue<String> dsSV = new PriorityQueue<String>();//ưu tiên.
        dsSV.offer("Le Thi A");
		dsSV.offer("Nguyen Thanh Nhat"); 
		dsSV.offer("Dang Van B");
		//sort by first letter D -> L -> N
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
