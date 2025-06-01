#include <iostream>
using namespace std;

class Calculator {
public:
  
    int add(int a, int b) {
        return a + b;
    }

   
    float add(float a, float b) {
        return a + b;
    }

   
    int add(int a, int b, int c) {
        return a + b + c;
    }
};

int main() {
    Calculator calc;
    cout << "Sum of 2 and 3: " << calc.add(2, 3) << endl;
    cout << "Sum of 2.5 and 3.5: " << calc.add(2.5f, 3.5f) << endl;
    cout << "Sum of 1, 2, and 3: " << calc.add(1, 2, 3) << endl;
    return 0;
}
