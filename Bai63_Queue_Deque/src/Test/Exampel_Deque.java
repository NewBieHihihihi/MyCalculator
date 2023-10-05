package Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Exampel_Deque {
	public static void main(String[] args) {
		Deque<String> dsSV = new ArrayDeque<String>();
		dsSV.offer("Cristiano Ronaldo");
		dsSV.offer("PéLe");
		dsSV.offerFirst("Lionel Messi");
		dsSV.offer("Ronaldo delima");
		dsSV.offer("Maradona");
		dsSV.offer("Zidine Zidane");
		dsSV.offerLast("Ronaldinho gáucho");
		while(true)
		{
			System.out.println(dsSV.poll());
			if(dsSV.isEmpty())
			{
				break;
			}
		}
	}
}
