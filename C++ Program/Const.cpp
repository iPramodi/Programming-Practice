#include <iostream>
using namespace std;
class cn{
    int dm1,dm2;
    public :
    //constructor
    cn() {cin>> dm1>>dm2;}
  //  cn() {cout <<"HI i am pramod "<<endl;}
   // void inti() {cin >>dm1>>dm2;}
    void shw_dm_val(){
        cout << dm1<<" " <<dm2 <<endl;
    }

};

int main() {
    cn obj,v,f,b;
  //  obj.inti();
    obj.shw_dm_val();
    v.shw_dm_val();
    f.shw_dm_val();
    b.shw_dm_val();


    return 0;
}