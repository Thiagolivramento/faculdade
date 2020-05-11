// Problema proposto: Faça um programa que leia 13 nomes definido pelo usuário, inserindo-os em um vetor e que os ordene utilizando
// a ideia do algoritmo da inserção. No final, o programa deve mostrar todos os nomes ordenados alfabeticamente.
// Aluno - Thiago do Vale

#include <stdio.h>
#include <string.h>

	void main() {
 
        char nomes[20][18], tam_nome[20][18], temp[18];
        int i, j, tam;
 
        printf("Quantos nomes vc deseja inserir no vetor (o máximo são 13 nomes): \n");
        scanf("%d", &tam);
        printf("Digite %d nomes: \n", tam);
 
        for (i = 0; i < tam; i++) 
        {
            scanf("%s", nomes[i]);
            strcpy(tam_nome[i], nomes[i]);
        }
 
        for (i = 0; i < tam - 1 ; i++)
        {
            for (j = i + 1; j < tam; j++)
            {
                if (strcmp(nomes[i], nomes[j]) > 0) 
                {
                    strcpy(temp, nomes[i]);
                    strcpy(nomes[i], nomes[j]);
                    strcpy(nomes[j], temp);
                }
            }
        }
 
        printf("\n--------------------------------------------------\n");
        printf("Os 13 nomes inseridos\t ordem alfabetica\n");
        printf("--------------------------------------------------\n");
 
        for (i = 0; i < tam; i++) 
        {
            printf("%s\t\t%s\n", tam_nome[i], nomes[i]);
        }
 
        printf("--------------------------------------------------\n");
    }
