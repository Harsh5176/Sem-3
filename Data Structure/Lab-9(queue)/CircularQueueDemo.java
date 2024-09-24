import java.util.*;
class CircularQueueDemo{
	int f=-1;
	int r=-1;
	public void cq_insert(int[] queue,int data){
	
		if(r==queue.length-1){
			r=-1;
		}
		r=r+1;
		if(r==f){
			System.out.println("Queue Overflow:");
			return;
		}
		queue[r]=data;
		if(f==-1){
			f=0;
			return;
		}
	}

	public void cq_enqueue(int[] queue,int data){
		if((r+1)%(queue.length)==f){
			System.out.println("overflow");
			return;
		}
		else{
			r=(r+1)%queue.length;
		}
		queue[r]=data;
		if(f==-1){
			f=0;
		}
	}
	public int cq_delete(int[] queue){
		if(f==-1){
			System.out.println("Queue Underflow:");
			return -1;
		}
		int y=queue[f];
		if(f==r){
			f=r=-1;
		}
		if(f==queue.length-1){
			f=-1;
		}
		else{
			f=f+1;
		}
		return y;
	}

	public int cq_dequeue(int[] queue){
		if(f==-1){
			System.out.println("Queue Underflow");
			return -1;
		}
        int y=queue[f];
		if(f==r){
			f=r=-1;
		}
		else{
			f=f+1;
		}
		return y;
	}
	public void display(int[] queue){
		int i=f;
		for(i=f;i!=r;i=((i+1)%queue.length)){
			System.out.println("Queue["+i+"]:"+queue[i]);
		}
		System.out.println("queue["+i+"]:"+queue[i]);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=2;
		int queue[]=new int[n];
		CircularQueueDemo q1=new CircularQueueDemo();
		q1.cq_insert(queue,10);
		q1.cq_insert(queue,20);
		q1.cq_insert(queue,30);
		q1.cq_insert(queue,40);
		q1.cq_insert(queue,50);
		
		q1.cq_delete(queue);
		q1.cq_delete(queue);
	
		q1.cq_insert(queue,60);
		q1.cq_insert(queue,70);
		q1.cq_insert(queue,80);
		q1.display(queue);

	}
}
