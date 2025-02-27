#include <iostream>
#include <fstream>

using namespace std;
// int main() {
//    ofstream x("demo.txt");
//    x<<"Hello";

//    x.close();
   
//    return 0;
int main(){

  ofstream fout;
  fout.open("Country");
  fout<<"usa\n";
  fout<<"uk\n";
  fout<<"india\n";
  fout.close();

  fout.open("capital");
  fout<<"Washinton\n";
  fout<<"london\n";
  fout<<"INdia\n";
  fout.close();

  const int n= 180;
  char line[n];
  ifstream fin;
  fin.open("countr");
  cout << "context of country file";
  while(fin){
    fin.getline(line,n);
    cout << line;

  }
  fin.close();

  fin.open("capital");
  cout<<"context of capital file.:";
  while (fin){
    fin.getline(line,n);
    cout<< line;

  }
  fin.close();
  

}



