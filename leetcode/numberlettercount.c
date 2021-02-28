#include <stdio.h>
#include <stdlib.h>

/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) 
contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
The use of "and" when writing out numbers is in compliance with British usage.
*/
int lettercounter(int a);
int numberToLetterCount(int a);

int main() {
    long long int count = 0;

    for(int i = 1; i <= 1000; i++) {
        count += lettercounter(i);
    }
    printf("\n%d", count);
    

    return 0;
}

int lettercounter(int a) {
    int count = 0;
    //one thousand 11
    if(a == 1000) {
        return 11;
    }
    int temp, temp2;
    //hundred
    if(a < 1000 && a >= 100) {
        temp = a / 100;
        count += numberToLetterCount(temp);
        count += 7;
    
        temp = (a % 100) / 10; 
    
        switch(temp) {
            //teen
            case 1:
                count += 3;
                temp2 = a % 10;
                switch(temp2) {
                    //ten
                    case 0:
                        count += 3;
                        break;
                    //eleven
                    //twelve
                    case 1:
                    case 2:
                        count += 6;
                        break;
                    //thirteen
                    //fourteen
                    //eighteen
                    //nineteen
                    case 3:
                    case 4:
                    case 8:
                    case 9:
                        count += 8;
                        break;
                    //fifteen
                    //sixteen
                    case 5:
                    case 6:
                        count += 7;
                        break;
                    //seventeen
                    case 7:
                        count += 9;
                        break;
                }
                break;
                //twenty
                //thirty
                //eighty
                //ninety
            case 2:
            case 3:
            case 8:
            case 9:
                count += 3;
                count += 6;
                temp2 = a % 10;
                count += numberToLetterCount(temp2);
                break;
            //forty
            //fifty
            //sixty
            case 4:
            case 5:
            case 6:
                count += 3;
                count += 5;
                temp2 = a % 10;
                count += numberToLetterCount(temp2);
                break;
            //seventy
            case 7:
                count += 3;
                count += 7;
                temp2 = a % 10;
                count += numberToLetterCount(temp2);
                break;
            case 0:
                
                temp2 = a % 10;
                if(temp2 != 0) {
                    count += 3;
                }
                count += numberToLetterCount(temp2);            
        }
        return count;
    }
    
    //tens
    if(a < 100 && a >= 10) {
        temp = a / 10;
        switch(temp) {
            //teen
            case 1:
                temp2 = a % 10;
                switch(temp2) {
                    //ten
                    case 0:
                        count += 3;
                        break;
                    //eleven
                    //twelve
                    case 1:
                    case 2:
                        count += 6;
                        break;
                    //thirteen
                    //fourteen
                    //eighteen
                    //nineteen
                    case 3:
                    case 4:
                    case 8:
                    case 9:
                        count += 8;
                        break;
                    //fifteen
                    //sixteen
                    case 5:
                    case 6:
                        count += 7;
                        break;
                    //seventeen
                    case 7:
                        count += 9;
                        break;
                }
                break;
                //twenty
                //thirty
                //eighty
                //ninety
            case 2:
            case 3:
            case 8:
            case 9:
                count += 6;
                temp2 = a % 10;
                count += numberToLetterCount(temp2);
                break;
            //forty
            //fifty
            //sixty
            case 4:
            case 5:
            case 6:
                
                count += 5;
                temp2 = a % 10;
                count += numberToLetterCount(temp2);
            break;
            //seventy
            case 7:
                
                count += 7;
                temp2 = a % 10;
                count += numberToLetterCount(temp2);
                break;            
        }
        return count;
    }

    count = numberToLetterCount(a);
    return count;

}

int numberToLetterCount(int a) {
    switch(a) {
        case 1:
        case 2:
        case 6:
            return 3;
        case 3:
        case 7:
        case 8:
            return 5;
        case 4:
        case 5:
        case 9:
            return 4;
        default:
            return 0;
    }
}
