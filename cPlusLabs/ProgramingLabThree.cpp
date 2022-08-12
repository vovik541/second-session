// ProgramingLabThree.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
#include <math.h>
using namespace std;

class Vector {  
private:
    double endCoordinateX;        // Attribute (int variable)
    double endCoordinateY;
public:             // Access specifier
     // Attribute (string variable)
    Vector(double x, double y) {
        this->endCoordinateX = x;
        this->endCoordinateY = y;
    }

    double countLength() {  // Method/function defined inside the class
        return sqrt(pow(this->endCoordinateX - 0, 2) + pow(this->endCoordinateX - 0, 2));
    }
    double getEndCoordinateX() {
        return this->endCoordinateX;
    }
    double getEndCoordinateY() {
        return this->endCoordinateY;
    }
    void setEndCoordinateX(double x) {
        this->endCoordinateX = x;
    }
    void setEndCoordinateY(double y) {
        this->endCoordinateY = y;
    }
};
Vector operator - (Vector V1, Vector V2)
{
    return Vector(V1.getEndCoordinateX() - V2.getEndCoordinateX(), V1.getEndCoordinateY() - V2.getEndCoordinateY());
}
Vector operator * (Vector V, int multipayer)
{
    return Vector(V.getEndCoordinateX() * multipayer, V.getEndCoordinateY()*multipayer);
}

Vector getVector(string message);
void printVectorCoordinats(Vector vector, string message);
void printVectorLength(double length, string message);

int main()
{
    Vector V1 = getVector("Input V1 coordinates");
    V1 = V1 * 2;
    cout << "x: " << V1.getEndCoordinateX() << " y: " << V1.getEndCoordinateY() << endl;
    printVectorCoordinats(V1, "V1 was multiplied by 2:");
    Vector V2 = getVector("Input V2 coordinates");

    Vector V3 = V1 - V2;
    printVectorCoordinats(V3, "V3 coordinates after V1 - V2:");

    double length = V3.countLength();
    printVectorLength(length, "V3 length is");
}

Vector getVector(string message)
{
    double x, y;

    cout << message << endl;
    cout << "Enter x: ";
    cin >> x;
    cout << "Enter y: ";
    cin >> y;

    return Vector(x, y);
}
void printVectorCoordinats(Vector vector, string message) {
    cout << message << endl;
    cout << "x: " << vector.getEndCoordinateX() << " y: " << vector.getEndCoordinateY() << endl;
}
void printVectorLength(double length, string message) {
    cout << message << endl;
    cout << "length: " << length << endl;
}
