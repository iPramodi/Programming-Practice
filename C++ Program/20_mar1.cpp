#include <iostream>
using namespace std;
class abc {int a,b;
public :
void in(){
    cin  >> a>>b;
}

    void out() {cout <<a <<" "<<b;
    }
    void operator ++(){
        a++;b++;

    }

};

int main() {
abc q; q.in();
q.out();
-q;
q.out();

    return 0;
}