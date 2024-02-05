package proyectofinal;
//AUTOR: Ricardo Espinosa Y Juan Diego Camargo
import java.io.*;
import java.time.LocalDate;
import java.util.*;
public class presentar_data {
    public static void main(String[] args) {
        int filas = 800;
        int columnas = 13;
        String nombreArchivoCompleto = "datoscarcel.csv", pabellon1 = "pabellon1.csv", pabellon2 = "pabellon2.csv",pabellon3 = "pabellon3.csv",pabellon4 = "pabellon4.csv",pabellon5 = "pabellon5.csv";
        String [][]principal = new String [filas][columnas];
        generarNumeracion(principal, filas);//0
        generarCedulas(principal, filas);//1
        generarNombresPPL(principal, filas);//2
        generarClasificacion(principal, filas);//10
        generarFechasIngreso(principal, filas);//5
        generaredades(principal, filas);//3
        generarPenas(principal, filas);//4
        generarFechasSalida(principal, filas);//6
        generarAniosRestantes(principal, filas);//7
        generarPabellon(principal, filas);//8
        generarCelda(principal, filas);//9
        generarVisita(principal, filas);//11
        generardelitos(principal, filas);//12
        generarcsvCompleto(principal, filas, nombreArchivoCompleto);
        generarcsvPabellon1(principal, filas, pabellon1);
        generarcsvPabellon2(principal, filas, pabellon2);
        generarcsvPabellon3(principal, filas, pabellon3);
        generarcsvPabellon4(principal, filas, pabellon4);
        generarcsvPabellon5(principal, filas, pabellon5);
    }
    
    public static void generarcsvCompleto(String[][] principal, int filas, String nombreArchivoCompleto){
        try {
            Formatter e = new Formatter(nombreArchivoCompleto);
            e.format("#PPL;Cedula;Nombres;Edad(Anios);Pena(anios);Fecha(Ingreso)(d/m/a);Fecha(Salida)(d/m/a);Anios Restantes (pena);Pabellon;Celda;Clasificacion;Visitas semanales(Horas);Delito\n");
            for (int i = 0; i < filas; i++) {
                e.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\n",principal[i][0],principal[i][1],principal[i][2],principal[i][3],principal[i][4],principal[i][5],principal[i][6],principal[i][7],principal[i][8],principal[i][9],principal[i][10],principal[i][11],principal[i][12]);
            }
            e.close();
            System.out.println("La informacion se guardo correctamente en: "+nombreArchivoCompleto);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void generarcsvPabellon1(String[][] principal, int filas, String pabellon1){
        try {
            Formatter e = new Formatter(pabellon1);
            e.format("#PPL;Cedula;Nombres;Edad(Anios);Pena(anios);Fecha(Ingreso)(d/m/a);Fecha(Salida)(d/m/a);Anios Restantes (pena);Pabellon;Celda;Clasificacion;Visitas semanales(Horas);Delito\n");
            for (int i = 0; i < 80; i++) {
                e.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\n",principal[i][0],principal[i][1],principal[i][2],principal[i][3],principal[i][4],principal[i][5],principal[i][6],principal[i][7],principal[i][8],principal[i][9],principal[i][10],principal[i][11],principal[i][12]);
            }
            e.close();
            System.out.println("La informacion se guardo correctamente en: "+pabellon1);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void generarcsvPabellon2(String[][] principal, int filas, String pabellon2){
        try {
            Formatter e = new Formatter(pabellon2);
            e.format("#PPL;Cedula;Nombres;Edad(Anios);Pena(anios);Fecha(Ingreso)(d/m/a);Fecha(Salida)(d/m/a);Anios Restantes (pena);Pabellon;Celda;Clasificacion;Visitas semanales(Horas); Delito\n");
            for (int i = 80; i < 260; i++) {
                e.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\n",principal[i][0],principal[i][1],principal[i][2],principal[i][3],principal[i][4],principal[i][5],principal[i][6],principal[i][7],principal[i][8],principal[i][9],principal[i][10],principal[i][11],principal[i][12]);
            }
            e.close();
            System.out.println("La informacion se guardo correctamente en: "+pabellon2);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void generarcsvPabellon3(String[][] principal, int filas, String pabellon3){
        try {
            Formatter e = new Formatter(pabellon3);
            e.format("#PPL;Cedula;Nombres;Edad(Anios);Pena(anios);Fecha(Ingreso)(d/m/a);Fecha(Salida)(d/m/a); Anios Restantes (pena); Pabellon; Celda; Clasificacion; Visitas semanales(Horas); Delito\n");
            for (int i = 260; i <440; i++) {
                e.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\n",principal[i][0],principal[i][1],principal[i][2],principal[i][3],principal[i][4],principal[i][5],principal[i][6],principal[i][7],principal[i][8],principal[i][9],principal[i][10],principal[i][11],principal[i][12]);
            }
            e.close();
            System.out.println("La informacion se guardo correctamente en: "+pabellon3);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void generarcsvPabellon4(String[][] principal, int filas, String pabellon4){
        try {
            Formatter e = new Formatter(pabellon4);
            e.format("#PPL;Cedula;Nombres;Edad(Anios);Pena(anios);Fecha(Ingreso)(d/m/a);Fecha(Salida)(d/m/a);Anios Restantes (pena);Pabellon;Celda;Clasificacion;Visitas semanales(Horas);Delito\n");
            for (int i = 440; i < 620; i++) {
                e.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\n",principal[i][0],principal[i][1],principal[i][2],principal[i][3],principal[i][4],principal[i][5],principal[i][6],principal[i][7],principal[i][8],principal[i][9],principal[i][10],principal[i][11],principal[i][12]);
            }
            e.close();
            System.out.println("La informacion se guardo correctamente en: "+pabellon4);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void generarcsvPabellon5(String[][] principal, int filas, String pabellon5){
        try {
            Formatter e = new Formatter(pabellon5);
            e.format("#PPL;Cedula;Nombres;Edad(Anios);Pena(anios);Fecha(Ingreso)(d/m/a);Fecha(Salida)(d/m/a);Anios Restantes (pena);Pabellon;Celda;Clasificacion;Visitas semanales(Horas);Delito\n");
            for (int i = 620; i < 799; i++) {
                e.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\n",principal[i][0],principal[i][1],principal[i][2],principal[i][3],principal[i][4],principal[i][5],principal[i][6],principal[i][7],principal[i][8],principal[i][9],principal[i][10],principal[i][11],principal[i][12]);
            }
            e.close();
            System.out.println("La informacion se guardo correctamente en: "+pabellon5);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void generarNumeracion(String principal[][], int filas){
        for (int i = 0; i < filas; i++) {
            principal[i][0] = "PPL "+String.valueOf(i+1);
        }
    }
    
    public static void generarCedulas(String principal[][], int filas){ //Generar identificaciondes de los PPL
        int x1 = 0;
        int x2 = 0;
        for (int i = 0; i < principal.length; i++) {
            x1 = (int) (Math.random() * 90102-1) + 10190;
            x2 = (int) (Math.random() * 90102-1) + 10190;
            principal[i][1] =  String.valueOf(x1) + String.valueOf(x2);
        }
    }
    
    public static void generarNombresPPL(String principal[][], int filas){ //Generar nombres completos de los PPL
        String nomPersonas1[] = {"Roberto","Dario","Fabian","Gonzalo","Carlos","Mario","Pedro","Victor","Michael","Byron"};
        String nomPersonas2[] = {"Antonio","Cesar","Pablo","Adrian","Diego","Julian","Sergio","Paulo","Angel","Vicente"};
        String apePersonas1[] = {"Paredes","Romero","Cuenca","Guerrero","Garcia","Torres","Cevallos","Perero","Gonzales","Perez"};
        String apePersonas2[] = {"Sanchez","Ramirez","Hidalgo","Rivera","Gomez","Espinosa","Reyes","Roman","Morales","Castro"};
        for (int i = 0; i < principal.length; i++) {
            int indAleatorioNomb1 = (int) (Math.random() * nomPersonas1.length-1) + 0;
            int indAleatorioNomb2 = (int) (Math.random() * nomPersonas2.length-1) + 0;
            int indAleatorioApe1 = (int) (Math.random() * apePersonas1.length-1) + 0;
            int indAleatorioApe2 = (int) (Math.random() * apePersonas1.length-1) + 0;
            principal[i][2] = nomPersonas1[indAleatorioNomb1] + " " + nomPersonas2[indAleatorioNomb2] + " " + apePersonas1[indAleatorioApe1] + " " + apePersonas2[indAleatorioApe2];
        }
    }
    
    public static void generaredades(String principal[][], int filas){ //Generar edades de los PPL
        int edad = 0;
        int anioActual = 0;
        LocalDate fechaActual = LocalDate.now();
        anioActual = fechaActual.getYear();
        String anioIngresoAux = null;
        int anioIngreso = 0;
        int resto = 0;
        Random rand = new Random();
        for (int i = 0; i < filas; i++) {
            edad = rand.nextInt(50- 18 + 1) + 18;
            anioIngresoAux = principal[i][5].substring(6);
            anioIngreso = Integer.valueOf(anioIngresoAux);
            resto = anioActual - anioIngreso;
            if(edad <= (resto+18))
                edad = (resto+18) + (int) (Math.random() * 5-1) + 1;
            principal[i][3] = String.valueOf(edad);
        }
    }
    
    public static void generarPenas(String principal[][], int filas){//Generar los años de pena
        int pena = 0;
        int AnioIngreso = 0;
        int resto = 0;
        String AnioIngresoaux = null;
        LocalDate fechaActual = LocalDate.now();
        int AnioActual = fechaActual.getYear();
        for (int i = 0; i < filas; i++) {
            pena = (int) (Math.random() * 30) + 1;//Pena maxima en Ecuador es 50 años
            AnioIngresoaux = principal[i][5].substring(6);//String
            AnioIngreso = Integer.valueOf(AnioIngresoaux);//Entero
            resto = AnioActual - AnioIngreso;
            if(pena <= resto)//Nunca van a salir penas incoherentes 
                pena = resto + (int) (Math.random() * 5) + 2;
            
            principal[i][4] = String.valueOf(pena);
        }
    }
    
    public static void generarFechasIngreso(String principal[][], int filas){ //Generar las fechas de ingreso de los PPL
        int dia = 0;
        int mes = 0;
        int anio = 0;
        LocalDate fechaActual = LocalDate.now();
        Random rand = new Random();
        int anioActual = fechaActual.getYear();
        for (int i = 0; i < filas; i++) {
            dia = (int) (Math.random() * 31) + 1;
            mes = (int) (Math.random() * 12) + 1;
            anio = rand.nextInt(Integer.valueOf(anioActual)- 1980 + 1) + 1980;
            if((dia < 10)&&(mes < 10))
                principal[i][5] = "0" + String.valueOf(dia) + "/0" + String.valueOf(mes) + "/" + String.valueOf(anio);
            else if(dia < 10)
                principal[i][5] = "0" + String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(anio);
            else if(mes < 10)
                principal[i][5] = String.valueOf(dia) + "/0" + String.valueOf(mes) + "/" + String.valueOf(anio);
            else
                principal[i][5] = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(anio);
        }
    }
    
    public static void generarFechasSalida(String principal[][], int filas){ //Generar las fechas de salida de los PPL
        String dia = null;
        String mes = null;
        String anioIngreso = null;
        String pena = null;
        int anioSalida = 0;
        for (int i = 0; i < filas; i++) {
            dia = principal[i][5].substring(0, 2);
            mes = principal[i][5].substring(3, 5);
            anioIngreso = principal[i][5].substring(6);
            pena = principal[i][4].substring(0);
            anioSalida = Integer.valueOf(anioIngreso)+Integer.valueOf(pena);
            principal[i][6] = dia + "/" + mes + "/" + String.valueOf(anioSalida);
        }
    }
    
    public static void generarAniosRestantes(String principal[][], int filas){
        String aniosalida = null;
        int anioActual = 0;
        LocalDate fechaActual = LocalDate.now();
        anioActual = fechaActual.getYear();
        int aniosRestantes = 0;
        for (int i = 0; i < filas; i++) {
            aniosalida = principal[i][6].substring(6);
            aniosRestantes = Integer.valueOf(aniosalida) - anioActual;
            principal[i][7] = String.valueOf(aniosRestantes);
        }
    }
    
    public static void generarClasificacion(String principal[][], int filas){//Generar la clasificacion segun sus delitos
            for (int i = 0; i < filas; i++) {
            if((i>=0)&&(i<80))
                principal[i][10] = "Alto";
            else if((i>=80)&&(i<440))
                principal[i][10] = "Medio";
            else if((i>=440)&&(i<=799))
                principal[i][10] = "Bajo";
        }
    }
    
    public static void generarPabellon(String principal[][], int filas){//Generar su respectivo pabellon
        String medianaPeligrosidad[] = {"2(B)","3(C)"};
        String bajaPeligrosidad[] = {"4(D)","5(E)"};
        for (int i = 0; i < filas; i++) {
            if((i>=0)&&(i<80)&&(principal[i][10].equals("Alto")))
                principal[i][8] = "1(A)";
            else if((i>=80)&&(i<260)&&(principal[i][10].equals("Medio")))
                principal[i][8] = "2(B)";
            else if((i>=260)&&(i<440)&&(principal[i][10].equals("Medio")))
                principal[i][8] = "3(C)";
            else if((i>=440)&&(i<620)&&(principal[i][10].equals("Bajo")))
                principal[i][8] = "4(D)";
            else if((i>=620)&&(i<=799)&&(principal[i][10].equals("Bajo")))
                principal[i][8] = "5(E)";
        }
    }
    
    public static void generarCelda(String principal[][], int filas){//Generar su respectiva celda - en funcion al pabellon
        int cont = 0;//Hay varios ciclos porque las celdas tienen nombre diferente por cada pabellon.
        for (int i = 0; i < 40; i++) {
            principal[i][9] = "A"+String.valueOf(cont+1);
            cont++;
        }
        cont = 0;
        for (int i = 40; i < 80; i++) {
            principal[i][9] = "A"+String.valueOf(cont+1);
            cont++;
        }
        cont = 0;
        for (int i = 80; i < 170; i++) {
            principal[i][9] = "B"+String.valueOf(cont+1);
            cont++;
        }
        cont = 0;
        for (int i = 170; i < 260; i++) {
            principal[i][9] = "B"+String.valueOf(cont+1);
            cont++;
        }
        cont = 0;
        for (int i = 260; i < 350; i++) {
            principal[i][9] = "C"+String.valueOf(cont+1);
            cont++;
        }
        cont = 0;
        for (int i = 350; i < 440; i++) {
            principal[i][9] = "C"+String.valueOf(cont+1);
            cont++;
        }
        cont = 0;
        for (int i = 440; i < 530; i++) {
            principal[i][9] = "D"+String.valueOf(cont+1);
            cont++;
        }
        cont = 0;
        for (int i = 530; i < 620; i++) {
            principal[i][9] = "D"+String.valueOf(cont+1);
            cont++;
        }
        cont = 0;
        for (int i = 620; i < 710; i++) {
            principal[i][9] = "E"+String.valueOf(cont+1);
            cont++;
        }
        cont = 0;
        for (int i = 710; i <= 799; i++) {
            principal[i][9] = "E"+String.valueOf(cont+1);
            cont++;
        }
    }
    
    public static void generarVisita(String principal[][], int filas){//Generar las horas de visita a la semana
        int horas = 0;
        for (int i = 0; i < filas; i++) {
            if(principal[i][10].equals("Alto"))//Las horas van de acuerdo a la clasificacion
                horas = 1;
            else if(principal[i][10].equals("Medio"))
                horas = 2;
            else if(principal[i][10].equals("Bajo"))
                horas = 4;
            principal[i][11] = String.valueOf(horas);
        }
    }
    
    public static void generardelitos(String principal[][], int filas){//Generar el delito cometido
        int indAleatorio = 0;
        Random rand = new Random();
        String delitosA[]={"Narcotrafico", "Homicidio"};
        String delitosM[]={"Robo", "Hurto", "Fraude", "Evacion"};
        String delitosB[]={"Invasion", "Amenazas", "Estafa", "Otros"};
        for (int i = 0; i < filas; i++) {
            if(principal[i][10].equals("Alto")){
                indAleatorio = rand.nextInt((delitosA.length-1)- 0 + 1) + 0;
                principal[i][12] = delitosA[indAleatorio];
            }else if(principal[i][10].equals("Medio")){
                indAleatorio = rand.nextInt((delitosM.length-1)- 0 + 1) + 0;
                principal[i][12] = delitosM[indAleatorio];
            }else if(principal[i][10].equals("Bajo")){
                indAleatorio = rand.nextInt((delitosB.length-1)- 0 + 1) + 0;
                principal[i][12] = delitosB[indAleatorio];
            }
        }
    }
}