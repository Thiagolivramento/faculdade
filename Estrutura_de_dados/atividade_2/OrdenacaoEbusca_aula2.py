# equipe: Leonardo Tasca, Leonardo Martinelli, Thiago do Vale.

from time import sleep
import timeit
import random
import string

def bubble_sort(randomList):
    lastValue = len(randomList)-1
    numbCamp = 0
    numbChan = 0
    for j in range(lastValue):
        for i in range(lastValue):
            numbCamp += 1
            if randomList[i] > randomList[i + 1]:
                numbChan += 1
                temp = randomList[i]
                randomList[i] = randomList[i + 1]
                randomList[i + 1] = temp
    print('- QUANTIDADE DE COMPAÇÔES: ',numbCamp)
    print('- QUANTIDADE DE TROCAS: ',numbChan)

    #return print('ORDENADO: ',randomList)

def bubble_sort_1(randomList):
    lastValue = len(randomList)-1
    numbCamp = 0
    numbChan = 0
    for j in range(lastValue,0,-1):
        for i in range(j):
            numbCamp += 1
            if randomList[i] < randomList[i - 1]:
                numbChan += 1
                temp = randomList[i]
                randomList[i] = randomList[i - 1]
                randomList[i - 1] = temp
    print('- QUANTIDADE DE COMPAÇÔES: ',numbCamp)
    print('- QUANTIDADE DE TROCAS: ',numbChan)

    #return print('ORDENADO: ',randomList)

def bubble_sort_2(randomList):
    order = False
    lastValue = len(randomList)-1
    numbCamp = 0
    numbChan = 0
    while not order:
        order = True
        for i in range(lastValue):
            numbCamp += 1
            if randomList[i] > randomList[i + 1]:
                numbChan += 1
                order = False
                temp = randomList[i]
                randomList[i] = randomList[i + 1]
                randomList[i + 1] = temp
        lastValue = lastValue -1
    print('- QUANTIDADE DE COMPAÇÔES: ',numbCamp)
    print('- QUANTIDADE DE TROCAS: ',numbChan)

    #return print('- ORDENADO: ',randomList)

def randomNumbers(lastValue):
    randomList = []
    for i in range(0, lastValue):
        randomList.append(random.randint(0, 5000))
    
    #print('- ORIGINAL: ',randomList)
    return randomList

def randomChar(lastValue):
    random_letters = []
    for i in range(0, lastValue):
        random_letters.append((random.choice(string.ascii_lowercase))) 
    
    #print('- ORIGINAL: ',random_letters)
    return random_letters

def randomString(lastValue):
    random_strings = []
    for i in range(lastValue):
        random_strings.append(''.join(random.choice(string.ascii_lowercase) for i in range(4)))
    
    #print('- ORIGINAL: ',random_strings)
    return random_strings

while True:

    print('---Ordenação e Busca---')
    print("""[1.4]Vetor valores INT
[2.4]Vetor valores CHAR
[3.4]Vetor valores STRING
[4.4]Sair""")

    opcao = ''
    try:
        opcao = str(input('Escolha uma opção: '))
    except ValueError:
        print('AVISO: Essa opção apenas aceita números, tente novamente!')

    if opcao != '4.4':
        opcaoAmount = 0
        try:
            opcaoAmount = int(input('Digite a quantidade: '))
        except ValueError:
            print('Essa opção apenas aceita números!')
        finally:
            randomInt = randomNumbers(opcaoAmount)
            randomCharr = randomChar(opcaoAmount)
            randomStrings = randomString(opcaoAmount)

    if opcao == '1.4':
        while True:
            print('> INTEIROS ----------------------')
            print("""[1.1]Bubble Sort
[1.2]Bubble Sort - 1ª versão melhorada
[1.3]Bubble Sort - 2ª versão melhorada
[4]Voltar""")

            opcaoStart = str(input('Escolha uma opção: '))

            if opcaoStart == '1.1':
                print('> Bubble Sort ----------------------')
                
                init = timeit.default_timer()
                bubble_sort(randomInt)
                end = timeit.default_timer()
                print('- TEMPO DE EXECUÇÂO: ', (end - init))

            if opcaoStart == '1.2':
                print('> Bubble Sort - 1ª versão melhorada ----------------------')
              
                init = timeit.default_timer()
                bubble_sort_1(randomInt)
                end = timeit.default_timer()
                print('- TEMPO DE EXECUÇÂO: ', (end - init))

            if opcaoStart == '1.3':
                print('> Bubble Sort - 2ª versão melhorada ----------------------')
              
                init = timeit.default_timer()
                bubble_sort_2(randomInt)
                end = timeit.default_timer()
                print('- TEMPO DE EXECUÇÂO: ', (end - init))

                
            if opcaoStart == '4':
                print('> Voltar ----------------------')
                sleep(0.4)
                break
               
    if opcao == '2.4':
        while True:
            print('> CHAR ----------------------')
            print("""[2.1]Bubble Sort
[2.2]Bubble Sort - 1ª versão melhorada
[2.3]Bubble Sort - 2ª versão melhorada
[4]Voltar""")

            opcaoEquipe = str(input('Escolha uma opção: '))

            if opcaoEquipe == '2.1':
                print('> Bubble Sort ----------------------')
    
                init = timeit.default_timer()
                bubble_sort(randomCharr)
                end = timeit.default_timer()
                print('- TEMPO DE EXECUÇÂO: ', (end - init))

            if opcaoEquipe == '2.2':
                print('> Bubble Sort - 1ª versão melhorada ----------------------')

                init = timeit.default_timer()
                bubble_sort_1(randomCharr)
                end = timeit.default_timer()
                print('- TEMPO DE EXECUÇÂO: ', (end - init))
            
            if opcaoEquipe == '2.3':
                print('> Bubble Sort - 2ª versão melhorada ----------------------')

                init = timeit.default_timer()
                bubble_sort_2(randomCharr)
                end = timeit.default_timer()
                print('- TEMPO DE EXECUÇÂO: ', (end - init))

            if opcaoEquipe == '4':
                print('> Voltar ----------------------')
                sleep(0.4)
                break
                
    if opcao == '3.4':
        while True:
            print('> STRING ----------------------')
            print("""[3.1]Bubble Sort
[3.2]Bubble Sort - 1ª versão melhorada
[3.3]Bubble Sort - 2ª versão melhorada
[4]Voltar""")

            opcaoEmp = str(input('Escolha uma opção: '))

            if opcaoEmp == '3.1':
                print('> Bubble Sort ----------------------')
                
                init = timeit.default_timer()
                bubble_sort(randomStrings)
                end = timeit.default_timer()
                print('- TEMPO DE EXECUÇÂO: ', (end - init))
            
            if opcaoEmp == '3.2':
                print('> Bubble Sort - 1ª versão melhorada ----------------------')

                init = timeit.default_timer()
                bubble_sort_1(randomStrings)
                end = timeit.default_timer()
                print('- TEMPO DE EXECUÇÂO: ', (end - init))

            if opcaoEmp == '3.3':
                print('> Bubble Sort - 2ª versão melhorada ----------------------')

                init = timeit.default_timer()
                bubble_sort_2(randomStrings)
                end = timeit.default_timer()
                print('- TEMPO DE EXECUÇÂO: ', (end - init))
            
            if opcaoEmp == '4':
                print('> Voltar ----------------------')
                sleep(0.4)
                break

    if opcao == '4.4':
        sleep(0.4)
        break
