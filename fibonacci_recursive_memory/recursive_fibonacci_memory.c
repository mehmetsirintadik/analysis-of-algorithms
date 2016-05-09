#include <stdio.h>
#include <stdlib.h>

int fibonacci(int indeks,int *bellek){
    
    if(bellek[indeks] == -1)
	{
    	bellek[indeks] = fibonacci(indeks-1,bellek) + fibonacci(indeks-2,bellek);
	}
	
    return bellek[indeks];
}

int main(int argc, char *argv[])
{
	int *bellek=malloc(sizeof(int)*11);
	int i;
	bellek[0]=0;
	bellek[1]=1;
	
	for(i=2;i<11;i++){
    	bellek[i]=-1;
	}
	
	printf("%d\n",fibonacci(10,bellek));
	system("PAUSE");	
  	return 0;
}
