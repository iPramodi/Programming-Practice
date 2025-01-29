#include <iostream>
using namespace std;
class abc{
    int x,y;
    public:
    void in();
    void out();

};
void abc::in(){cin >> x;}
void abc::out(){cout<<x;}
int main() {
   abc a;
   abc b;

   a.in();   b.in();
   a.out(); 
   cout <<"\n";
 b.out();
    

    return 0;
}