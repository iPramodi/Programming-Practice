#include <iostream>
using namespace std;



class Circle {
   private: 
    double rad;
    
   public :
   void Setrad(double rad);

    double getDia();
    double getArea();
    double getCircum();

    };

   double Circle:: getDia() {
        return rad*2;

    }
    void Circle:: Setrad(double rad){
        cout << "Radius is: "<<rad;

    }

int main() {
Circle prop;
prop.Setrad(2.5);

}