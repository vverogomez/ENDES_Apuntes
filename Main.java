import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //PARTE 1


        Scanner sc=new Scanner(System.in);
        /*
        System.out.println("Introduce numero");
        int num=sc.nextInt();
        if (num==1)
        {
            System.out.println("El numero es uno");
        }
        else
        {
            if (num==2)
            {
                System.out.println("El numero es dos");
            }
            else
            {
                System.out.println("El numero es distinto de uno y dos");
            }
        }

         */

        //PARTE 2
        /*
        System.out.println("Introduce tu edad");
        int num2=sc.nextInt();
        System.out.println("Edad: "+num2);

        System.out.println("Introduce tu edad");
        int num3=sc.nextInt();
        System.out.println("Edad: "+num3);

        if (num2<num3)
        {
            System.out.println("Soy mas joven que mi compañero");
        }
        else
        {
            if (num2>num3)
            {
                System.out.println("Mi compañero es mas joven que yo");
            }
            else {
                System.out.println("Somos de la misma edad");
            }
        }
         */

        //PARTE3
        /*
        System.out.println("Introduce presión");
        float presion=sc.nextFloat();
        System.out.println("Presión: "+presion);

        if (presion>2)
        {
            System.out.println("Abrir válvula de seguridad");
            --presion;
            System.out.println("La presión es "+presion);

        }
        else
        {
            System.out.println("Introduce nombre");
            sc.nextLine();
            String nombre=sc.nextLine();
            System.out.println("Todo está bien "+nombre);
        }

         */

        //PARTE4

        boolean sol=true, lluvia=true;
        float temHoy=0.0f, temAyer=0.0f, sumaTemp, TempMa;
        System.out.println("Introduce T hoy");
        temHoy=sc.nextInt();
        System.out.println("Introduce T ayer");
        temAyer=sc.nextInt();
        System.out.println("Llueve? (True o False) ");
        lluvia=sc.nextBoolean();
        System.out.println("Sol? (True o False) ");
        sol=sc.nextBoolean();


        if (temHoy>20 && lluvia==true)
        {
            System.out.println("Hace calor pero está lloviendo");
            sumaTemp=(temHoy+temAyer);
            System.out.print("Entre ayer y hoy la temperatura fue de "+sumaTemp);
            System.out.print("Mañana habrá "+(temHoy+5));
        }
        else
        {
           System.out.println("Parece que llega el otoño");

           if (sol==true)
           {
               System.out.println("Pero luce sol");
           }
           else
           {
              if (lluvia==true)
              {
                  System.out.println("y llueve");
              }
           }
        }


    }
}