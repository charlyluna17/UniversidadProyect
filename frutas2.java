public class frutas2 {
    public static public static void main(String[] args) {
        scanner scanner = new Scanner(system.in)
        System.out.println("digite el index del array que desea borrar 'de 0 a 4'");
        int dato = Integer.parseInt(scanner.next());
        System.out.println("digite el nombre nueva fruta");
        string frutanueva= scanner.next();
        string frutas[] = {"manzana", "pera", "uva", "guineo", "mango"};
        frutas = editar(dato,frutaNueva,frutas);

        for (string frutas : frutas) {
            System.out.println(fruta);
        }
    }

}
        public static String[] editar(int dato, string fruta[] otroArray) {
            for (int  =0;
            i < otroArray.lenth;
            i++){
                if (otroArray[i] == otroArray[dato]) {
                    otroArray[i] = "";
                }
            }
            return otroArray;
        }
    }
}
