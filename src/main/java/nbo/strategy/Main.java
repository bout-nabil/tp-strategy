package nbo.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Context context =  new Context();
        Scanner sc = new Scanner(System.in);
        Map<String, IStrategy> strategyMap = new HashMap<>();
        IStrategy strategy;
        while (true) {
            System.out.print("Quelle strategie? : ");
            String str = sc.nextLine();
            strategy = strategyMap.get(str);
            if(strategy == null){
                System.out.println("Creation de starategie "+str);
                strategy =(IStrategy) Class.forName("nbo.strategy.IStrategyImpl"+str).getConstructor().newInstance();
                strategyMap.put(str, strategy);
            }
            context.setStrategy(strategy);
            context.effectuerOperation();
        }

    }
}