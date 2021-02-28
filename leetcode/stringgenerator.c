#include <stdio.h>
#include <stdlib.h>
char * generateTheString(int n);
int main() {
    int n = 4;
    generateTheString(n);
    return 0;
}

char * generateTheString(int n) {
    char *result = (char *)malloc(n + 1);
    char c = 'a';
    int i;
    if(n % 2 == 0) {
        for(i = 0; i < n - 1; i++) {
            result[i] = c;
        }
        result[i] = ++c;
        result[i + 1] = '\0';
        printf("\n%s", result);
    } else {
        for(i = 0; i < n; i++) {
            result[i] = c;
        }
        result[i] = '\0';   
        printf("\n%s", result);
    }

    return result;
    
}