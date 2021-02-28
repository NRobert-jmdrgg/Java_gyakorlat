#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char * defangIPaddr(char * address);

int main() {
    char adr[] = "255.100.1.1";
    char *result = defangIPaddr(adr);
    
    return 0;
}
//1.1.1.1 -> 7
//1[.]1[.]1[.]1 ->13


char * defangIPaddr(char * address) {
    int length = strlen(address);
    int newlength = length;
    //counting dots
    for(int i = 0; i < length; i++) {
        if(address[i] == '.') {
            newlength += 2;
        }
    }
    //adding []s
    char *result = (char *)malloc(newlength + 1);
    int j = 0;
    for(int i = 0; i <= length; i++) {
        if(address[i] != '.') {
            result[j++] = address[i];
            
        } else {
            result[j++] = '[';
            result[j++] = '.';
            result[j++] = ']';
            
        }
    }
    
    printf("\n%s", result);
    return result;
}