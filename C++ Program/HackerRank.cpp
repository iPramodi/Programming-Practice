#include <iostream>

using namespace std;

//Program to print the no. in word form from 1-9 above that print "Greate than 9"




int main()
{
  

    int x;
    cin >> x;
    if((1<=x) && (x<=9)){
        if(x==1){
            cout<<"one";
            
        }
        if(x==2){
            cout<<"two";
            
        }if(x==3){
            cout<<"three";
            
        }if(x==4){
            cout<<"four";
            
        }if(x==5){
            cout<<"five";
            
        }if(x==6){
            cout<<"six";
            
        }if(x==7){
            cout<<"seven";
            
        }if(x==8){
            cout<<"eight";
            
        }if(x==9){
            cout<<"nine";
            
        }
    }
    else {
        cout<< "Greater than 9";
    }

    return 0;
}

