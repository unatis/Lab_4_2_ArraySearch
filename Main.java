package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] Persons = new String[10];

        System.out.println("Please 10 people names and IDs: ");

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < Persons.length; i++){
            Persons[i] = scanner.nextLine();
        }

        int flgFound = -1;

        while(true){

            System.out.println("Please enter name to find : ");
            String Name = scanner.nextLine();

            if(!Name.equals("0")){

                for(int i = 0; i < Persons.length; i++){

                    if(Persons[i].equals(Name)){
                        flgFound = i;
                        break;
                    }
                }

                if(flgFound >= 0){
                    System.out.println("Name \"" + Name + "\" found at index " + flgFound);
                    flgFound = -1;
                }
                else{
                    System.out.println("Name \"" + Name + "\" not found");
                }

            }else{
                break;
            }
        }

        System.out.println("Exit");

    }

}
