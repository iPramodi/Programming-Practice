#include <iostream>
using namespace std;
// class MatAddd {
//     private:
//     int r,c;
//     public void matrixMaker(int r,int c){
//         int[][] arr = new int[r][c];
//     }
//     public void adder(){

//     }
// };
int main()
{
    int r, int c;
    cin >> r >> c;
    int mat1[r][c];
    int mat2[r][c];
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            int p;
            cin >> p;
            mat1[i][j] = p;
        }
    }
}