
   import java.util.ArrayList;
   import java.util.Collections;
   import java.util.List;

    public class Mod_11_Lists {

public static void main(String args[])
    {
    ListaordemAlfabetica();
    Listaagrupamento();
    }
public static void ListaordemAlfabetica(){
    System.out.println("|***************|Parte 1|***************|");

    List<String>Lista = new ArrayList();
    Lista.add("Alberto Nobrega");
    Lista.add("Carlos Aberto");
    Lista.add("Ribeiro Machado");
    Lista.add("Toninho Silva");
    Lista.add("Bruno Perini");
    Collections.sort(Lista);
    System.out.println(Lista);
    System.out.println("");
    }
public static void Listaagrupamento(){
    System.out.println("|***************|Parte 2|***************|");
    System.out.println("                                                   ");

    List<Paciente> lista = new ArrayList<Paciente>();
    Paciente a = new Paciente("Joana","F");
    Paciente b = new Paciente("João","M");
    Paciente c = new Paciente("Jailson","M");
    Paciente f = new Paciente("Jane","F");
    Paciente d = new Paciente("Janaina","F");
    Paciente z = new Paciente("Jair","M");
    lista.add(a);
    lista.add(b);
    lista.add(c);            //é normal passar 3 horas fazendo um código?resposta sincera pfvr
    lista.add(f);
    lista.add(d);
    lista.add(z);
    System.out.println("|**********|Antes da divisão por grupos|**********|");
    System.out.println(lista);

    System.out.println("                                                   ");
    Collections.sort(lista);

    System.out.println("|**********|Depois da divisão por grupos|**********|");
    System.out.println(lista);
}
}
