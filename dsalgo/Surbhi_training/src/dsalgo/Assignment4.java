package dsalgo;

public class Assignment4 extends Queue {
	int front,rear;
	int size;
	int[] stack;
	int s1,s2;
	int[] m1;
	int[] m2;
	
	

	Assignment4(int[] stack,int size)
	{
		super(size);
		this.size=size;
		stack=new int[size];
		this.stack=stack;
	}
	public void smallest()
	{
		int[] stack1=stack;
		int temp=0;
		for (int i=0;i<size;i++)
		{
			for (int j=i+1;j<size;j++)
			{
				if (stack1[i]>stack1[j])
				{
					temp  =stack1[i];
					stack1[i]=stack1[j];
					stack1[j]=temp;
				}
			}
		}
		s1=stack1[0];
		s2=stack1[1];
		System.out.println("smallest"+s1+" "+s2);
	}
	public void multiples(int s)
	{
		m1=new int[size];
		for (int i=0;i<size;i++)
		{
			if(stack[i]%s==0)
			{
				Queue q =new Queue(size);
				
			}
		}
	}

}
