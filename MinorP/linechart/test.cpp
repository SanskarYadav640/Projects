#include <iostream>
using namespace std;

class Rectangle {
    private:
    int length;
    int breadth;
    public:
    Rectangle(){length=1;breadth=1;}
    Rectangle(int l, int b);
    int area();
    int perimeter();
    int getLength(){return length;}
    void setLength(int l){length=l;}
    };