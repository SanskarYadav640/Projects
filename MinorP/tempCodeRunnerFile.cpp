#include <iostream>
using namespace std;

class Rectangle {
    private:
    int length;
    int breadth;
    public:
    Rectangle(){length=breadth=1;}
    Rectangle(int l, int b);
    int area();
    int perimeter();
    int getLength(){return length;}
    int setlength(int l){length=1;}
    Rectangle();
}; 
