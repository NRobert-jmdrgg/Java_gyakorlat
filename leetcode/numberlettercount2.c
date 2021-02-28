#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int numbersToString(int a);

int main() {
    int count = 0;

    for(int i = 1; i <= 1000; i++) {
        count += numbersToString(i);
    }
    printf("\n%d", count);

    return 0;
}

int numbersToString(int a) {
    char str[50];
    char *nums[9] = {"one", "two", "three", "four", "five", "six", "seven", 
                       "eight", "nine"};
    char *nums2[10] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", 
                        "sixteen", "seventeen", "eighteen", "nineteen"}; 
    char *nums3[8] = {"twenty", "thirty", "forty", "fifty", "sixty", 
                        "seventy", "eighty", "ninety"};

    if(a == 1000) {
        strcpy(str, "onethousand");
        printf("\n%s", str);
        return strlen(str);
    }
    int temp, temp2;
    if(a < 1000 && a >= 100) {
        temp = a / 100;
        strcpy(str, nums[temp - 1]);
        strcat(str, "hundred");
        temp = (a % 100) / 10;
        temp2 = a % 10;
        if(temp != 0) {
            strcat(str, "and");
            if(temp == 1) {
                strcat(str, nums2[temp2]);
            } else {
                strcat(str, nums3[temp - 2]);
                if(temp2 != 0) {
                    strcat(str, nums[temp2 - 1]);
                }
            }
        } else {
            if(temp2 != 0) {
                strcat(str, "and");
                strcat(str, nums[temp2 - 1]);
            }
        }
        printf("\n%s", str);
        return strlen(str);
    }
    if(a < 100 && a >= 10) {
        temp = a / 10;
        temp2 = a % 10;
        if(temp != 1) {
            strcpy(str, nums3[temp - 2]);
            if(temp2 != 0) {
                strcat(str, nums[temp2 - 1]);
            }
        } else {
            strcpy(str, nums2[temp2]);
        }
        printf("\n%s", str);
        return strlen(str);
    }

    strcpy(str, nums[a - 1]);
    printf("\n%s", str);
    return strlen(str);
}