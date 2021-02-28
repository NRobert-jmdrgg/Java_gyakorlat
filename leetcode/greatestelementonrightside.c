

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* replaceElements(int* arr, int arrSize, int* returnSize){
    *returnSize = arrSize;
    
    int *result = (int *)malloc(arrSize*sizeof(int));
    if(arrSize == 1) {
        result[0] = -1;
        return result;
    }
    int i = 0;
    int max;
    while(i < arrSize - 1) {
        max = arr[i + 1];
        for(int j = i + 1; j < arrSize; j++) {
           if(arr[j] > max) {
                max = arr[j];
            }
        }
        result[i] = max;
        i++;
    }
    result[i] = -1;
    return result;
    
}