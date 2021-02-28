#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool isValid(char *s);
/*
((())))
)(
[[]]]

*/
int main() {
    char str[] = "()[]{}";
    int resu = isValid(str);
    printf("%d", resu);
    return 0;
}
//bit better
bool isValid(char *s) {
    int len = strlen(s);
    int c1 = 0, c2 = 0, c3 = 0; 
    for(int i = 0; i < len; i++) {
        if(s[i] == ')' && !c1) {
            return false;
        } else if (s[i] == ']' && !c2) {
            return false;
        } else if (s[i] == '}' && !c3) {
            return false;
        }
        switch(s[i]) {
            case '(':
                c1++;
                break;
            case '[':
                c2++;
                break;
            case '{':
                c3++;
                break;
            case ')':
                c1--;
                break;
            case ']':
                c2--;
                break;
            case '}':
                c3--;
                break;
        }
    }
    if(c1 || c2 || c3) {
        return false;
    } else {
        return true;
    }
}