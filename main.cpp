#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;


int position( )
{
	int a[5]={1,4,5,9,10};
	int num=0;
	cin>>num;
	for (int i=0;i<5;i++)
   {
       cout<<a[i]<<" ";
   }
	for(int i=0;i<5;i++)
	{
		if(a[i]==num)
		{
			cout<<"position is "<<i+1<<"\n";
		}
	}
	return 0;
}

int ascending()
{
	cout<<"Ascending order for";
	int i,j,temp=0;
   int arr[5]={1,5,10,8,9};
   for (int i=0;i<5;i++)
   {
       cout<<arr[i]<<" ";
   }
   cout<<" is :";
   for(i=0;i<5;i++)
	{		
		for(j=i+1;j<5;j++)
		{
			if(arr[i]>arr[j])
			{
				temp  =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
   
   for (int i=0;i<5;i++)
   {
       cout<<arr[i]<<" ";
   }
   return 0;
}
int main(int argc, char** argv) {
	
	position();
	ascending();
	return 0;
}
