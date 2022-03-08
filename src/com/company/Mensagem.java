package com.company;

public class Mensagem {
    public static void obterMensagem(int hora){
        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomdia();
                break;
            case 13:
            case 14:
            case 16:
            case 17:
                mensagemBoatarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
                mensagemBoanoite();
                break;
            default:
                System.out.println("Hora invalida.");
                break;
            }
        }
    public static void mensagemBomdia(){
        System.out.println("Bom dia");
    }

    public static void mensagemBoatarde(){
        System.out.println("Boa tarde");
    }

    public static void mensagemBoanoite(){
        System.out.println("Boa Noite");
    }




}
