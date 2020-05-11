// Problema proposto: Dados três vetores de 5 posições ordenados, implemente uma função que intercala e retorne o vetor resultante
// ordenado. Implemente uma função merge sort, que faça ordenação em um vetor utilizando a sua função de
// intercalação.
// Aluno - Thiago do Vale

#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int merge(
    // vetores que armazenam os dados
    int * const * const vetors,
    // tamanho dos vetores internos  		
    int const * const tam_vetores,
    int num_vetores, 
    // aponta para o buffer do output       			
    int * const output               		
) {
    int i = 0;
    int j = 0;      
    int min;
    // posição minima      
    int minposi;

    // cursor para os vetores
    int * cursor = calloc(num_vetores,sizeof(int));

    if(cursor == NULL)
        return -1;

    while(1){
        min = INT_MAX;
        minposi = -1;

        for(j = 0; j < num_vetores; ++j){

            if(cursor[j] < tam_vetores[j] &&
               vetors[j][cursor[j]] < min){
                min = vetors[j][cursor[j]];
                minposi = j;
            }
        }

        if(minposi == -1)
            break;
     
        output[i++] = min;
        cursor[minposi]++;
    }
    free(cursor);

    return 0;
}

int main()
{
    int i = 0;
    int vetor_1[5] = {1, 2, 8, 9, 12};
    int vetor_2[5] = {4, 14, 25, 30, 445};
    int vetor_3[5] = {5, 13, 23, 100, 97};

    int *vetor_final[] = {vetor_1, vetor_2, vetor_3};
    int tam_vetor_final[] = {5,5,5};

    int output[15];

    merge(vetor_final,tam_vetor_final,3,output);

    while(i < 15){
        printf("%i\n",output[i++]);
    }    

    return 0;
}
