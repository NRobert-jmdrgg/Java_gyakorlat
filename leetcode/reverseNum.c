#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define OTOS 5

typedef struct lotto {
    int szamok[OTOS];
} lotto;

void beker(lotto *a);
void talalatokKiir(lotto nyeroszamok, lotto *lottoszamok);
void filekiir(lotto *lottoszamok);

int main() {
    lotto nyeroszamok = {{5, 27, 32, 67, 90}};
    lotto lottoszamok[6];
    for(int i = 0; i < 6; i++) {
        printf("\n%d", i + 1);
        beker(&lottoszamok[i]);
    }
    talalatokKiir(nyeroszamok, lottoszamok);
    filekiir(lottoszamok);
    return 0;
}

void beker(lotto *a) {
    int ok;
    int temp = 0;   
    for(int i = 0; i < OTOS; i++) {        
        do {
            ok = 0;
            printf("\nSzamok: ");
            if(scanf("%d", &(a->szamok[i])) != 1 || a->szamok[i] <= 1 || a->szamok[i] >= 95) {
                printf("\nRossz input");
                ok = 0;
                a->szamok[i] = 0;
            } else { ok = 1; }
            if(a->szamok[i] > temp) {
                    temp = a->szamok[i];
            } else {
                printf("\nCsak novekvo sorrendben lehet megadni");
                ok = 0;
            }
            while(getchar() != '\n');
        }while(!ok);

    }
}

void talalatokKiir(lotto nyeroszamok, lotto *lottoszamok) {
    int count;
    int max = 0, maxindex = -1;
    printf("\nnyeroszamok: ");
    for(int i = 0; i < OTOS; i++) {
        
        printf("%d ", nyeroszamok.szamok[i]);
    }
    
    for(int i = 0; i < 6; i++) {
        count = 0;
        for(int j = 0; j < OTOS; j++) {
            for(int k = 0; k < OTOS; k++) {
                if(nyeroszamok.szamok[j] == lottoszamok[i].szamok[k]) {
                    count++;
                }
            }
        }
        if(count > max) {
            max = count;
            maxindex = i;
        }
    }
    if(maxindex != -1) {
        printf("\nA legtobb talalattal rendelkezo lottoszamsor: ");
        for(int i = 0; i < OTOS; i++) { 
            printf("%d ", lottoszamok[maxindex].szamok[i]);
        }
        printf("\nA talalatok szama: %d", max);
    } else {
        printf("\nNem voltak talaltok");
    }
    
}

void filekiir(lotto *lottoszamok) {
    FILE *fp = fopen("filecucc.txt", "wf");
    for(int i = 0; i < 6; i++) {
        for(int j = 0; j < OTOS; j++) {
            fprintf(fp, "%d ", lottoszamok[i].szamok[j]);
        }
        fputs("\n", fp);
    }
    fclose(fp);
}

