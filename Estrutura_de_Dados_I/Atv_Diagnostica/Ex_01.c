#include <stdio.h>

int main(){
  int vetor[10];
  int soma = 0;

  printf("Digite 10 números e obtenha a soma deles.\n\n");
  for(int i = 0; i < 10; i++){
    printf("%dº valor: ", i+1); // %d se refere a valores inteiros
    scanf("%d", &vetor[i]);     // scanf é a função de input em C
    soma += vetor[i];
  }
  
  printf("\nA soma dos 10 números é igual a %d", soma);

  return 0;
}
