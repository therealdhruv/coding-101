#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n,x,ones = 0,twos = 0,threes = 0,fours = 0;
    cin >> n;
    while (n-->0) {
        cin >> x;
        if (x == 1) {
            ones++;
        } else if (x == 2) {
            twos++;
        } else if (x == 3) {
            threes++;
        } else {
            fours++;
        }
    }
    float t = ones*1 + twos*2 + threes*3 + fours*4;
    float ans = t/4;
    cout << ceil(ans);
}