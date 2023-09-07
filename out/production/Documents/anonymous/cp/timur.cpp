#include <iostream>
#include <algorithm>
using namespace std;
 
int main() {
 
    string name = "Timur";
    sort(name.begin(),name.end());
 
    int t,n;
    string s;
    cin >> t;
 
 
    while (t-->0) {
        cin >> n;
        cin >> s;
        sort(s.begin(),s.end());
        cout << (s == name ? "YES" : "NO") << endl;
    }
}