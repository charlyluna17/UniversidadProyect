public class practicafrutas{
public static public static void main(String[] args) {
    scanner scanner = new Scanner(system.in)
    System.out.println("digite el index del array que desea borrar 'de 0 a 4'");
    int dato = Integer.parseInt(scanner.next());
    string frutas[] = {"manzana", "pera", "uva", "guineo", "mango"};
    frutas = borrar(dato, frutas);

    for(string frutas:frutas){
    System.out.println(fruta);
}

public static String[] borrar(int dato, string[] otroArray){
    for(int  =0; i< otroArray.lenth; i++){
        if (otroArray[i] == otroArray[dato]){
            otroArray[i] ="";
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