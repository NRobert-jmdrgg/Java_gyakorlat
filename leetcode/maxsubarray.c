#include <stdio.h>
#include <stdlib.h>

int maxSubArray(int* nums, int numsSize);
//[-2,1,-3,4,-1,2,1,-5,4]
int main() {
    int arr[] = {-2,-1};
    int size = sizeof(arr) / sizeof(int);

    int res = maxSubArray(arr, size);
    printf("\n\n%d", res);
    return 0;
}
//too slow
int maxSubArray(int* nums, int numsSize) {
    if(numsSize == 1) return nums[0];
    int count;
    int max = nums[0];
    for(int i = 0; i < numsSize; i++) {
        for(int k = 0; k < numsSize - i; k++) {
            count = 0;
            for(int j = i; j < numsSize - k; j++) {
                //printf("%d ", nums[j]);
                count += nums[j];
            }
            printf("\n");
            printf("count: %d", count);
            if(count > max) {
                max = count;
            }    
        }
        
    }
    return max;
}