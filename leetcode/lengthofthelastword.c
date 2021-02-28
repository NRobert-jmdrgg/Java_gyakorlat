#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int lengthOfLastWord(char *s);

int main() {
    char str[] = "a ";
    int r = lengthOfLastWord(str);
    printf("%d", r);
    
    return 0;
}

int lengthOfLastWord(char *s) {
    int len = strlen(s);
    if(!len) return 0;
    if(len == 1 && s[0] == ' ') return 0;
    
    int end = len - 1;
    while(end >= 0 && s[end] == ' ') end--;

    int count = 0;
    int i = end;
    while(i >= 0 && s[i] != ' ') {
        count++;
        i--;
    }
    return count;
}