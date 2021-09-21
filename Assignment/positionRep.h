using namespace std;
int positionRep( )
{
	int a[5]={1,5,5,8,9};
	int num=0;
	for (int i=0;i<5;i++)
   {
       cout<<a[i]<<" ";
   }
	cout<<"enter element";
	cin>>num;
	
   cout<<"position :";
	for(int i=0;i<5;i++)
	{
		if(a[i]==num)
		{
			cout<<i+1<<" ";
		}
	}
	cout<<"\n";
	return 0;
}
