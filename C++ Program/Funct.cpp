#include <iostream>
using namespace std;



class Circle {
   private: 
    double rad;
    
    
  public:

   void Setrad();

    double getDia();
    double getArea();
    double getCircum();

    };

   double Circle:: getDia() {
       cout <<"The diameter is: ";
        return rad*2;

    }
    void Circle:: Setrad(){
        cout << "Desiered Radius is: ";
        cin >> rad;

    }
    double Circle:: getArea() {
        cout <<"Area is: ";
        return rad*rad*3.14;
    }

int main() {
Circle prop;
//prop.i = 2.455;
prop.Setrad();
cout << "\n";
double a = prop.getDia();
cout <<"\n"<< a;
printf("\nDiameter is : %.2f",a);



}