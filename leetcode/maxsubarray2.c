#include <stdio.h>
#include <stdlib.h>

#define MAX(A,B) (((A)>(B))?(A):(B))

int maxSubArray(int* nums, int numsSize);
//[-2,1,-3,4,-1,2,1,-5,4]
int main() {
    int arr[] = {-2,-1};
    int size = sizeof(arr) / sizeof(int);

    int res = maxSubArray(arr, size);
    printf("\n\n%d", res);
    return 0;
}
//meme solution 
int maxSubArray(int* nums, int numsSize) {
    if(numsSize == 1) return nums[0];
    int temp = nums[0], max = 0;
    
    for(int i = 0; i < numsSize; i++) {
        max += nums[i];
        if(max < nums[i]) {
            max = nums[i];
        } 
        if(max > temp) {
            temp = max;
        }
    }
    return temp;
}