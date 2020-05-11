// equipe: Leonardo Tasca, Leonardo Martinelli, Thiago do Vale.


#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <time.h>

// MENU
int Menu() {
  int opcaoMenu;
  printf("Algoritmos de Ordenação  \nEscolha uma opção: \n 1) 1.4 - Vetor INT: \n2) 2.4 - Vetor CHAR: \n3) 3.4 - Vetor STRING: \n");
  scanf("%d", & opcaoMenu);
  return opcaoMenu;
}


// MENU
int MenuINT() {
  int opcaoMenu;
  printf("1.Vetor INT: \nEscolha a opção de ordenação que deseja: \n1) 1.1 Ordenação Bubble Sort - com valores Int 3.000 e 5.000 números – controle de comparações, troca e tempo execução – gerar de forma randômica \n2) 1.2 Ordenação Bubble Sort - 1ª versão Melhorado - Int 3.000 e 5.000 números – controle de comparações, troca e tempo execução – gerar de forma randômica: \n3) 1.3 Ordenação Bubble Sort - 2ª versão Melhorado - Int 3.000 e 5.000 números – controle de comparações, troca e tempo execução – gerar de forma randômica: \n");
  scanf("%d", & opcaoMenu);
  return opcaoMenu;
}


// MENU CHAR
int MenuCHAR() {
  int opcaoMenu;
  printf("1.Vetor CHAR: \nEscolha a opção de ordenação que deseja: \n1) 2.1 Ordenação Bubble Sort -  valores char 156 e 256 caracteres – controle de comparações, troca e tempo execução – gerar de forma randômica: \n2) 1.2 Ordenação Bubble Sort - 1ª versão Melhorado -  char 156 e 256 caracteres – controle de comparações, troca e tempo execução – gerar de forma randômica: \n3) 1.3 Ordenação Bubble Sort - 2ª versão Melhorado - char 156 e 256 caracteres – controle de comparações, troca e tempo execução – gerar de forma randômica: \n");
  scanf("%d", & opcaoMenu);
  return opcaoMenu;
}



// MENU STRING
int MenuSTRING() {
  int opcaoMenu;
  printf("1.Vetor STRING: \nEscolha a opção de ordenação que deseja: \n1) 2.1 Ordenação Bubble Sort -  valores strings 30 e 300 strings – controle de comparações, troca e tempo execução – gerar de forma randômica: \n2) 1.2 Ordenação Bubble Sort - 1ª versão Melhorado -  strings 30 e 300 strings – controle de comparações, troca e tempo execução – gerar de forma randômica: \n3) 1.3 Ordenação Bubble Sort - 2ª versão Melhorado -  strings 30 e 300 strings – controle de comparações, troca e tempo execução – gerar de forma randômica: \n");
  scanf("%d", & opcaoMenu);
  return opcaoMenu;

}

void swap(int *ap, int *bp){
      int temp = *ap;
      *ap = *bp;
      *bp = temp;
}

void bubbleSort(int arr[], int size){
      time_t start,end;
      start=clock();
      int i,j;
      for(i = 0; i < size; i++){
            //last elements already in place
            for(j = 0; j < size-i-1; j++){
                  if(arr[j] > arr[j+1])
                        swap(&arr[j], &arr[j+1]);
            }
      }
      end=clock();
}

void printArray(int arr[], int size){
      int i;
      for(i = 0; i < size ; i++){
              printf("%d ",arr[i]);
      }
}

char *randChar(size_t length) {
    static char charset[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789,.-#'?!";
    char *randomString = NULL;
    if (length) {
        randomString = malloc(sizeof(char) * (length +1));
        if (randomString) {
            for (int n = 0;n < length;n++) {
                int key = rand() % (int)(sizeof(charset) -1);
                randomString[n] = charset[key];
            }
            randomString[length] = '\0';
        }
    }
    printf(randomString);
    printf("\n");
    return randomString;
}

char *randString(size_t length) {
    static char charset[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789,.-#'?!";
    char *randomString = NULL;
    if (length) {
        randomString = malloc(sizeof(char) * (length +1));
        if (randomString) {
            for (int n = 0;n < length;n++) {
                int key = rand() % (int)(sizeof(charset) -1);
                randomString[n] = charset[key];
            }
            randomString[length] = '\0';
        }
    }
    printf(randomString);
    printf("\n");
    return randomString;
}



int main(int argc, const char * argv[]) {

    if (Menu() == 1) {
        if (MenuINT() == 1) {
            int i, n=3000, arr[n];
            for (i=0; i<n; i++)
                arr[i]=rand()%n;
            int a = sizeof(arr)/sizeof(arr[n]);
            int x, inicio=5000, arrr[inicio];
               for (x=0; x<inicio; x++)
                   arrr[x]=rand()%inicio;
            int contador = sizeof(arrr)/sizeof(arrr[inicio]);
            bubbleSort(arr,a);
            printArray(arr,a);
            //FUNÇÃO 5000
            bubbleSort(arrr,contador);
            printArray(arrr,contador);
            printf("\n");
        }else if (MenuINT() == 2){
            int i, n=3000, arr[n];
            for (i=0; i<n; i++)
                arr[i]=rand()%n;
            int a = sizeof(arr)/sizeof(arr[n]);
            int x, inicio=5000, arrr[inicio];
               for (x=0; x<inicio; x++)
                   arrr[x]=rand()%inicio;
            int contador = sizeof(arrr)/sizeof(arrr[inicio]);
            bubbleSort(arr,a);
            printArray(arr,a);
            //FUNÇÃO 5000
            bubbleSort(arrr,contador);
            printArray(arrr,contador);
            printf("\n");
        }else if (MenuINT() == 3) {
            int i, n=3000, arr[n];
            for (i=0; i<n; i++)
                arr[i]=rand()%n;
            int a = sizeof(arr)/sizeof(arr[n]);
            int x, inicio=5000, arrr[inicio];
               for (x=0; x<inicio; x++)
                   arrr[x]=rand()%inicio;
            int contador = sizeof(arrr)/sizeof(arrr[inicio]);
            bubbleSort(arr,a);
            printArray(arr,a);
            //FUNÇÃO 5000
            bubbleSort(arrr,contador);
            printArray(arrr,contador);
            printf("\n");
        } else {
            printf("A opção não é válida !!!");
        }
    }
    // ORDENAÇÃO CHAR
    else if (Menu() == 2) {
      if (MenuCHAR() == 1) {
          randChar(156);
          randChar(256);
      }else if (MenuCHAR() == 2){
          randChar(156);
          randChar(256);
      }else if (MenuCHAR() == 3) {
          randChar(156);
          randChar(256);
      } else {
        printf("A opção não é válida !!!");
      }
    }
    // ORDENAÇÃO STRING
    else if (Menu() == 3) {
      if (MenuSTRING() == 1) {
          randString(30);
          randString(300);
      }else if (MenuSTRING() == 2){
          randString(30);
          randString(300);
      }else if (MenuSTRING() == 3) {
          randString(30);
          randString(300);
      } else {
        printf("A opção não é válida !!!");
      }
    } else {
      printf("Vocẽ deve escolher entre as opções 1, 2 ou 3 \n");
    }
    return (0);
}
