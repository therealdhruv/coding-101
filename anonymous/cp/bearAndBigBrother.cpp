#include <iostream>
using namespace std;

int main () {
    int count = 0,a,b;
    cin >> a;
    cin >> b;

    while (a<=b) {
        a = a*3;
        b = b*2;
        count++;
    }
    cout << count;


}