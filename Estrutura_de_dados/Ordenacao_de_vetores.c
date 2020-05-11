#include <string.h>

#include <stdio.h>

#include <stdlib.h>

// RENDER MENU INICIAL
int renderMenu() {
  int opcaoMenu;
  printf("Ordenando Vetores \nEscolha uma opção de ordenação \n1 - Valores Inteiros \n2 - Valores de caracteres \n3 - Valores de Nomes \n");
  scanf("%d", & opcaoMenu);
  return opcaoMenu;
}

// RENDER FUNÇÃO DAS OPÇÕES
int renderOpcaoOrdenar() {
  int opcaoOrdenar;
  printf("Exibir em \n1 - Decrescente \n2 - Crescente \n");
  scanf("%d", & opcaoOrdenar);
  return opcaoOrdenar;
}

void swap(int * xp, int * yp) {
  int temp = * xp;
  * xp = * yp;
  * yp = temp;
}

//ORDERNAR NúMEROS
void selectionSort(int arr[], int n) {
  int i, j, min_idx;
  for (i = 0; i < n - 1; i++) {
    min_idx = i;
    for (j = i + 1; j < n; j++)
      if (arr[j] < arr[min_idx])
        min_idx = j;
    swap( & arr[min_idx], & arr[i]);
  }
}

int myCompare(const void * a,
  const void * b) {
  const char * pa = * (const char ** ) a;
  const char * pb = * (const char ** ) b;

  return strcmp(pa, pb);
}

// ORDENAÇÃO DO VETOR COM VALORES INT(inteiros)
int renderVetorInt(int modoExibir) {
  if (modoExibir == 1) {
    return 0;
  } else if (modoExibir == 2) {

    int numeros[15] = {
      13,
      8,
      9,
      1,
      10,
      4,
      6,
      15,
      3,
      14,
      7,
      11,
      2,
      12,
      5
    };
    int loop;
    int n = sizeof(numeros) / sizeof(numeros[0]);
    printf("Original: ");
    for (loop = 0; loop < 15; loop++)
      printf("%d ", numeros[loop]);
    printf("\n");
    printf("Ordenadas: ");
    selectionSort(numeros, n);
    int i;
    for (i = 0; i < n; i++)
      printf("%d ", numeros[i]);
    printf("\n");
    return 0;
  } else {
    printf("Opção invalida \n");
    return 0;
  }
}

// ORDENAÇÃO DE VETOR COM VALORES CHAR (caracter)
int renderVetorChar(int modoExibir) {
  if (modoExibir == 1) {
    return 0;
  } else if (modoExibir == 2) {
    const char * caracter[] = {
      "C",
      "J",
      "D",
      "B",
      "G",
      "H",
      "E",
      "A",
      "F",
      "I",
      "L",
      "M",
      "N"
    };
    int i;
    int stringLen = sizeof(caracter) / sizeof(char * );
    qsort(caracter, stringLen, sizeof(char * ), myCompare);
    for (i = 0; i < stringLen; ++i)
      printf("%s", caracter[i]);
    printf("\n");
    return 0;
  } else {
    printf("Opção invalida \n");
    return 0;
  }
}

// ORDENAÇÃO DE VETOR COM VALORES STRING (palavras)
int renderVetorNomes(int modoExibir) {
  if (modoExibir == 1) {
    return 0;
  } else if (modoExibir == 2) {
    const char * nomes[] = {
      "Ana",
      "Thiago",
      "Daniel",
      "Raquel",
      "Edivan",
      "Antonio",
      "Eduarda ",
      "Jeclerson",
      "Fernanda",
      "Ivanildo",
      "Geicson",
      "Claudionor",
      "Roberval"
    };
    int i;
    int stringLen = sizeof(nomes) / sizeof(char * );
    qsort(nomes, stringLen, sizeof(char * ), myCompare);
    printf("Ordenada: ");
    for (i = 0; i < stringLen; ++i)
      printf("%s", nomes[i]);
    printf("\n");
    return 0;
  } else {
    printf("Opção invalida \n");
    return 0;
  }
}

int main(int argc,
  const char * argv[]) {
  // ORDENAÇÃO DO VETOR COM VALORES INT (inteiros)
  if (renderMenu() == 1) {
    if (renderOpcaoOrdenar() == 1) {
      renderVetorInt(1);
    } else if (renderOpcaoOrdenar() == 2) {
      renderVetorInt(2);
    } else {
      printf("Opção invalida \n");
    }
  }
  // ORDENAÇÃO DE VETOR COM VALORES CHAR (caracter)
  else if (renderMenu() == 2) {
    if (renderOpcaoOrdenar() == 1) {
      renderVetorChar(1);
    } else if (renderOpcaoOrdenar() == 2) {
      renderVetorChar(2);
    } else {
      printf("Opção invalida \n");
    }
  }
  // ORDENAÇÃO DE VETOR COM VALORES STRING (palavras)
  else if (renderMenu() == 3) {
    if (renderOpcaoOrdenar() == 1) {
      renderVetorNomes(1);
    } else if (renderOpcaoOrdenar() == 2) {
      renderVetorNomes(2);
    } else {
      printf("Opção invalida \n");
    }
  } else {
    printf("Opção invalida escolha de 1 a 3 \n");
  }
  return (0);
}
