#include <iostream>
using namespace std;

class ClassRoom{
private:
    string Projector;
    string cctv;
public:
void inpt();
void show();


};
void ClassRoom::inpt(){
   cout<< "Enter the Projector Brand: ";
   cin >> Projector;
   cout <<"Enter your Footage timing : ";
   cin >> cctv;


}
void ClassRoom::show(){
    cout << "Your Projector is of: "<<Projector<<" brand";
    cout <<"\nYour cctv footage at time "<< cctv;

}

int main() {
    ClassRoom cls;
    cls.inpt();
    cls.show();
    
    
}