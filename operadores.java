public class operadores {
    static void main() {

                // Notas dos trimestres (0 a 10)
                float nota1 = 7.5f;
                float nota2 = 6.0f;
                float nota3 = 5.5f;

                // 1. ADIÇÃO: Calculando a soma total das notas
                float somaTotal = nota1 + nota2 + nota3;

                // 2. DIVISÃO: Calculando a média aritmética
                float media = somaTotal / 3;

                // 3. SUBTRAÇÃO: Quanto faltou para a nota máxima (30 pontos)?
                float pontosFaltando = 30.0f - somaTotal;

                // 4. MULTIPLICAÇÃO: Se as notas valessem peso 2, qual seria o total?
                float totalComPeso = somaTotal * 2;

                // 5. RESTO DA DIVISÃO (%): A soma total é par ou ímpar?
                // (Útil para verificar padrões ou divisões exatas)
                float resto = somaTotal % 2;

                // Exibindo os resultados
                System.out.println("Soma Total das Notas: " + somaTotal);
                System.out.println("Média Final: " + media);
                System.out.println("Pontos para chegar ao 30: " + pontosFaltando);
                System.out.println("Soma se o peso fosse dobrado: " + totalComPeso);
                System.out.println("Resto da divisão da soma por 2: " + resto);
            }
        }


