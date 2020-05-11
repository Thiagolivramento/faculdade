MENU = 'Métodos de Ordenação \nEscolha uma opção \n1 – Faça um programa que leia 13 nomes definido pelo usuário, inserindo-os em um vetor. No final, o programa deve mostrar todos os nomes ordenados alfabeticamente. \n2 - Dados três vetores de cinco posições, implemente uma função que intercala e retorne o vetor ordenado. Implemente o merge sort, para ordenar um vetor utilizando a intercalação. \n3 - Considere a seguinte estrutura: typedef struct pessoa {string nome; unsigned int Matricula; float Nota; } Aluno; \n'


def menu():
    opMenu = int(input(MENU))
    return opMenu


def funcaoOrdenar():
    maximoNomes = 13
    posicao = 0
    listaNomes = []
    while posicao < maximoNomes:
        nomes = input("Digite um nome para adicionar na lista ")
        posicao = posicao + 1
        listaNomes.append(nomes)

    def alfabeticOrdenacao(nomeLista):
        for index in range(1, len(nomeLista)):

            valorAtual = nomeLista[index]
            posicao = index

            while posicao > 0 and nomeLista[posicao-1] > valorAtual:
                nomeLista[posicao] = nomeLista[posicao-1]
                posicao = posicao-1

            nomeLista[posicao] = valorAtual

    alfabeticOrdenacao(listaNomes)
    print('Lista de nomes ordenados de forma alfabética', listaNomes)


def mergeSort(arr):
    if len(arr) > 1:
        mid = len(arr)//2
        L = arr[:mid]
        R = arr[mid:]

        mergeSort(L)
        mergeSort(R)

        i = j = k = 0

        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1

        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1

        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1


def printLista(arr):
    for i in range(len(arr)):
        print(arr[i], end=" ")
    print()


if menu() == 1:
    funcaoOrdenar()
elif menu() == 2:
    vetor1 = ['1', '18', '13', '85', '6', '23', '3', '53']
    vetor2 = ['Antenor', 'Yago', 'Julio', 'Bruna', 'Raquel']
    vetor3 = [12, 11, 13, 5, 6, 7, 18, 3, 2, 21]
    print("Dada matriz i", end="\n")
    """ Array 1 """
    printLista(vetor1)
    mergeSort(vetor1)
    printLista(vetor1)
    print(end="\n")
    """ Array 2 """
    printLista(vetor2)
    mergeSort(vetor2)
    printList(vetor2)
    print(end="\n")
    """ Array 3 """
    printLista(vetor3)
    mergeSort(vetor3)
    printLista(vetor3)
    print(end="\n")
    print("O vetor é: ", end="\n")
    printList(vetor1)
    printList(vetor2)
    printList(vetor3)
elif menu() == 3:
    print('Não faço ideia de como fazer isso!')
else:
    print('Escolha uma opção válida!')
