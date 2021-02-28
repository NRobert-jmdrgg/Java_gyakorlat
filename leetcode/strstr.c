#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int strStr(char * haystack, char * needle);

int main() {
    int a = strStr("hello", "ll");
    printf("%d", a);
    return 0;
}

int strStr(char * haystack, char * needle) {
    int haystackLength = strlen(haystack);
    int needleLength = strlen(needle);
    if(needleLength > haystackLength) return -1;
    if(needleLength == 0) return 0;
    int j, k, found, index;
    for(int i = 0; i < haystackLength; i++) {
        if(haystack[i] == needle[0]) {
            found = 1;
            index = i;
            j = i + 1;
            k = 1;
            while(k < needleLength && found) {
                if(haystack[j] != needle[k]) {
                    found = 0;
                }
                k++;
                j++;
            }
            if(found) {
                return index;
            }
        }
    }
    return -1;
}