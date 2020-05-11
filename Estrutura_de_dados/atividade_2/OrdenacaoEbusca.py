from time import sleep
import timeit
import random
import string

def bubble_sort(listaRandom):
    ultimoValor = len(listaRandom)-1
    comparaNum = 0
    trocasNum = 0
    for j in range(ultimoValor):
        for i in range(ultimoValor):
            comparaNum += 1
            if listaRandom[i] > listaRandom[i + 1]:
                trocasNum += 1
                temp = listaRandom[i]
                listaRandom[i] = listaRandom[i + 1]
                listaRandom[i + 1] = temp
    print('- Quantidade de comparações: ',comparaNum)
    print('- Quantidade de trocas: ',trocasNum)

    #return print('ORDENADO: ',listaRandom)

def bubble_sort_1(listaRandom):
    ultimoValor = len(listaRandom)-1
    comparaNum = 0
    trocasNum = 0
    for j in range(listaRandom,0,-1):
        for i in range(j):
            comparaNum += 1
            if listaRandom[i] < listaRandom[i - 1]:
                trocasNum += 1
                temp = listaRandom[i]
                listaRandom[i] = listaRandom[i - 1]
                listaRandom[i - 1] = temp
    print('- Quantidade de comparações: ',comparaNum)
    print('- Quantidade de trocas: ',trocasNum)

    #return print('ORDENADO: ',listaRandom)

def bubble_sort_2(listaRandom):
    order = False
    ultimoValor = len(listaRandom)-1
    comparaNum = 0
    trocasNum = 0
    while not order:
        order = True
        for i in range(ultimoValor):
            comparaNum += 1
            if listaRandom[i] > listaRandom[i + 1]:
                comparaNum += 1
                order = False
                temp = listaRandom[i]
                listaRandom[i] = listaRandom[i + 1]
                listaRandom[i + 1] = temp
        ultimoValor = ultimoValor -1
    print('- Quantidade de comparações: ',comparaNum)
    print('- Quantidade de trocas: ',trocasNum)

    #return print('- ORDENADO: ',listaRandom)

def randomNumbers(ultimoValor):
    listaRandom = []
    for i in range(0, ultimoValor):
        listaRandom.append(random.randint(0, 5000))

    #print('- ORIGINAL: ',listaRandom)
    return listaRandom

def randomChar(ultimoValor):
    random_letras = []
    for i in range(0, ultimoValor):
        random_letras.append((random.choice(string.ascii_lowercase)))

    #print('- ORIGINAL: ',random_letras)
    return random_letras

def randomString(ultimoValor):
    random_string = []
    for i in range(ultimoValor):
        random_string.append(''.join(random.choice(string.ascii_lowercase) for i in range(4)))

    #print('- ORIGINAL: ',random_string)
    return random_string

while True:

    print('---Faça uma: Ordenação e Busca de---')
    print("""[1.4] valores INT
[2.4] valores CHAR
[3.4] valores STRING
[4.4]Sair""")

    opcao = ''
    try:
        opcao = str(input('Escolha uma das opções: '))
    except ValueError:
        print('AVISO: Essa opção apenas aceita números!')

    if opcao != '4.4':
        amount = 0
        try:
            amount = int(input('Digite a quantidade de números: '))
        except ValueError:
            print('Essa opção só aceita números!')
        finally:
            intRand = randomNumbers(amount)
            charrRand = randomChar(amount)
            stringRand = randomString(amount)

    if opcao == '1.4':
        while True:
            print('> Números inteiros ----------------------')
            print("""[1.1]Bubble Sort
[1.2]Bubble Sort - versão melhorada 1
[1.3]Bubble Sort - versão melhorada 2
[4]Voltar""")

            start = str(input('Escolha uma das opções: '))

            if start == '1.1':
                print('> Bubble Sort ----------------------')

                init = timeit.default_timer()
                bubble_sort(intRand)
                end = timeit.default_timer()
                print('- Tempo total da execução foi: ', (end - init))

            if start == '1.2':
                print('> Bubble Sort - versão melhorada 1 ----------------------')

                init = timeit.default_timer()
                bubble_sort_1(intRand)
                end = timeit.default_timer()
                print('- Tempo total da execução foi: ', (end - init))

            if start == '1.3':
                print('> Bubble Sort - versão melhorada 2 ----------------------')

                init = timeit.default_timer()
                bubble_sort_2(intRand)
                end = timeit.default_timer()
                print('- Tempo total da execução foi: ', (end - init))


            if start == '4':
                print('> Voltar ----------------------')
                sleep(0.4)
                break

    if opcao == '2.4':
        while True:
            print('> Char ----------------------')
            print("""[2.1]Bubble Sort
[2.2]Bubble Sort - versão melhorada 1
[2.3]Bubble Sort - versão melhorada 2
[4]Voltar""")

            equipe = str(input('Escolha uma das opções: '))

            if equipe == '2.1':
                print('> Bubble Sort ----------------------')

                init = timeit.default_timer()
                bubble_sort(charrRand)
                end = timeit.default_timer()
                print('- Tempo total de execução foi: ', (end - init))

            if equipe == '2.2':
                print('> Bubble Sort - versão melhorada 1 ----------------------')

                init = timeit.default_timer()
                bubble_sort_1(charrRand)
                end = timeit.default_timer()
                print('- Tempo total de execução foi: ', (end - init))

            if equipe == '2.3':
                print('> Bubble Sort - versão melhorada 2 ----------------------')

                init = timeit.default_timer()
                bubble_sort_2(charrRand)
                end = timeit.default_timer()
                print('- Tempo total de execuação foi: ', (end - init))

            if equipe == '4':
                print('> Voltar ----------------------')
                sleep(0.4)
                break

    if opcao == '3.4':
        while True:
            print('> String ----------------------')
            print("""[3.1]Bubble Sort
[3.2]Bubble Sort -  versão melhorada 1
[3.3]Bubble Sort -  versão melhorada 2
[4]Voltar""")

            emp = str(input('Escolha uma opção: '))

            if emp == '3.1':
                print('> Bubble Sort ----------------------')

                init = timeit.default_timer()
                bubble_sort(stringRand)
                end = timeit.default_timer()
                print('- Tempo total de execução foi: ', (end - init))

            if emp == '3.2':
                print('> Bubble Sort - versão melhorada 1 ----------------------')

                init = timeit.default_timer()
                bubble_sort_1(stringRand)
                end = timeit.default_timer()
                print('- Tempo total de execução foi: ', (end - init))

            if emp == '3.3':
                print('> Bubble Sort - versão melhorada 2 ----------------------')

                init = timeit.default_timer()
                bubble_sort_2(stringRand)
                end = timeit.default_timer()
                print('- Tempo total de execução foi: ', (end - init))

            if emp == '4':
                print('> Voltar ----------------------')
                sleep(0.4)
                break

    if opcao == '4.4':
        sleep(0.4)
        break
