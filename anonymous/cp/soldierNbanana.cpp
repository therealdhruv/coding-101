#include <iostream>
using namespace std;

int main() {
    int k,w,n,cost = 0;


    cin >> k;
    cin >> n;
    cin >> w;

    for (int i = 1; i <= w; i++) {
        cost = cost + k*i;
    }
    
    // Check if he has to borrow or not and then do the shit
    if (cost > n) {
        cout << cost - n;
    } else {
        cout << 0;
    }

}