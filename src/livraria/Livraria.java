package livraria;

import java.util.Scanner;

public class Livraria {

    public static void main(String[] args) {
       Book b1=new Book();
       b1.setTitle("BroCode");
       
       Author a1=new Author();
       a1.setName("Barney Stinson");
       b1.setAuthor(a1);
       
       Publisher p1=new Publisher();
       p1.setName("Suit Literature");
       b1.setPublisher(p1);
       
       User user1=new User();
       user1.setName("Ted");
       User edi=new Editorial();
       User cust=new Customer();
       
       Shipper entrega = new Shipper();
       ShippingInfo entregaInfo = new ShippingInfo();
       entregaInfo.setShipper(entrega);
       
       Account user1Acc = new Account();
       user1.setAccount(user1Acc);
       user1Acc.setId(1);
       user1Acc.setPassword("42");
       user1Acc.setEmailAddress("MosblyT@gmail.com");
       
       BillingInfo compraInfo = new BillingInfo();
       compraInfo.setAccount(user1Acc);
       
       Order compra1=new Order();
       compra1.setUser(user1);
       compra1.setBook(b1);
       compra1.setShippingInfo(entregaInfo);
       compra1.setBillingInfo(compraInfo);
       
       if(compra1.isFullFilled()){
           Scanner scanner;
           long id = 0;
           String psw="";
           try{
               scanner= new Scanner(System.in);
               System.out.println("Insira o ID:");
               id=scanner.nextLong();
               
               System.out.println("Insira a password:");
               psw=scanner.next();
           }catch(Exception e){
               e.printStackTrace();
           }
           if(compra1.getBillingInfo().getAccount().validateLogin(id, psw)){
               System.out.println("Compra realizada com sucesso");
               System.out.println("Livro comprado: "+b1.getTitle());
               System.out.println("Autor do livro: "+b1.getAuthor().getName());
               System.out.println("Publicadora do livro: "+b1.getPublisher().getName());
               System.out.println("Nome do usuário: "+user1.getName());
           }
           else{
               System.out.println("Não foi possível realizar a compra");
           }
           
       }
    }
}
        /*
        Criar um Livro
        Criar um Autor e vincular ao livro
        Criar um Publicador e vincular ao livro
        Criar um Usuário(Editorial/Consumidor) e vincular a ordem de compra
        Criar um Entregador
        Criar InformaçõesDeEntrega e vincular Entregador
        Criar uma conta com validação de senha
        Criar uma classe de Informações de Conta e vincular a Conta
        Criar uma ordem de compra
        Vincular tudo acima = Ter objeto de venda 
        */
