import java.util.*;
class Person {
    String name;
    int age;
    char bearth;
    int ticketid;
    Person(String name, int age,char bearth,int ticketid) {
        this.name = name;
        this.age = age;
        this.bearth=bearth;
        this.ticketid=ticketid;
    }

}
public class Railway_Management {
    static Scanner s=new Scanner(System.in);
    static void menu(ArrayList<Person> bookedlist,ArrayList<Person> availlist,int id,ArrayList<Integer> tickets,ArrayList<Person> raclist,ArrayList<Person> wlist){
       System.out.println("book [1]");
       System.out.println("Cancel [2]");
       System.out.println("ViewBooked [3]");
       System.out.println("Available [4]");
       System.out.println("exit [5]");
       System.out.println("enter your choice");
       int req = s.nextInt();
        s.nextLine(); 
       switch(req){
        case 1:
            booking(bookedlist,availlist,id,tickets,raclist,wlist);
            break;
        case 2:
            cancelling(bookedlist,availlist,id,tickets,raclist,wlist);
            break;
        case 3:
            viewbooking(bookedlist,availlist,id,tickets,raclist,wlist);
            break;
        case 4:
            viewavail(bookedlist,availlist,id,tickets,raclist,wlist);
            break;
        case 5:
            System.exit(0);
            break;
        default:
            System.out.println("no such options");
       }
        }
         static void booking(ArrayList<Person> bookedlist,ArrayList<Person> availlist,int id,ArrayList<Integer> tickets,ArrayList<Person> raclist,ArrayList<Person> wlist){
            id++;
    System.out.println("enter the name of the passenger");
    String name = s.nextLine();
    System.out.println("enter the age of the passenger");
    int age = s.nextInt();
     System.out.println("enter the prefered Breath");
    char bearth = s.next().charAt(0);
    s.nextLine();
    if(bearth=='u'){
        if(tickets.get(0)!=0){
            bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("preferred Bearth Given");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(0)-1;
            tickets.set(0,c);
        }
        else if(tickets.get(1)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("M Breath assigned");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(1)-1;
            tickets.set(1,c);
        }
        else if(tickets.get(2)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("L Breath assigned");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(2)-1;
            tickets.set(2,c);
        }
          else if(tickets.get(3)!=0){
             bearth='R';
              raclist.add(new Person(name,age,bearth,id));
            System.out.println("RAC assigned");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(3)-1;
            tickets.set(3,c);

        }
           else if(tickets.get(4)!=0){
            bearth='W';
             wlist.add(new Person(name,age,bearth,id));
            System.out.println("WL assigned");
            System.out.println("-------------Booking succeed");
             int c= tickets.get(4)-1;
            tickets.set(4,c);
        }
        else{
            System.out.println("No Tickets Available");
              menu(bookedlist,availlist,id,tickets,raclist,wlist);
        }
    }
    if(bearth=='m'){
        if(tickets.get(1)!=0){
            bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("preferred Bearth Given");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(1)-1;
            tickets.set(1,c);
        }
        else if(tickets.get(0)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("preferred Bearth Given");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(0)-1;
            tickets.set(0,c);
            
        }
        else if(tickets.get(2)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("L Breath assigned");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(2)-1;
            tickets.set(2,c);
        }
          else if(tickets.get(3)!=0){
            bearth='R';
             raclist.add(new Person(name,age,bearth,id));
            System.out.println("RAC assigned");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(3)-1;
            tickets.set(3,c);
        }
        else if(tickets.get(4)!=0){
            bearth='W';
              wlist.add(new Person(name,age,bearth,id));
            System.out.println("WL assigned");
            System.out.println("-------------Booking succeed");
             int c= tickets.get(4)-1;
            tickets.set(4,c);
        }
        else{
            System.out.println("No Tickets Available");
        }
        
    }
     if(bearth=='l'){
        if(tickets.get(2)!=0){
            bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("preferred Bearth Given");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(2)-1;
            tickets.set(2,c);
        }
        else if(tickets.get(0)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("preferred Bearth Given");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(0)-1;
            tickets.set(0,c);
            
        }
        else if(tickets.get(1)!=0){
              bookedlist.add(new Person(name,age,bearth,id));
            System.out.println("L Breath assigned");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(1)-1;
            tickets.set(1,c);
        }
          else if(tickets.get(3)!=0){
             bearth='R';
                   raclist.add(new Person(name,age,bearth,id));
            System.out.println("RAC assigned");
            System.out.println("-------------Booking succeed");
            int c= tickets.get(3)-1;
            tickets.set(3,c);
        }
        else if(tickets.get(4)!=0){
            bearth='W';
             wlist.add(new Person(name,age,bearth,id));
            System.out.println("WL assigned");
            System.out.println("-------------Booking succeed");
             int c= tickets.get(4)-1;
            tickets.set(4,c);
        }
      else{
            System.out.println("No Tickets Available");
        } 
    }
    menu(bookedlist,availlist,id,tickets,raclist,wlist);
 }
   static void cancelling(ArrayList<Person> bookedlist,ArrayList<Person> availlist,int id,ArrayList<Integer> tickets,ArrayList<Person> raclist,ArrayList<Person> wlist){
   System.out.print("enter the ID of the passenger to cancel  :");
    int iid = s.nextInt();
    for(int i=0;i<bookedlist.size();i++){
        if( bookedlist.get(i).ticketid==iid){
           bookedlist.remove(i);
           break;
        }
    }
    int a=0;
    if(tickets.get(0)!=1){
        int c=tickets.get(0)+1;
        tickets.set(0,c);
        a=1;
    }
    else if(tickets.get(1)!=1){
        int c=tickets.get(1)+1;
        tickets.set(0,c);
        a=2;
    }
    else{
       int c=tickets.get(2)+1;
       tickets.set(2,c);
       a=3;
    }
    if(tickets.get(3)!=1){
        id++;
        if(a==1){
         raclist.get(0).bearth='u';
         bookedlist.add(raclist.get(0));
         raclist.remove(0);
        }
        else if(a==2){
            raclist.get(0).bearth='m';
         bookedlist.add(raclist.get(0));
         raclist.remove(0);
        }
         else{
            raclist.get(0).bearth='l';
         bookedlist.add(raclist.get(0));
         raclist.remove(0);
        }
        if(tickets.get(4)!=1){
          wlist.get(0).bearth='R';
          raclist.add(wlist.get(0));
         wlist.remove(0);
        }
    }
     menu(bookedlist,availlist,id,tickets,raclist,wlist);
   }

 static void viewbooking(ArrayList<Person> bookedlist,ArrayList<Person> availlist,int id,ArrayList<Integer> tickets,ArrayList<Person> raclist,ArrayList<Person> wlist){
   for(int i=0;i<bookedlist.size();i++){
    System.out.println("TicketID :"+bookedlist.get(i).ticketid);
    System.out.println("Name :"+bookedlist.get(i).name);
    System.out.println("Age :"+bookedlist.get(i).age);
    System.out.println("Breath :"+bookedlist.get(i).bearth);
    System.out.println("-----------------------------------------------");
   }
   if(raclist.size()>0){
    for(int i=0;i<raclist.size();i++){
          System.out.println("TicketID :"+raclist.get(i).ticketid);
    System.out.println("Name :"+raclist.get(i).name);
    System.out.println("Age :"+raclist.get(i).age);
    System.out.println("Breath :"+raclist.get(i).bearth);
    System.out.println("-----------------------------------------------");
    }
      if(wlist.size()>0){
    for(int i=0;i<wlist.size();i++){
          System.out.println("TicketID :"+wlist.get(i).ticketid);
    System.out.println("Name :"+wlist.get(i).name);
    System.out.println("Age :"+wlist.get(i).age);
    System.out.println("Breath :"+wlist.get(i).bearth);
    System.out.println("-----------------------------------------------");
    }
      }
   }
    menu(bookedlist,availlist,id,tickets,raclist,wlist);
 }
 static void viewavail(ArrayList<Person> bookedlist,ArrayList<Person> availlist,int id,ArrayList<Integer> tickets,ArrayList<Person> raclist,ArrayList<Person> wlist){
System.out.println(availlist);
   menu(bookedlist,availlist,id,tickets,raclist,wlist);
 }
    public static void main(String[] args) {
        ArrayList<Integer> tickets=new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        ArrayList<Person>bookedlist = new ArrayList<>();
         ArrayList<Person>availlist = new ArrayList<>();
         ArrayList<Person>raclist=new ArrayList<>();
         ArrayList<Person>wlist=new ArrayList<>();
 
    int id=0;
        menu(bookedlist,availlist,id,tickets,raclist,wlist);
    }
}
