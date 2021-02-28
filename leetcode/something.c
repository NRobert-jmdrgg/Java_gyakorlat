#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <inttypes.h>
#include <stdint.h>

typedef struct largeNum {
    unsigned long long int arr[4];
} INTEGER256;


unsigned long long int factorial(int a);
int sumofdigits(long long unsigned int a);
int main() {
    
    
    

    return 0;
}

unsigned long long int factorial(int a) {
    unsigned long long int fact = 1;
    for(int i = 2; i <= a; i++) {
        fact *= i;
    }
    return fact;
}

int sumofdigits(long long unsigned int a) {
    int sum = 0;
    while(a > 0) {
        sum += a % 10;
        a /= 10;
    }
    return sum;
}