/*
* These are all ChatGPT questions Which I will be solving
*
* ✅ Write a class Student with rollNo, name, and marks, demonstrating cin, cout, and inline/non-inline/static member functions.
*
*/

#include <iostream>
using namespace std;
class Student {
    private:
    int rollNo;
    string name; double marks;
  static int count; //We can only declare the static variable inside a class can't define it inside the class
    public:
    void getter(){
     cout << "Enter the rollNo. , Name and marks of the student: ";
     cin >> rollNo >> name >> marks;
     count ++;
    }
    void putter();
    static void counter(){
        cout <<count ;
    }


};
int Student::count =0;

void Student::putter(){
cout << rollNo << endl<<name <<endl<< marks<<endl;

cout<< "The student count is: "<<count<< endl;

}


int main() {
    Student a,b;

    a.getter();
    b.getter();

    a.putter();
    b.putter();

    Student::counter();
    return 0;
}