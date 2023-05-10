class Main {
    public static void main(String[] args) {
        promptUser();
    }

    private static void promptUser() { /* metodo que ejecuta si el valor centrado es null// */
        String name = "pablo";  /* si dejamos las " " vacías dirá que no entró el nombre (no poner null) */

        if (name == null || name.trim().isEmpty()) { /* funcion trim().isEmpty()*/

            System.out.printIn("No entro su nombre");
        } else {

            System.out.printIn("Entro su nombre " + name);

        }

    }
}
