#include <iostream>
using namespace std;

int main () {
    int a;
    string s;
    int count = 0;
    cin >> a;
    cin >> s;

    for (int i = 0; i < s.length(); i++) {
        if (s[i] == s[i+1]) {
            count++;
        }
    }
    cout << count;



    // cout << s.length() << endl;   // 3
    // cout << a-1 << endl;          // 2
    // cout << a << endl;            // 3

    return 0;
}