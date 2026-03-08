package Collection;

public class MyQueue {
	int[] arr;
	int size;
	int rear=0;
	int front=0;

	public MyQueue(int size) {
		this.size = size;
		arr = new int[size];
	}

	public void enqueue(int n) {
		if(rear==n-1) {
			System.out.println("overflow not possible");
			
		}
		else {
			arr[++rear]=n;		
			}
	}
	
	public int dequeue() {
		if(front>rear) {
			System.out.println("quque empty");
			return -1;
		}
		return arr[front++];
	}
	
}
