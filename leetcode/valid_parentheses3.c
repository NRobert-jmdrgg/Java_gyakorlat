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
    char str[] = "([)]";
    int resu = isValid(str);
    printf("%d", resu);
    return 0;
}

bool isValid(char *s) {
    int len = strlen(s);
    
}