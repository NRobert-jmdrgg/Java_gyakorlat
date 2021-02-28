#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int romanToInt(char *s);
int romantodecimal(char c);
int main() {
    char num[] = "IV";
    int asd = romanToInt(num);
    printf("\n%d", asd);
    return 0;
}

int romanToInt(char *s) {
    int num = 0;
    int len = strlen(s);
    int s1, s2;
    for(int i = 0; i < len; i++) {
        s1 = romantodecimal(s[i]);
        
        printf("\nS1: %d", s1);
        if((i + 1) < len) {
            s2 = romantodecimal(s[i + 1]);
            printf("\nS2: %d", s2);
            if(s2 > s1) {
                num += s2 - s1;
                i++;
                printf("\nNUM : %d", num);
            } else {
                num += s1;
                
                printf("\nNUM : %d", num);
            }
        } else {
            num += s1;
        }
        
    }
    return num;
}

int romantodecimal(char c) {
    switch(c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
    }
}