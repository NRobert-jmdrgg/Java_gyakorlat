#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct list{
    int num;
    int occurence;
    struct list *next;
} list;

bool uniqueOccurrences(int* arr, int arrSize);
void push(list **head, int val);
int exists(list *head, int val);
void dumpList(list *head);
void countInc(list *head, int val);
int checkOccurence(list *head);

//this code is overengineered garbage trash


int main(){
    int arr[] = {1, 2, 2, 2, 1, 1, 3};
    int arrSize = sizeof(arr) / sizeof(int);
    
    
    int result = uniqueOccurrences(arr, arrSize);
    printf("\n\nresult = %d", result);
    return 0;
}

void push(list **head, int val){
    list *new = (list *)malloc(sizeof(list));
    new->num = val;
    new->occurence = 1;
    new->next = (*head);
    (*head) = new;
}

int exists(list *head, int val){
    while(head){
        if(head->num == val){
            return 1;
        }
        head = head->next;
    }
    return 0;
}

void countInc(list *head, int val){
    while(head && head->num != val){
        head = head->next;
    }
    head->occurence++;
}

void dumpList(list *head){
    while(head){
        printf("%d - %d\n", head->num, head->occurence);   
        head = head->next;
    }
}

int checkOccurence(list *head){
    
    list *temp;
    temp = head;
    
    while(temp){
        head = temp->next;
        while(head){
            if(head->occurence == temp->occurence){
                return 0;
            }
            head = head->next;
        }
        temp = temp->next;
    }
    return 1;
}

/*Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 
2 has 2 and 3 has 1. 
No two values have the same number of occurrences.*/

bool uniqueOccurrences(int* arr, int arrSize){
    bool uniq = true;
    list *head = NULL;

    for(int i = 0; i < arrSize; i++){
        if(!exists(head, arr[i])){
            push(&head, arr[i]);
        } else {
            countInc(head, arr[i]);            
        }
    }    
    dumpList(head);
    uniq = (bool)checkOccurence(head);
    return uniq;
}

