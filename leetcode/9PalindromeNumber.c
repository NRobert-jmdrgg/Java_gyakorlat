#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define ABS(X) (X)<0 ? (X)*(-1) : (X)
bool isPalindrome(int x);


int main() {
    printf("\n%d",isPalindrome(10));
    
    return 0;

}

bool isPalindrome(int x) {
    if(x < 0  || (x % 10 == 0 && x != 0)) {
        return false;
    }
    int temp = 0;
    while(x > temp) {
        temp *= 10;
        temp += x % 10;
        x /= 10;
    }
    printf("%d %d", x, temp);
    if(x == temp || x == temp / 10) {
        return true;
    } else { return false; }
}

