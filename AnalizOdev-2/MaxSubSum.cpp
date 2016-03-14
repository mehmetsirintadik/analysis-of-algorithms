#include <iostream>
#include <vector>
#include <time.h>
#include <stdlib.h>
#include <ctime>
using namespace std;

int maxSubSum1( const vector<int> & a )
{
    int maxSum = 0;

    for( int i = 0; i < a.size( ); i++ )
        for( int j = i; j < a.size( ); j++ )
        {
            int thisSum = 0;

            for( int k = i; k <= j; k++ )
                thisSum += a[ k ];

            if( thisSum > maxSum )
                maxSum   = thisSum;
        }

	//cout<<maxSum<<endl;
    return maxSum;
}
int maxSubSum2( const vector<int> & a )
{
    int maxSum = 0;

    for( int i = 0; i < a.size( ); i++ )
    {
        int thisSum = 0;
        for( int j = i; j < a.size( ); j++ )
        {
            thisSum += a[ j ];

            if( thisSum > maxSum )
                maxSum = thisSum;
        }
    }
	//cout<<maxSum<<endl;
    return maxSum;
}
int main()
{
	vector <int> vec;
	srand (time(NULL));
	int N=50;
	
	for (int i=0; i<N;i++){
		int r1 = rand() % 20 -10;
		vec.push_back(r1);
	}
//	time_t start, end;
//	time (&start);	
//	for (int i=0;i<N;i++){
//		maxSubSum1(vec);
//	}
//	time(&end) ;
//	long dif = end-start;
//	cout<<"Gecen Sure MaxSubSum1 : "<<dif<<endl;


//	time (&start);	
//	for (int i=0;i<N;i++){
//		maxSubSum2(vec);
//	}
//	time(&end) ;
//	long dif2 = difftime (end,start);
//	cout<<"Gecen Sure MaxSubSum2 :  "<<dif2<<endl;
	
	clock_t start1 = clock();	
	for (int i=0;i<N;i++){
		maxSubSum1(vec);
	}
	cout<<"MaxSum1: "<< (float)(clock() - start1)/CLOCKS_PER_SEC;

	clock_t start2 = clock();	
	for (int i=0;i<N;i++){
		maxSubSum2(vec);
	}
	cout<<"MaxSum2: "<< (float)(clock() - start2)/CLOCKS_PER_SEC;
	
	return 1;
}

