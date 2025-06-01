#include <iostream>
using namespace std;

class Fruit {
public:
    string Fname;
;
    int F_no;

    Fruit(string n, int q) {
        Fname = n;
        F_no = q;
    }

    Fruit operator+(const Fruit &other) {
        if (this->Fname
         == other.Fname
    ) {
            return Fruit(this->Fname
            , this->F_no + other.F_no);
        } else {
            throw invalid_argument("Fruits must be the same to add.");
        }
    }
};

int main() {
    Fruit fruit1("MAngo",56);
    Fruit fruit2("MAngo", 14);

    try {
        Fruit fruit3 = fruit1 + fruit2;
        cout << fruit3.Fname
     << " " << fruit3.F_no << endl;
    } catch (const invalid_argument &e) {

        
    }

    return 0;
}