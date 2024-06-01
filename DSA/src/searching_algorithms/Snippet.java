package searching_algorithms;

public class Snippet {
	int binary_search(int a[],int start,int end,int key)
	
	{
	
	if(start<=end)
	
	{
	
	int mid=(start+end)/2;
	
	if(a[mid]==key)
	
	               return(mid);//position
	
	       else
	
	               {
	
	                   if(key<a[mid])
	
	                           return binary_search(a,start,mid-1,key);
	
	                   else
	
	                           return binary_search(a,mid+1,end,key);
	
	               }
	
	}
	
	else
	
	       return(-1);
	
	}
}

