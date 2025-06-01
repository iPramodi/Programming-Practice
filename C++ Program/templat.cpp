#include <iostream>
//template <class T1 , class T2>

// class Test{
//     T1 a;
//     T2 b;
//    public : 
//    Test(T1 x, T2 y )
//    {a =x;b=y;}
//    void show()
//    {
//     cout << a << "and" << b;
//    }
// };

// int main() {
//     Test <float,int> test1(1.23,12);
//     Test <int,char> tset2(20,'z');
//     test1.show();
//     test2.show();
    
//     return 0;
//}
// using namespace std;

// template <class T>
// void sp(T &x, T &y){
// T temp = x;
// x=y;
// y = temp;

// }
// void fun1(int m, int n)
// {
//     cout << "before swap: "<<m<<<" "<< n<< endl;
//     sp(m,n);
//     cout << "m and n"
// }
// template <class T1, class T2>
// void display(T1 x, T2 y)
// {
//     cout << x  << " "<<y << "\n";
// }
// int main(){
//     display(10,25.34);
//     display("asdf",200);
//     return 0;

// }
// using namespace std;
// template < class T>
// void display(T x){
//     cout << "TEmplate: " << x<< endl;

// }
// void display(int x){
//     cout<< "Explici: " << x<< endl;


// }
// int main() 
// {
//     display(100);
//     display(56.78);
//     display('a');
//     return 0;
// }
using namespace std;
 template <class T>
 class mypair {
    T a, b;
    public :
    mypair (T first, T second)
    {a = first}
 }