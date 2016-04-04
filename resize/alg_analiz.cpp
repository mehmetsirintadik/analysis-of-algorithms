#include <cstdlib>
#include <iostream>
using namespace std;
class dynamicArray
{
      public:
         int sayac;
         dynamicArray (int initSize =0): theSize(initSize),thecapacity(initSize+10),s(0)
      {
         sayac=0;
         sayilar=new int[thecapacity];
      }
      int size(){return thecapacity;};
      void add(int x)
      {
           if(s==size())resize();
           sayilar[s]=x;
           s++;
      }
      int resize()
      {
          cout<<"----------------------"<<endl;
          cout<<"yer degisimi yapiliyor"<<endl;
          cout<<"----------------------"<<endl;
      int s=theSize;
      int *eskisayilar=sayilar;
      sayac++;
      float artimKatsayisi=5 ;
      sayilar=new int[ int(thecapacity*artimKatsayisi)];
      for(int k=0;k<s;k++)
          sayilar[k]=eskisayilar[k];
          theSize=s;
          thecapacity=int(thecapacity*artimKatsayisi);    
      }
      private:
              int theSize;
              int s;
              int thecapacity;
              int *sayilar;
              
};


int main(int argc, char *argv[])
{
    dynamicArray myD=dynamicArray(0);
    int sayac=0;
    for(int k=0;k<100000;k++)
     myD.add(4);
     sayac++;
    cout<<"size= "<<myD.size()<<endl;
    cout<<"sayac= "<<myD.sayac<<endl;
    system("PAUSE");
    return EXIT_SUCCESS;
}
