#include <iostream>
using namespace std;

class no
{
    int value;

public:
    no(int v) : value(v) {}
    void disp() { cout << value << endl; }
    no operator-() { return no(-value); }
    no operator--() { return no(value - 1); }
    no operator++() { return no(value + 1); }
};

int main()
{
    no
        num(10);
    (-num).disp();
    (--num).disp();
    (++num).disp();
    return 0;
}