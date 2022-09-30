import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) throws Exception {
        int gainPerHour, hoursOfWorkMonth, salario;
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite seu ganho por hora:");
        gainPerHour = tc.nextInt();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        hoursOfWorkMonth = tc.nextInt();
        tc.close();
        salario = gainPerHour * hoursOfWorkMonth;
        System.out.println("Seu salário é de: " + salario+"R$");
    }
}