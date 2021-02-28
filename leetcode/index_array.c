#include <stdio.h>
#include <stdlib.h>
int* createTargetArray(int* nums, int numsSize, int* index, int indexSize, int* returnSize);

int main() {
    int nums[] = {0,1,2,3,4};
    int index[] = {0,1,2,2,1};
    int *result;
    int resultsize;
    result = createTargetArray(nums, 5, index, 5, &resultsize);
    return 0;
}


/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* createTargetArray(int* nums, int numsSize, int* index, int indexSize, int* returnSize) {
    int insert;
    int *target = (int *)calloc(numsSize, sizeof(int));
    for(int i = 0; i < numsSize; i++) {
        if(target[index[i]] == 0) {
            target[index[i]] = nums[i];
        } else {
            insert = nums[i];
            for(int j = numsSize; j >= index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = insert;
        }
    }
    for(int i = 0; i < numsSize; i++) {
        printf("%d ", target[i]);
    }
    return target;
}
