using namespace std;
int position( )
{
	int a[5]={1,4,5,9,10};
	int num=0;
		for (int i=0;i<5;i++)
   {
       cout<<a[i]<<" ";
   }
		cout<<"enter element";
	cin>>num;
	cout<<"\n";

	for(int i=0;i<5;i++)
	{
		if(a[i]==num)
		{
			cout<<"position is "<<i+1<<"\n";
		}
	}
	cout<<"\n";
	return 0;
}


