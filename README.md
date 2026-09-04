# Lista04-Java

## Estrutura de Repetição (Do-While) em Java

1) Leia e valide os seguintes dados:  
a. Nota: entre 0 e 100.  
b. Salário: maior que zero.  
c. Sexo: m ou f.  
d. Idade: entre 0 e 110.  
• Quando o dado for informado corretamente, o algoritmo deve apresentar uma mensagem de sucesso e finalizar.  
• Quando o dado for informado incorretamente, o algoritmo deve exigir que o usuário o informe novamente até que seja válido.  

2) Calcule a média de notas inseridas pelo usuário. O algoritmo deve continuar pedindo novas notas até que o usuário decida parar. Apenas notas no intervalo de 0 a 10 são aceitas. Após cada nota, o algoritmo deve perguntar se o usuário deseja inserir outra. Quando o usuário não quiser informar uma nova nota, o algoritmo deve exibir a menor nota inserida, a média das notas inseridas e a maior nota inserida.

3) Implemente um jogo simples onde o usuário tenta adivinhar um número secreto entre 1 e 100. O algoritmo deve:  
a) Gerar um número aleatório entre 1 e 100.  
b) Pedir ao usuário que tente adivinhar o número gerado.  
c) Informar se o palpite está acima ou abaixo do número secreto.  
d) Continuar o jogo até que o usuário acerte o número secreto ou desista.  
e) Permitir que o usuário jogue novamente quantas vezes ele desejar.  
f) Empregar a classe Scanner para ler os palpites a partir do teclado.  
g) Empregar Math.random() para gerar o número secreto.  
OBS: int numeroSecreto = (int) (Math.random() * 100) + 1;  
