#include <iostream>
#include <iomanip>
using namespace std;
int main() {
    cout <<"Hello"<<endl;
    //seting the width to 10 for the next output
    cout << setw(10) <<42 << endl;
    //setting the precision to 3 for floating point numbers
    cout << setprecision(3) << 3.14159 <<endl;
    cout<< fixed <<3.14159<<endl;
    //use scientific notation
    cout << scientific <<3.14159 <<endl;
    cout<< showpoint << 42.0;

    return 0;
}