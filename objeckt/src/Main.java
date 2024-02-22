
public class Main{
    public static void main(String[] args)
    {
       Person person = new Person();
       person.getismi("Baxodir");
       person.getfamiliyasi("Davirov");
       person.getyoshi(22);
       System.out.println("O'qish joyi: "+person.getuqish("Samarqand davlat Universiteti"));
    }
}