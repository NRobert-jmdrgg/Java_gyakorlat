#include <stdio.h>
#include <stdlib.h>
int repeatedNTimes(int* A, int ASize);
int main() {
    int arr[] = {1,2,3,3};
    int r = repeatedNTimes(arr, 4);
    printf("%d", r);
    return 0;
}

int repeatedNTimes(int* A, int ASize) {
    int n = ASize / 2;
    int i = 0;
    int num;
    int count;
    int found = 0;
    int result;
    while(i < ASize && !found) {
        count = 1;
        num = A[i];
        for(int j = i + 1; j < ASize; j++) {
            if(A[j] == num) {
                count++;
            }
        }
        if(count == n) {
            found = 1;
            result = A[i];
        }
        i++;
    }
    return result;
}