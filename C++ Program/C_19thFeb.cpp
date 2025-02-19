#include <iostream>
#include <iomanip>
using namespace std;
int main() {
    /*
    // this code is for representing the values of decimal oct and hex in cpp
    int value;
    cout << "Enter number" <<endl;
    cin >> value;
    cout << "Decimal base = " << dec << value << endl;
    cout << "Hex base = " << hex << value << endl;
    cout << "Octal base = "<< oct << value << endl;
*/
    //using se base manipulator function here

   // to achieve this  we can use setbase(base)


   //displaying data var using setw manipulator

//    int valueA, valueB;
//     cout << "Enter number: " <<;
//     cin >> value>> valueB;
//     cout << "Decimal base = " << dec << value << endl;
//     cout << "Hex base = " << hex << value << endl;
//     cout << "Octal base = "<< oct << value << endl;

// using setfill
/*
    // this code is for representing the values of decimal oct and hex in cpp
    int value;
    cout << "Enter number" <<endl;
    cin >> value;
    cout << "Decimal base = " << dec << value << endl;
    cout << "Hex base = " << hex << value << endl;
    cout << "Octal base = "<< oct << value << endl;
*/
    //using se base manipulator function here

   // to achieve this  we can use setbase(base)


   //displaying data var using setw manipulator

//    int valueA, valueB;
//     cout << "Enter number: ";
//     cin >> valueA>> valueB;
//     cout << setfill('|');
//     cout << setw(5) << valueA<< setw(5) << valueB << endl;
//     cout << setw(6) << valueA<< setw(6) << valueB << endl;

/*
//THis code will set the precision to the desired precision and it will round it off mathematically
float valueA, valueB,valueC;
cout << "Enter number: ";
cin >> valueA>> valueB;
valueC = valueA / valueB;

cout << setprecision(1)<< valueC  <<endl;
cout << setprecision(2)<< valueC  <<endl;
cout << setprecision(3)<< valueC  <<endl;
cout << setprecision(4)<< valueC  <<endl;
cout << setprecision(5)<< valueC  <<endl;
*/
float valueA, valueB,valueC;
cout << "Enter number: ";
cin >> valueA>> valueB;
valueC = valueA / valueB;

cout << setprecision(1)<< valueC  <<endl;
cout << setprecision(2)<< valueC  <<endl;
cout << setprecision(3)<< valueC  <<endl;
cout << setprecision(4)<< valueC  <<endl;
cout << setprecision(5)<< valueC  <<endl;
    return 0;

}

  

