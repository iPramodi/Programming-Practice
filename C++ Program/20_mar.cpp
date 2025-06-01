#include <iostream>
#include <fstream>
using namespace std;
int main() {
	int writePos;
    fstream file("abc.txt", ios::in | ios::out);
    writePos = file.tellp(); cout <<"write pos: "<< writePos<<endl;
	// Writing to the file
    file << "Hello, this is a test file.";
    // Checking position after writing : 27 in this case
    writePos = file.tellp(); cout <<"write pos: "<< writePos<<endl;
	// Moving the write pointer
    file.seekp(7, ios::beg); // Move to the 7th position from the beginning
    cout << "Write pointer moved to position: " << file.tellp() << endl;
    // Writing at new position
    file << "";
    // Resetting file pointer for reading
    file.seekg(0, ios::beg);
    // Reading the modified file content
    string content;
    cout << endl;
    // Checking read position
    int readPos = file.tellg();
    cout << "Current read position: " << readPos << endl;
    // Moving the read pointer
    file.seekg(0, ios::beg); // Move to the beginning
    cout << "Read pointer moved to position: " << file.tellg() << endl;
    // Closing the file
    file.close();
    return 0;
}


//File random access: with file pointers