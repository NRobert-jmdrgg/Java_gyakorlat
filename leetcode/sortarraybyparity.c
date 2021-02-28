#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int* sortArrayByParity(int* A, int ASize, int* returnSize);
int main() {
    int returnsize;
    int arr[] = {3,1,2,4};
    int arrsize = 4;
    int *a = sortArrayByParity(arr, arrsize, &returnsize);
    for(int i = 0; i < 4; i++) {
        printf("%d ", a[i]);
    }
    return 0;
}

int* sortArrayByParity(int* A, int ASize, int* returnSize) {
    int *result = (int *)malloc(4*ASize);
    int l = 0, r = ASize -1;
    *returnSize = ASize;
    for(int i  = 0; i < ASize; i++) {
        if(A[i] % 2 == 0) {
            result[l++] = A[i];
        } else {
            result[r--] = A[i];
        }
    }
    return result;
}