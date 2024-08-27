class OperacoesNumericas {
    // Método para adição
    adicionar(a, b) {
      return a + b;
    }
  
    // Método para subtração
    subtrair(a, b) {
      return a - b;
    }
  
    // Método para multiplicação
    multiplicar(a, b) {
      return a * b;
    }
  
    // Método para divisão
    dividir(a, b) {
      if (b === 0) {
        throw new Error("Divisão por zero não é permitida.");
      }
      return a / b;
    }
  
    // Método para módulo (resto da divisão)
    modulo(a, b) {
      if (b === 0) {
        throw new Error("Divisão por zero não é permitida.");
      }
      return a % b;
    }
  
    // Método para exponenciação
    exponenciar(a, b) {
      return Math.pow(a, b);
    }
  
    // Método para raiz quadrada
    raizQuadrada(a) {
      if (a < 0) {
        throw new Error("Número negativo não tem raiz quadrada real.");
      }
      return Math.sqrt(a);
    }
  }
  
  // Exemplo de uso
  const operacoes = new OperacoesNumericas();
  
  console.log("Adição: ", operacoes.adicionar(5, 3));        // 8
  console.log("Subtração: ", operacoes.subtrair(5, 3));      // 2
  console.log("Multiplicação: ", operacoes.multiplicar(5, 3)); // 15
  console.log("Divisão: ", operacoes.dividir(6, 3));        // 2
  console.log("Módulo: ", operacoes.modulo(5, 3));          // 2
  console.log("Exponenciação: ", operacoes.exponenciar(2, 3)); // 8
  console.log("Raiz Quadrada: ", operacoes.raizQuadrada(16));  // 4
  