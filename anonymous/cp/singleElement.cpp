#include <iostream>
using namespace std;


int singleElement (int nums[],int n) {
    int start = 0;
    int end = n-1;
    // Basic conditions to check
    if (end == 0) {
        return nums[0];
    } else if (nums[start] != nums[start+1]) {
        return nums[start];
    } else if (nums[end] != nums[end-1]) {
        return nums[end];
    }
    // Binary search algorithm
    while (start <= end) {
        int mid = start + (end-start)/2;
        if (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
            return nums[mid];
        } else if (mid%2 == 0 && nums[mid] == nums[mid+1] || mid%2 != 0 && nums[mid] == nums[mid-1]) {
            start = mid + 1;
        } else if (mid%2 != 0 && nums[mid] == nums[mid+1] || mid%2 == 0 && nums[mid] == nums[mid-1]) {
            end = mid - 1;
        }
    }
    return -1;
}



int main() {
    int arr[] = {2,2,4,4,6,6,7,7,8,11,11};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << singleElement(arr,n) << endl;
}

