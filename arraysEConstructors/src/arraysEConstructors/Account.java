package arraysEConstructors;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;


public class Account {
	String clientName;
	int clientAge;
	
	static List<String> clients = new ArrayList<>();
	
	
	
	public Account(String name, int age){
		this.clientName = name;
		this.clientAge = age;
		
		clients.add(this.clientName);
	
	}
	
	public static void displayClients() {
		System.out.println("Lista de clientes:");
		for(String client : clients) {
			System.out.println(client);
		}
	}
	
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog(null, "Qual seu nome?");
		int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));
		
		Account client = new Account(name, age);
		
		System.out.println("O nome do cliente é: "+client.clientName);
		System.out.println("A idade do cliente é: "+client.clientAge);
		Account.displayClients();
	}
}
