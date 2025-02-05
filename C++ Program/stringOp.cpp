#include <iostream>
#include <iomanip>
using namespace std;
int main() {
    /*
    char c1, c2, c3;
  //  input skips whitespce by default 
    cin >> c1;
  //  by this if don't skip white spaces so the input should be without whitespace
  //  cin >> noskipws >> c2;
  //  by this it will willingly take white space in input

    
    cin>>c1>>ws>>c2>>ws>>c3;
    cout<<" c1: "<<c1<<" c2: "<<c2<<" c3: "<<c3;

*/
bool value = true;
 //Display boolean as true/false

 cout << boolalpha << value <<endl;
 //Display boolean as 1/0
 cou t << noboolalpha << value;

   

    return 0;
}