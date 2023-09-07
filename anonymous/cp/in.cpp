#include <iostream>
using namespace std;

int main () {

    int n,input,count = 0;
    cin >> n;

    while (n-->0) {
        cin >> input;
        if (input == 1) {
            count ++;
        }
    }

    if (count != 0) {
        cout << "HARD"; 
    } else {
        cout << "EASY";
    }


}