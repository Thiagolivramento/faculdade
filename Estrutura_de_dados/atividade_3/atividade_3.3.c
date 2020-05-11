// Problema proposto: Faça um código com funções que, dado um valor inteiro N positivo de alunos, e preencha vetor de Aluno, lendo do
// teclado os N alunos através das triplas de valores (Nome, Matricula, Nota) e retorne o vetor preenchidos. Imprima, ao
// final do programa, três vetores: (1) alunos ordenados por nome, (2) alunos ordenados por nota final e (3) alunos
// ordenados por número de matrícula. Utilize 3 métodos diferentes de algoritmos de ordenação para cada vetor
// ordenado vistos em aula e justifique as suas escolhas.

// Aluno - Thiago do Vale

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct aluno
{
    int matricula;
    char nome[80];
    float nota;
};

void insercao (struct aluno aux[], int a);
void impresao (struct aluno aux[], int a);
int ordena_nome (const void *a, const void *b);
void ordena_matricula (struct aluno aux[], int a);
void ordena_nota (struct aluno aux[], int a);

int main()
{
    struct aluno dados[20];
    int cadastro_alunos, opcao;
	
	printf ("Cadastrar Alunos\n");
    printf ("Insira o numero de alunos que deseja cadastrar: ");
    scanf ("%d", &cadastro_alunos);

    insercao (dados, cadastro_alunos);
    impresao (dados, cadastro_alunos);

    while (1) {
    	printf ("\n------------------------------------------\n");
		printf ("\n----------Menu----------\n1. Ordenação por nome\n2. Ordenação por matricula\n3. Ordenação por nota\n4. Sair \n");
		printf ("\nEscolha uma das opções: ");
		scanf ("%d", &opcao);
		
		switch (opcao) {
			case 1:
				qsort (dados, cadastro_alunos, sizeof(struct aluno), ordena_nome);
				printf ("\n------------------------------------------\n");
				printf ("\nOs alunos cadastrados em ordem alfabetica sao:\n");
				imprimir (dados, cadastro_alunos);
				break;
			case 2:
				ordena_matricula (dados, cadastro_alunos);
				printf ("\n------------------------------------------\n");
				printf ("\nAs matriculas dos alunos cadastrados em ordem crescente sao:\n");
				imprimir (dados, cadastro_alunos);
				break;
			case 3:
				ordena_nota (dados, cadastro_alunos);
				printf ("\n------------------------------------------\n");
				printf ("\nAs notas dos alunos cadastrados em ordem crescente sao:\n");
				imprimir (dados, cadastro_alunos);
				break;
			case 4:
				return 0;
			default:
				printf ("\nEscolha somente as opcoes válidas!\n");
		}
	}
	return 0;
} 

void insercao (struct aluno aux[80], int a) {
    int i;
    for (i = 0; i < a; i++)
    {
        printf ("\nInsira o dado #%d", i + 1);
        
        printf ("\nInsira a matricula do aluno : ");
        scanf ("%d", &aux[i].matricula);

        printf ("Insira o nome do aluno : ");
        scanf ("%s", aux[i].nome);

        printf ("Insira a nota do aluno : ");
        scanf ("%f", &aux[i].nota);
    } 
}

void impresao (struct aluno aux[80], int a) {
    int i;
    
    printf ("\nMatriculas          Nomes          Notas\n");
    for (i = 0; i < a; i++)
    {
        printf ("%10d%15s%15.2f\n", aux[i].matricula, aux[i].nome, aux[i].nota);
    } 
}

// Ordenação feita pelo método quick sort (escolhi por ser o método mais rápido de ordenação) 
int ordena_nome (const void *a, const void *b) {
	struct aluno *ia = (struct aluno *)a;
	struct aluno *ib = (struct aluno *)b;
	return strcmp(ia->nome, ib->nome);
}

// Ordenação feita pelo método de insercao (método mais eficiente para problemas com poucas entradas)
void ordena_matricula (struct aluno aux[80], int a) {
	int i, j;
	struct aluno escolhido;
	
	for (i = 1; i < a; i++) {
		escolhido = aux[i];
		for (j = i; (j > 0) && (escolhido.matricula < aux[j - 1].matricula); j--)
			aux[j] = aux[j - 1];
		aux[j] = escolhido;
	}
}


// Ordenação feita pelo método de selecao (método que ordena mais facilmente números, pois apresenta uma baixa quantidade de movimentos) 
void ordena_nota (struct aluno aux[80], int a) {
	int i, j;
	struct aluno escolhido;
	
    for (i = 0; i < a - 1; i++) {
        for (j = i + 1; j < a; j++) {
            if (aux[i].nota > aux[j].nota) {
             	escolhido = aux[i];
             	aux[i] = aux[j];
             	aux[j] = escolhido;
            }
        }
    }
}
