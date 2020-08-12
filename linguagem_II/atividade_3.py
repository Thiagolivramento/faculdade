class Calculadora:
    def calcular_adicao(self, num1, num2):
        soma = num1 + num2
        print("A soma é:", soma)

    def calcular_sub(self, num1, num2):
        sub = num1 - num2
        print("A Subtracao é:", sub)

    def calcular_multiplicacao(self, num1, num2):
        multiplicacao = num2 * num1
        print("A Multiplicacao é:", multiplicacao)

    def calcular_divisao(self, num1, num2):
        divisao = num2 / num1
        print("A Divisao é:", divisao)


calcular = Calculadora()

print('Digite o primeiro número')
num1 = int(input())

print('Digite o segundo número')
num2 = int(input())

calcular.calcular_adicao(num1, num2)
calcular.calcular_sub(num1, num2)
calcular.calcular_multiplicacao(num1, num2)
calcular.calcular_divisao(num1, num2)
