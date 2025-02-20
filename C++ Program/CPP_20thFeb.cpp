//We are struck in explaining the class to the "Class"

#include <iostream>
using namespace std;
class math {
    int a,b;
    public : 
    math(int x, int y ) :a(x),b(y){}
    int sum() {return a+b;}
}   ;
int main() {
    math obj(5,6);
    cout<<obj.sum();
    
    return 0;
}