#include <stdio.h>
int main()
{
	int n,a[n],i,sum=0;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d",&a[i]);
	    sum=sum+a[i];
	}
	printf("%d",sum);
	return 0;
}
